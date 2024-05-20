package bankmangmentproject;

/**
 * @author MD KUTUB UDDIN
 */
public class BankAccount {

    private double balance;

    public BankAccount() {
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Tk " + amount);
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn  : Tk " + amount);
            System.out.println("Current Balance : " + balance);

        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance : Tk " + balance);
    }
}
