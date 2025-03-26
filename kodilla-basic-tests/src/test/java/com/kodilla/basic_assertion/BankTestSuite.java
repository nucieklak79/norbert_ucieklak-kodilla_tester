package com.kodilla.basic_assertion;
import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BankTestSuite {

    @Test
    void shouldCalculateTotalBalance() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        double totalBalance = bank.getTotalBalance();

        // Then
        assertEquals(150, totalBalance);
    }

    @Test
    void shouldReturnZeroBalanceIfNoCashMachines() {
        // Given
        Bank bank = new Bank();

        // When
        double totalBalance = bank.getTotalBalance();

        // Then
        assertEquals(0, totalBalance);
    }

    @Test
    void shouldCalculateWithdrawalCount() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        int withdrawalCount = bank.getWithdrawalCount();

        // Then
        assertEquals(3, withdrawalCount);
    }

    @Test
    void shouldReturnZeroWithdrawalCountIfNoWithdrawals() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(50);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        int withdrawalCount = bank.getWithdrawalCount();

        // Then
        assertEquals(0, withdrawalCount);
    }

    @Test
    void shouldCalculateDepositCount() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(20);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        int depositCount = bank.getDepositCount();

        // Then
        assertEquals(3, depositCount);
    }

    @Test
    void shouldReturnZeroDepositCountIfNoDeposits() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(-50);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        int depositCount = bank.getDepositCount();

        // Then
        assertEquals(0, depositCount);
    }

    @Test
    void shouldCalculateAverageWithdrawal() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(-20);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        double averageWithdrawal = bank.getAverageWithdrawal();

        // Then
        assertEquals(-56.666666666666664, averageWithdrawal, 0.0001);
    }

    @Test
    void shouldReturnZeroAverageWithdrawalIfNoWithdrawals() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(20);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        double averageWithdrawal = bank.getAverageWithdrawal();

        // Then
        assertEquals(0, averageWithdrawal, 0.0001);
    }

    @Test
    void shouldCalculateAverageDeposit() {
        /* metoda nie przejdzie poniższego testu dlatego, że bank ma 2 bankomaty
        w jednym były dwie wpłaty 100 i 20, natomiast w drugim była jedna wpłata 200.
        Średnia to 320/3 = 106.6666 itd. Specjalnie określiłem wartość expected na 140.
         */

        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);
        cashMachine1.addTransaction(20);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        double averageDeposit = bank.getAverageDeposit();

        // Then
        assertEquals(106.66666, averageDeposit, 0.0001);
    }

    @Test
    void shouldReturnZeroAverageDepositIfNoDeposits() {
        // Given
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(-100);
        cashMachine1.addTransaction(-20);
        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(-200);
        cashMachine2.addTransaction(-100);
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        // When
        double averageDeposit = bank.getAverageDeposit();

        // Then
        assertEquals(0, averageDeposit, 0.0001);
    }

    @Test
    void shouldHandleEmptyBank() {
        // Given
        Bank bank = new Bank();

        // When
        double totalBalance = bank.getTotalBalance();
        int withdrawalCount = bank.getWithdrawalCount();
        int depositCount = bank.getDepositCount();
        double averageWithdrawal = bank.getAverageWithdrawal();
        double averageDeposit = bank.getAverageDeposit();

        // Then
        assertEquals(0, totalBalance, 0.0001);
        assertEquals(0, withdrawalCount);
        assertEquals(0, depositCount);
        assertEquals(0, averageWithdrawal, 0.0001);
        assertEquals(0, averageDeposit, 0.0001);
    }
}
