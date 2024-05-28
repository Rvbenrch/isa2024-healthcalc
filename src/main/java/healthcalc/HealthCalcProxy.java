package main.java.healthcalc;

import java.util.ArrayList;
import java.util.List;

public class HealthCalcProxy implements HealthCalc, HealthStats {
    private HealthCalc healthCalc;
    private List<PatientData> patientDataList;

    public HealthCalcProxy(HealthCalc healthCalc) {
        this.healthCalc = healthCalc;
        this.patientDataList = new ArrayList<>();
    }

    @Override
    public float idealWeight(int height, char gender) throws Exception {
        return healthCalc.idealWeight(height, gender);
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        float bmr = healthCalc.basalMetabolicRate(weight, height, gender, age);
        patientDataList.add(new PatientData(gender, age, height, weight, bmr));
        return bmr;
    }

    @Override
    public float alturaMedia() {
        return PatientData.calcularAlturaMedia(patientDataList);
    }

    @Override
    public float pesoMedio() {
        return PatientData.calcularPesoMedio(patientDataList);
    }

    @Override
    public float edadMedia() {
        return PatientData.calcularEdadMedia(patientDataList);
    }

    @Override
    public float bmrMedio() {
        return PatientData.calcularBmrMedio(patientDataList);
    }

    @Override
    public int numSexoH() {
        return PatientData.contarSexo(patientDataList, 'M');
    }

    @Override
    public int numSexoM() {
        return PatientData.contarSexo(patientDataList, 'W');
    }

    @Override
    public int numTotalPacientes() {
        return patientDataList.size();
    }
}
