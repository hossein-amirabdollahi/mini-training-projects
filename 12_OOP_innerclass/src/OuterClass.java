public class OuterClass {
    private int value = 2;
    class InnerClass {
        public void innerMethod() {
            value = 65;
        }
    }
    public void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.value);
        outer.outerMethod();
        System.out.println(outer.value);

    }
}
