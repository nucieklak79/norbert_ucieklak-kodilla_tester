package balancehomework;

public class CashSlot {
    private int contents;

    public CashSlot() {
        this.contents = 0;
    }

    public void dispense(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount to dispense cannot be negative.");
        }
        this.contents = amount;
        System.out.println("Cash slot dispensed: " + amount);
    }

    public int getContents() {
        return contents;
    }
}
