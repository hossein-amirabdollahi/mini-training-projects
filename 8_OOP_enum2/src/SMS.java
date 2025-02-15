import java.security.PrivateKey;

enum Status{SENT, DELIVERED, PENDING}
public class SMS {
    private Status status;
    private final String msg;
    private final String from, to;
    public SMS(String msg, String from, String to) {
        this.msg = msg;
        this.from = from;
        this.to = to;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public String toString() {
        return String.format("%s=>%s:%s(%s)", from, to, msg, status);
    }

    public static void main(String[] args) {
        SMS sms = new SMS("Hello", "0912", "0935");
        sms.setStatus(Status.DELIVERED);
        System.out.println(sms);
    }
}
