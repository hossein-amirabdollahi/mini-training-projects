import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }
        if (list.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println(list.size());
            if (list.contains("Hossein")) {
                System.out.println("List has Hossein!!!");
            }
            for (String s : list) {
                System.out.print(s + " ");
            }
        }
    }

}
