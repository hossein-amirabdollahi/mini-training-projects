public class Banking {
    public static void main(String[] args) {
        System.out.println("Welcome to Bank");
        BankAccount account1 = new BankAccount();
        account1.deposit(-100);
        System.out.println(account1.getBalance());
    }
}

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
}

