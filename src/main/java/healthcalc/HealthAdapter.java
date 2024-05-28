package main.java.healthcalc;

import healthcalc.HealthCalcImpl;

public class HealthAdapter implements HealthHospital {

    private HealthCalcImpl healthCalc;

    public HealthAdapter() {
        this.healthCalc = HealthCalcImpl.getInstance();
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        float alturaEnMetros = convertirAlturaAMetros(altura);
        float pesoKg = convertirPesoAKg(peso);

        return healthCalc.basalMetabolicRate(pesoKg, (int) alturaEnMetros, genero, edad);
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        float alturaEnMetros = convertirAlturaAMetros(altura);
        try {
            return (int) healthCalc.idealWeight((int) (alturaEnMetros * 100), genero);
        } catch (Exception e) {
            manejarError(e);
            return -1;
        }
    }

    private float convertirAlturaAMetros(float altura) {
        return altura / 100;
    }

    private float convertirPesoAKg(int peso) {
        return peso / 1000f;
    }

    private void manejarError(Exception e) {
        e.printStackTrace();
    }
}
