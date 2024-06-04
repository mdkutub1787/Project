package bankmangmentproject;

public abstract class BankAccount {

    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);



    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

}
