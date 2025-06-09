package wallet;

public class Wallet {
    private int balance;
    private int withdraw;

    public Wallet() {
        this.balance = 0;
    }
    public void deposit(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Warning!: Unable to withdraw zero or less");
        }
        this.balance += amount;
    }


    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Warning!: Unable to withdraw zero or less");
        }
        if (this.balance >= amount) {
            this.balance -= amount;
            this.withdraw = amount;

        } else {
            System.out.println("You have no money");

        }
    }

    public int getBalance() {
        return balance;
    }
    public int showWithdraw() {
        return withdraw;
    }

   }
