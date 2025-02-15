public class HeapGame {
    public static void main(String[] args) {
//        int[] arr = new int[Integer.MAX_VALUE/5];
//        System.out.println(arr.length);

        System.out.println(f(0));
    }
    public static int f(int n) {
        if (n < 30_000){
            return f(n + 1);
        }
        return 100;
    }
}
