package wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have money in my wallet in amount {int}")
    public void i_have_money_in_my_wallet_in_amount(int initialAmount) {
        wallet.deposit(initialAmount);
    }
    @When("I withdraw {int}")
    public void i_withdraw(int requestedAmount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, requestedAmount);
    }
    @Then("cashier should give me {int}")
    public void cashier_should_give_me(int expectedDispensedAmount) {
        assertEquals(expectedDispensedAmount, cashSlot.getContents());
    }
    @Then("I should have {int} money left")
    public void i_should_have_money_left(int remainingAmount) {
        assertEquals(remainingAmount, wallet.getBalance());

    }

}
