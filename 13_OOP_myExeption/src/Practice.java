import java.io.IOException;

class myException extends Exception{
    public myException(){
        super();
    }
    public myException(String msg){
        super(msg);
    }
}

public class Practice {
    private int a;
    public Practice(int a){
        this.a = a;
    }
    public void print() throws myException, IOException {
        if (this.a == 0){
            throw new myException("Zero Exception");
        }
        if (this.a < 0){
            throw new IOException("Negative Number");
        }
        System.out.println(this.a);
    }

    public static void f(int n) throws IOException {
        if (n == 0){
            throw new Error("Zero Exception");
        }
        if (n < 0){
            throw new NullPointerException("Negative Number");
        }
        if (n == 1){
            throw new RuntimeException("Zero Exception");
        }
        if (n == 2){
            throw new ArithmeticException("Zero Exception");
        }
        if (n == 3){
            throw new IOException("Error");
        }
    }

    public static void main(String[] args) {
        Practice p = new Practice(5);
        Practice p2 = new Practice(0);
        Practice p3 = new Practice(-3);

        try{
            p.print();
            p2.print();
            p3.print();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("End");
    }
}
