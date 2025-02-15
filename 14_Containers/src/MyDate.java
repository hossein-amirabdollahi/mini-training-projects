import java.util.Date;



public class MyDate  {

    public static void main(String[] args) {
        Date date = new Date(2015, 10, 1);
        Date date2 = new Date(2013, 10, 3);
        Date date3 = new Date(2013, 10, 3);

        System.out.println(date.compareTo(date2));
        System.out.println(date2.compareTo(date));
        System.out.println(date2.compareTo(date3));
    }

}
