public class MyClass {
    private int n;
    public MyClass(int n) {
        this.n = n;
    }

    public int myMethod() {
        try {
            switch (this.n){
                case 1:
                    System.out.println("One");
                    return 1;
                case 2:
                    System.out.println("Two");
                    this.trowMyException();
                case 3:
                    System.out.println("Three");
            }
            return 4;
        }catch (Exception e) {
            System.out.println("Catch");
            return 5;
        }finally {
            System.out.println("Finally");
            return 6;
        }
    }

    public void trowMyException() throws  Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        MyClass test = new MyClass(1);
        MyClass test2 = new MyClass(2);
        MyClass test3 = new MyClass(3);
        System.out.println(test.myMethod());
        System.out.println(test2.myMethod());
        System.out.println(test3.myMethod());
    }
}
