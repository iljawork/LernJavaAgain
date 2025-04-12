package main;

public class CardAccount extends BankAccount {
    private final double commission = 0.01;
    public CardAccount(double sumOnAccount) {
        super(sumOnAccount);
    }

    @Override
    public boolean take(double price) {
        return super.take(price + (price * commission));
    }
}
