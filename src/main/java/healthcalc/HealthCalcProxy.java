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

    private static class PatientData {
        char gender;
        int age;
        float height; // in cm
        float weight; // in kg
        float bmr;

        public PatientData(char gender, int age, float height, float weight, float bmr) {
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.bmr = bmr;
        }
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
        return (float) patientDataList.stream().mapToDouble(pd -> pd.height).average().orElse(0);
    }

    @Override
    public float pesoMedio() {
        return (float) patientDataList.stream().mapToDouble(pd -> pd.weight).average().orElse(0);
    }

    @Override
    public float edadMedia() {
        return (float) patientDataList.stream().mapToInt(pd -> pd.age).average().orElse(0);
    }

    @Override
    public float bmrMedio() {
        return (float) patientDataList.stream().mapToDouble(pd -> pd.bmr).average().orElse(0);
    }

    @Override
    public int numSexoH() {
        return (int) patientDataList.stream().filter(pd -> pd.gender == 'M').count();
    }

    @Override
    public int numSexoM() {
        return (int) patientDataList.stream().filter(pd -> pd.gender == 'W').count();
    }

    @Override
    public int numTotalPacientes() {
        return patientDataList.size();
    }
}
