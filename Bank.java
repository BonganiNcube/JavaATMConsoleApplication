public abstract class Bank {
    protected double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void checkBalance();
}
