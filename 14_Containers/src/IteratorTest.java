import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }


        long maxValue = Long.MAX_VALUE;
        int intExact = Math.toIntExact(maxValue);
        int maxIndex = (int) maxValue;
        System.out.println(intExact);

//        Iterator<Integer> iteratorVal = list.iterator();
//        while (iteratorVal.hasNext()) {
//            Integer val = iteratorVal.next();
//            if (val % 2 == 0) {
//                iteratorVal.remove();
//            }
//        }

//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                list.remove(i);
//            }
//        }

        list.removeIf(i -> i % 2 == 0);


        System.out.println(list.size());
        for (Integer val : list) {
            System.out.print(val + " ");
        }
    }
}
