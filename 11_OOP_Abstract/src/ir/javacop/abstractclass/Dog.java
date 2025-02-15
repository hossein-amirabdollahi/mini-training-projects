package ir.javacop.abstractclass;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color);
    }
    @Override
    public void makeSound() {
        System.out.println("Baaark... Baark...");
    }

    @Override
    public void display() {
        System.out.println("\nDogs name is: " + getName() + " and it's color is: " + getColor());
    }
}
