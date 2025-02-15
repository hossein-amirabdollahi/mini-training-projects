public class OuterClass {
    private int value = 2;
    class InnerClass {
        public void valueChanger(){
            OuterClass.this.value = 5;
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.value);
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.valueChanger();
        System.out.println(outer.value);
    }
}
