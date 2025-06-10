package balancehomework;

public class Wallet {
    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        this.balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + this.balance);
    }

    public boolean withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Error: Withdrawal amount cannot be negative.");
            return false;
        }
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + this.balance);
            return true;
        } else {
            System.out.println("Insufficient funds. Needed: " + amount + ", Available: " + this.balance);
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }
}
