public class ParameterPassing {
    public static void main(String[] args) {
        int [] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        changingParameter(array);
        System.out.println(array[2]);
    }
    private static void changingParameter(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            a[i] = 5;
//        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println(a[2]);
    }
}
