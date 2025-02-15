public class Quiz {
    public int number = f();
    private int f() {
        System.out.print("Inline initialize the number:");
        return 1;
    }

    {System.out.print("Initialization block the number:");
        number = 2;}

    public Quiz() {
        System.out.print("No args constructor the number:");
        number = 3;
    }

    public Quiz(int num) {
        System.out.print("One args constructor the number:");
        number = num;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println(quiz.number);
        quiz = new Quiz();
        System.out.println(quiz.number);
        quiz = new Quiz(6);
        System.out.println(quiz.number);
    }

}
