package com.kodilla.bank.homework;
import java.util.Arrays;

public class Bank {
    private CashMachine[] cashMachines;
    private int cashMachineCount;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.cashMachineCount = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newCashMachines = Arrays.copyOf(this.cashMachines, this.cashMachineCount + 1);
        newCashMachines[this.cashMachineCount] = cashMachine;
        this.cashMachines = newCashMachines;
        this.cashMachineCount++;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getWithdrawalCount() {
        int withdrawalCount = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    withdrawalCount++;
                }
            }
        }
        return withdrawalCount;
    }

    public int getDepositCount() {
        int depositCount = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    depositCount++;
                }
            }
        }
        return depositCount;
    }

    public double getAverageWithdrawal() {
        double totalWithdrawal = 0;
        int withdrawalCount = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction < 0) {
                    totalWithdrawal += transaction;
                    withdrawalCount++;
                }
            }
        }
        if (withdrawalCount == 0) {
            return 0;
        }
        return totalWithdrawal / withdrawalCount;
    }

    public double getAverageDeposit() {
        double totalDeposit = 0;
        int depositCount = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (double transaction : cashMachine.getTransactions()) {
                if (transaction > 0) {
                    totalDeposit += transaction;
                    depositCount++;
                }
            }
        }
        if (depositCount == 0) {
            return 0;
        }
        return totalDeposit / depositCount;
    }
}