package ir.javacup;

import ir.javacup.oop.Person;

public class Util {
    public static void main(String[] args) {
        Person p = new Person();
        p.married = true;
        p.name = "John";
        p.birthYear = 1992;
        int age = p.getAge();
        p.run();
        age = p.computeAge();
    }
}
