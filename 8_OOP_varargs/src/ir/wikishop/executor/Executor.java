package ir.wikishop.executor;
import ir.wikishop.varargs.PrintTesting;

public class Executor {
    public static void main(String[] args) {
        PrintTesting testing = new PrintTesting();
        testing.print("Hello World", "hasan", "ali", "Hossein");
        PrintTesting.printing("Hossein", "Ali", "Reza", "Mohammad");
    }
}
