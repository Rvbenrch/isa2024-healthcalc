package healthcalc;

public class HealthCalcImpl implements HealthCalc {
    // Instancia única de HealthCalcImpl
    private static HealthCalcImpl instance;

    // Constructor privado para evitar instanciación
    private HealthCalcImpl() {}

    // Método para obtener la instancia única
    public static HealthCalcImpl getInstance() {
        if (instance == null) {
            instance = new HealthCalcImpl();
        }
        return instance;
    }

    @Override
    public float idealWeight(int height, char gender) throws Exception {
        validateHeight(height);
        validateGender(gender);
        return calculateIdealWeight(height, gender);
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        validateWeight(weight);
        validateHeight(height);
        validateGender(gender);
        validateAge(age);

        Person person = new Person(weight, height, gender, age);
        return calculateBMR(person);
    }

    private void validateHeight(int height) throws IllegalArgumentException {
        if (height > 260) {
            throw new IllegalArgumentException("Valor excesivamente grande para la entrada de la altura, recuerde que está en cm");
        } else if (height < 100) {
            throw new IllegalArgumentException("La altura es demasiado pequeña, recuerda que se introduce en centímetros.");
        }
    }

    private void validateWeight(float weight) throws IllegalArgumentException {
        if (20 > weight || weight > 650) {
            throw new IllegalArgumentException("No se aceptarán valores que salgan del rango (20Kg, 650Kg)");
        }
    }

    private void validateGender(char gender) throws IllegalArgumentException {
        char sexo = Character.toUpperCase(gender);
        if (sexo != 'W' && sexo != 'M') {
            throw new IllegalArgumentException("No se acepta una entrada distinta de 'W' (Woman) o 'M' (Men)");
        }
    }

    private void validateAge(int age) throws IllegalArgumentException {
        if (0 > age || age > 100) {
            throw new IllegalArgumentException("Edad incorrecta (solo se aceptarán valores dentro del umbral 0<X<100 años)");
        }
    }

    private float calculateIdealWeight(int height, char gender) {
        char sexo = Character.toUpperCase(gender);
        if (sexo == 'M') {
            return height - 100 - (height - 150) / 4f;
        } else {
            return height - 100 - (height - 150) / 2.5f;
        }
    }

    private float calculateBMR(Person person) throws IllegalArgumentException {
        float BMR;
        char sexo = Character.toUpperCase(person.getGender());
        if (sexo == 'M') {
            BMR = 10 * person.getWeight() + 6.25f * person.getHeight() - 5 * person.getAge() + 5;
        } else {
            BMR = 10 * person.getWeight() + 6.25f * person.getHeight() - 5 * person.getAge() - 161;
        }

        if (BMR > 0) {
            return BMR;
        } else {
            throw new IllegalArgumentException("Valores introducidos no son adecuados para el cálculo");
        }
    }
}
