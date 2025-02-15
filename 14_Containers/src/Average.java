import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Student, Double> scores = new HashMap<>();
        while (true) {
            System.out.print("Enter student name: ");
            String name = sc.next();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            Student student = new Student(name, 12, 25);
            System.out.print("Enter score: ");
            Double score = sc.nextDouble();
            scores.put(student, score);
        }

        Double sum = 0.0;
        for (Student student : scores.keySet()) {
            System.out.println("Student name: " + student.getName() + ", score: " + scores.get(student));
        }
        for (Double score : scores.values()) {
            sum += score;
        }
        System.out.println("Average score: " + sum / scores.size());

    }
}
