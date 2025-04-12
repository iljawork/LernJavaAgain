package main;

public class BankAccount {
    protected double balance;

    public BankAccount(double sumOnAccount) {
       this.balance = sumOnAccount;
    }

    public boolean take(double price ) {
        if (price > balance) {
            return false;
        }
        balance -= price;
        return true;
    }

    public boolean put(double sum) {
        if (sum < 0) {
            return false;
        }
        balance += sum;
        return true;
    }

    public double getAmount() {
        return balance;
    }
}
