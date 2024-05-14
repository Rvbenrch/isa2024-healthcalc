package main.java.healthcalc;

import healthcalc.HealthCalcImpl;

public class HealthAdapter implements HealthHospital {

    private HealthCalcImpl healthCalc;

    public HealthAdapter() {
        this.healthCalc = HealthCalcImpl.getInstance();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        // Convertir altura a metros y peso a kg
        altura /= 100; // Convertir altura de cm a metros
        float pesoKg = peso / 1000f; // Convertir peso de gramos a kg

        // Llamar al método correspondiente de HealthCalcImpl
        return healthCalc.basalMetabolicRate(pesoKg, (int) altura, genero, edad);
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        // Convertir altura a metros
        altura /= 100; // Convertir altura de cm a metros

        // Llamar al método correspondiente de HealthCalcImpl
        try {
            return (int) healthCalc.idealWeight((int) (altura * 100), genero);
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Manejo de error
        }
    }
}
