interface Protocol {
    void behavior();
}

public class Anonymous {
    public static void main(String[] args) {
        Protocol protocol = new Protocol() {
            public void behavior() {
                System.out.println("Anonymous behavior");
            }
        };
        protocol.behavior();
    }
}
