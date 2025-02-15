package ir.javacop.abstractclass;

public abstract class Animal {
    private String name;
    private String color;
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void makeSound();
    public abstract void display();

    public static void main(String[] args) {
        Animal cat1 = new Cat("Qolombe", "Orange");
        Animal dog1 = new Dog("Holu", "Black");
        Animal cat2 = new Cat("Kolombe", "Orange");
        Animal dog2 = new Dog("Holu", "Black");

        Animal[] animals = {cat1, dog1, cat2, dog2};
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                animal.display();
                animal.makeSound();
                System.out.println(animal.getClass().getSimpleName());
            }
            else if (animal instanceof Cat) {
                animal.display();
                animal.makeSound();
                System.out.println(animal.getClass().getName());
            }
        }

    }
}
