import java.util.ArrayList;
import java.util.List;

public class ConModEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String s : list) {
            if(s.equals("A")) {
                list.remove(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
