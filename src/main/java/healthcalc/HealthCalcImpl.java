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
        Character sexo = Character.toUpperCase(gender);
        if (sexo != 'W' && sexo != 'M') {
            throw new IllegalArgumentException("No se acepta una entrada distinta de 'W' (Woman) o 'M' (Men)");
        } else if (height > 260) {
            throw new IllegalArgumentException("Valor excesivamente grande para la entrada de la altura, recuerde que está en cm");
        } else {
            if (sexo == 'M') {
                if (height >= 110) {
                    return height - 100 - (height - 150) / 4f;
                }
            } else {
                if (height >= 100) {
                    return height - 100 - (height - 150) / 2.5f;
                }
            }
            throw new IllegalArgumentException("La altura es demasiado pequeña, recuerda que se introduce en centímetros.");
        }
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        if (20 > weight || weight > 650) {
            throw new IllegalArgumentException("No se aceptarán valores que salgan del rango (20Kg, 650Kg)");
        } else if (height < 40 || height > 275) {
            throw new IllegalArgumentException("No se van a aceptar valores que salgan del rango (40cm, 275cm)");
        } else {
            Character sexo = Character.toUpperCase(gender);
            if (sexo != 'W' && sexo != 'M') {
                throw new IllegalArgumentException("Valor de sexo incorrecto (solo se aceptarán valores correspondientes a 'M' y 'W')");
            } else if (0 > age || age > 100) {
                throw new IllegalArgumentException("Edad incorrecta (solo se aceptarán valores dentro del umbral 0<X<100 años)");
            } else if (sexo == 'M') {
                float BMR = 10 * weight + 6.25f * height - 5 * age + 5;
                if (BMR > 0) {
                    return BMR;
                } else {
                    throw new IllegalArgumentException("Valores introducidos no son adecuados para el cálculo");
                }
            } else {
                float BMR = 10 * weight + 6.25f * height - 5 * age - 161;
                if (BMR > 0) {
                    return BMR;
                } else {
                    throw new IllegalArgumentException("Valores introducidos no son adecuados para el cálculo");
                }
            }
        }
    }
}
