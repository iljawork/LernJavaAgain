package main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount{
    private static LocalDate lastIncome;


    public DepositAccount(double sumOnAccount) {
        super(sumOnAccount);
    }

    @Override
    public boolean put(double amount) {
        if (amount > 0) {
            balance += amount;
            lastIncome = LocalDate.now();
            return true;
        }
        return false;
    }

    private boolean isMonthPassed() {
        if (lastIncome == null) {
            return false;
        }
        LocalDate today = LocalDate.now();
        return ChronoUnit.MONTHS.between(lastIncome, today) >= 1;
    }

    @Override
    public boolean take(double amount) {
        if (balance > 0 && amount <= balance && isMonthPassed()) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
