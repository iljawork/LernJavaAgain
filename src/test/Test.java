package test;

import main.BankAccount;
import main.CardAccount;
import main.DepositAccount;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testPutPositiveAmount() {
        BankAccount account = new BankAccount(0);
        account.put(1000);
        assertEquals(1000, account.getAmount());
    }

    @Test
    void testPutNegativeAmount() {
        BankAccount account = new BankAccount(0);
        account.put(-500);
        assertEquals(0, account.getAmount()); // Счёт не должен измениться
    }

    @Test
    void testTakeSufficientBalance() {
        BankAccount account = new BankAccount(0);
        account.put(1000);
        account.take(300);
        assertEquals(700, account.getAmount());
    }

    @Test
    void testTakeInsufficientBalance() {
        BankAccount account = new BankAccount(0);
        account.put(200);
        account.take(500); // Попытка снять больше, чем есть
        assertEquals(200, account.getAmount()); // Баланс не должен измениться
    }
}

class CardAccountTest {

    @Test
    void testTakeWithCommission() {
        CardAccount account = new CardAccount(0);
        account.put(1000);
        account.take(100); // Должно списаться 101 (100 + 1%)
        assertEquals(899, account.getAmount());
    }

    @Test
    void testTakeInsufficientBalanceWithCommission() {
        CardAccount account = new CardAccount(0);
        account.put(100);
        account.take(100); // Нужно 101, но есть только 100 → снятие не пройдёт
        assertEquals(100, account.getAmount());
    }
}

class DepositAccountTest {

    @Test
    void testTakeBeforeMonthPassed() {
        DepositAccount account = new DepositAccount(0);
        account.put(1000);
        account.take(100); // Прошло 0 дней → снятие запрещено
        assertEquals(1000, account.getAmount());
    }

    @Test
    void testTakeAfterMonthPassed() throws Exception {
        DepositAccount account = new DepositAccount(0);
        account.put(1000);

        // Изменяем lastIncome через рефлексию (небезопасно!)
        Field lastIncomeField = DepositAccount.class.getDeclaredField("lastIncome");
        lastIncomeField.setAccessible(true);
        lastIncomeField.set(account, LocalDate.now().minusMonths(2));

        account.take(100); // Теперь можно снять
        assertEquals(900, account.getAmount());
    }

    @Test
    void testTakeWithoutIncome() {
        DepositAccount account = new DepositAccount(0);
        account.take(100); // Пополнений не было → снятие запрещено
        assertEquals(0, account.getAmount());
    }
}