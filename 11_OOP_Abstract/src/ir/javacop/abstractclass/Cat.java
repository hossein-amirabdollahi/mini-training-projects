package ir.javacop.abstractclass;

public class Cat extends Animal {
    private static int counter = 0;
    public Cat(String name, String color) {
        super(name, color);
        counter++;
    }
    @Override
    public void makeSound() {
        System.out.println("Meeeeeeow...   Meeeooow... ");
    }

    @Override
    public void display() {
        System.out.println("\nCats name is: " + getName() + " and it's color is: " + getColor());
    }

    public void displayCatCount(){
        System.out.println("Number of Cats: "+counter);
    }

}
