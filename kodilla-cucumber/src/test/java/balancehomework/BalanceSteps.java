package balancehomework;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceSteps {
    private Wallet wallet;
    private CashSlot cashSlot;
    private Cashier cashier;
    private int currentBalanceChecked;

    @Given("there is ${int} in my wallet")
    public void initialize_wallet_with_amount(int initialAmount) {
        wallet = new Wallet();
        cashSlot = new CashSlot();
        cashier = new Cashier(cashSlot);
        wallet.deposit(initialAmount);
        assertEquals(initialAmount, wallet.getBalance(), "Initial wallet balance mismatch.");
        System.out.println("Given: Wallet has " + initialAmount + ".");
    }

    @When("I withdraw ${int}")
    public void attempt_to_withdraw_amount(int requestedAmount) {
        cashier.withdraw(wallet, requestedAmount);
        System.out.println("When: Attempting to withdraw " + requestedAmount + ".");
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "Cash slot dispensed money when it should not have.");
        System.out.println("Then: Nothing was dispensed.");
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_not_enough_money() {
        assertEquals("There is no enough money", cashier.getLastErrorMessage(), "Error message for insufficient funds mismatch.");

    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        currentBalanceChecked = wallet.getBalance();
        System.out.println("When: Checked wallet balance. It is " + currentBalanceChecked + ".");
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        assertEquals(expectedBalance, currentBalanceChecked, "Displayed balance does not match expected balance.");
        System.out.println("Then: Displayed balance matches expected " + expectedBalance + ".");
    }
}
