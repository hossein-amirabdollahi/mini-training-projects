package ir.javacup.oop;

public class Person {
    public String name;
    private int birthYear;
    boolean married;
    void run() {}
    private int computeAge() {
        return 2024-birthYear;
    }
    public int getAge() {
        return computeAge();
    }
}
