import java.util.Scanner;

public class Quiz {
    static int sum(Integer... numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
    static int sum(String a , String b) {
        Integer[] values =
                {Integer.valueOf(a),Integer.valueOf(b)};
        return sum(values);
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, new Integer(4)));
        System.out.println(sum("1", "2"));
//        System.out.println(sum("One", "Two"));
    }
}
