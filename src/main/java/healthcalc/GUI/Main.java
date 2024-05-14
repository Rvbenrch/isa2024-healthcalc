package program.gui;
import healthcalc.*;
import java.awt.EventQueue;
import healthcalc.HealthCalcImpl;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    View vista = new View();
                    Controller controlador = new Controller(vista);
                    vista.registrarControlador(controlador);
                    vista.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
