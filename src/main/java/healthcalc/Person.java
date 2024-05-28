package healthcalc;
public class Person {
    private float weight;
    private int height;
    private char gender;
    private int age;

    // Constructor
    public Person(float weight, int height, char gender, int age) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.age = age;
    }

    // Getters
    public float getWeight() { return weight; }
    public int getHeight() { return height; }
    public char getGender() { return gender; }
    public int getAge() { return age; }
}
