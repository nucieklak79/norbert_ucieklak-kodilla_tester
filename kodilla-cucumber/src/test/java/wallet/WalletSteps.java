package wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private Wallet wallet;

    @Given("I have money in my wallet in amount {int}")
    public void i_have_money_in_my_wallet_in_amount(int initialAmount) {
        wallet = new Wallet();
        wallet.deposit(initialAmount);
        assertEquals(initialAmount, wallet.getBalance());

    }
    @When("I withdraw {int}")
    public void i_withdraw(int requestedAmount) {
        wallet.withdraw(requestedAmount);

    }
    @Then("cashier should give me {int}")
    public void cashier_should_give_me(Integer expectedDispensedAmount) {
        assertEquals(expectedDispensedAmount, wallet.showWithdraw());

    }
    @Then("I should have money left {int}")
    public void i_should_have_money_left(Integer expectedRemainingAmount) {
        assertEquals(expectedRemainingAmount, wallet.getBalance());

    }

}
