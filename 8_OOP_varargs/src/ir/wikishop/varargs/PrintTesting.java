package ir.wikishop.varargs;

public class PrintTesting {
    public void print(String... params) {
        String[] arr = params;
        System.out.println(arr.length);
        for (String param : arr) {
            System.out.println(param);
        }
    }

    public static void printing(String... params) {
        String[] array = params;
        System.out.println(array.length);
        for (String param : array) {
            System.out.println(param);
        }
    }

    public static void main(String[] args) {
        printing("Hossein", "Ali", "Narges");
        PrintTesting test = new PrintTesting();
        test.print("12", "33", "98");
    }
}

