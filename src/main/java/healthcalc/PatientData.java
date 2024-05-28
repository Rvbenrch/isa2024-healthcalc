package main.java.healthcalc;

import java.util.List;

public class PatientData {
    private char gender;
    private int age;
    private float height; // in cm
    private float weight; // in kg
    private float bmr;

    public PatientData(char gender, int age, float height, float weight, float bmr) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bmr = bmr;
    }

    // Getters
    public char getGender() { return gender; }
    public int getAge() { return age; }
    public float getHeight() { return height; }
    public float getWeight() { return weight; }
    public float getBmr() { return bmr; }

    // Métodos de cálculo
    public static float calcularAlturaMedia(List<PatientData> patientDataList) {
        return (float) patientDataList.stream().mapToDouble(PatientData::getHeight).average().orElse(0);
    }

    public static float calcularPesoMedio(List<PatientData> patientDataList) {
        return (float) patientDataList.stream().mapToDouble(PatientData::getWeight).average().orElse(0);
    }

    public static float calcularEdadMedia(List<PatientData> patientDataList) {
        return (float) patientDataList.stream().mapToInt(PatientData::getAge).average().orElse(0);
    }

    public static float calcularBmrMedio(List<PatientData> patientDataList) {
        return (float) patientDataList.stream().mapToDouble(PatientData::getBmr).average().orElse(0);
    }

    public static int contarSexo(List<PatientData> patientDataList, char gender) {
        return (int) patientDataList.stream().filter(pd -> pd.getGender() == gender).count();
    }
}
