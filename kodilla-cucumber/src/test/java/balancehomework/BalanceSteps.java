package balancehomework;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
        cashier.withdraw(wallet, requestedAmount); // Using the Cashier's withdraw method
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

    @When("I check the balance of my wallet") // Matches "Display balance"
    public void i_check_the_balance_of_my_wallet() {
        currentBalanceChecked = wallet.getBalance();
        System.out.println("When: Checked wallet balance. It is " + currentBalanceChecked + ".");
    }

    @Then("I should see that the balance is ${int}") // Matches "Display balance"
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        assertEquals(expectedBalance, currentBalanceChecked, "Displayed balance does not match expected balance.");
        System.out.println("Then: Displayed balance matches expected " + expectedBalance + ".");
    }

    // --- Additional existing steps (from the comprehensive wallet.feature) ---
    // These might have slight variations if the comprehensive wallet.feature
    // uses different phrasing from the new simple features.
    // I'm including them assuming they are part of the broader test suite.

    @Then("bankomat powinien wydać {int}")
    public void bankomat_powinien_wydac(int expectedDispensedAmount) {
        assertEquals(expectedDispensedAmount, cashSlot.getContents(), "Bankomat wydał nieprawidłową kwotę.");
        System.out.println("Then: Bankomat wydał " + expectedDispensedAmount + " PLN.");
    }

    @Then("mój portfel powinien zawierać {int}")
    public void mój_portfel_powinien_zawierać(int expectedRemainingAmount) {
        assertEquals(expectedRemainingAmount, wallet.getBalance(), "Saldo portfela jest nieprawidłowe.");
        System.out.println("And: Mój portfel zawiera " + expectedRemainingAmount + " PLN.");
    }

    @Then("bankomat nie powinien wydać żadnych pieniędzy")
    public void bankomat_nie_powinien_wydac_zadnych_pieniedzy() {
        assertEquals(0, cashSlot.getContents(), "Bankomat wydał pieniądze, mimo że nie powinien.");
        System.out.println("Then: Bankomat nie wydał żadnych pieniędzy.");
    }

    @Then("powinnam otrzymać komunikat o błędzie {string}")
    public void powinnam_otrzymac_komunikat_o_bledzie(String expectedErrorMessage) {
        assertEquals(expectedErrorMessage, cashier.getLastErrorMessage(), "Otrzymano nieprawidłowy komunikat o błędzie.");
        System.out.println("And: Otrzymano komunikat o błędzie: '" + expectedErrorMessage + "'.");
    }
}
