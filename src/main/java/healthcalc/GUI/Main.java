package program.gui;

import java.awt.EventQueue;


import program.HealthCalcImpl; // Importa correctamente HealthCalcImpl si está en un paquete diferente

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HealthCalcImpl healthCalc = new HealthCalcImpl(); // Crea una instancia de HealthCalcImpl
                    view vista = new view(); // Usa HealthCalcVista en lugar de view
                    Controller controlador = new Controller(healthCalc, vista);
                    vista.registrarControlador(controlador);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
