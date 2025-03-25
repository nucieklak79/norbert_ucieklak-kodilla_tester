package com.kodilla.bank.homework;
import java.util.Arrays;

public class CashMachine {

        private double[] transactions;
        private int transactionCount;

        public CashMachine() {
            this.transactions = new double[0];
            this.transactionCount = 0;
        }

        public void addTransaction(double transaction) {
            if (transaction != 0) {
                double[] newTransactions = Arrays.copyOf(this.transactions, this.transactionCount + 1);
                newTransactions[this.transactionCount] = transaction;
                this.transactions = newTransactions;
                this.transactionCount++;
            }
        }

        public double getBalance() {
            double balance = 0;
            for (double transaction : this.transactions) {
                balance += transaction;
            }
            return balance;
        }

        public int getTransactionCount() {
            return this.transactionCount;
        }

        public double[] getTransactions() {
            return transactions;
        }
}

