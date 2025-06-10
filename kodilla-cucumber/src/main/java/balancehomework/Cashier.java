package balancehomework;

public class Cashier {
    private final CashSlot cashSlot;
    private String lastErrorMessage;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
        this.lastErrorMessage = null;
    }

    public void withdraw(Wallet wallet, int amount) {
        this.lastErrorMessage = null;

        if (amount <= 0) {
            this.lastErrorMessage = "Incorrect amount";
            System.out.println("Cashier: Attempt to withdraw invalid amount: " + amount + ". Error: " + lastErrorMessage);
            cashSlot.dispense(0);
            return;
        }

        if (wallet.getBalance() < amount) {
            this.lastErrorMessage = "There is no enough money";
            System.out.println("Cashier: Attempt to withdraw " + amount + " but balance is " + wallet.getBalance() + ". Error: " + lastErrorMessage);
            cashSlot.dispense(0);
        } else {
            if (wallet.withdraw(amount)) {
                cashSlot.dispense(amount);
            } else {

                this.lastErrorMessage = "Unknown withdraw error";
                cashSlot.dispense(0);
            }
        }
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
