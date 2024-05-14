package program.gui;

import java.awt.EventQueue;
import healthcalc.HealthCalc;
import healthcalc.HealthCalcImpl;
import healthcalc.HealthCalcProxy;
import healthcalc.HealthCalcAdapter;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HealthCalc healthCalc = HealthCalcImpl.getInstance();
                    HealthCalcProxy healthCalcProxy = new HealthCalcProxy(healthCalc);
                    HealthCalcAdapter healthCalcAdapter = new HealthCalcAdapter(healthCalcProxy);

                    // Now use healthCalcAdapter in your application
                    View vista = new View();
                    Controller controlador = new Controller(vista, healthCalcAdapter);
                    vista.registrarControlador(controlador);
                    vista.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
