import java.util.Scanner;

public class ObjectMaker {
    private static int objectCounter;
    public ObjectMaker() {
        System.out.println("Object number: " + objectCounter++ + "created!");
    }

    public static void displayObjectCounter() {
        System.out.println("Object number: " + objectCounter);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Select the option number: ");
            System.out.println("1 - Create a new object");
            System.out.println("2 - Display the number of all objects");
            System.out.println("3 - Exit");

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            switch (option) {
                case 1:
                    ObjectMaker o = new ObjectMaker();
                    break;
                case 2:
                    displayObjectCounter();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
