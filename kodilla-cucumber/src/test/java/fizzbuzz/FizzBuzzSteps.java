package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fizzbuzz.FizzBuzzChecker.numberCheck;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzSteps {
    private int number;
    private String answer;

    @Given("the given number {int}")
    public void the_given_numer(int number) {
        this.number = number;
    }
    @When("fizzBizz method is started with the number")
    public void fizz_bizz_method_is_started_with_the_number() {
        this.answer = numberCheck(number);
    }

    @Then("i should expect {string}")
    public void i_should_expect(String expectedAnswer) {
        assertEquals(expectedAnswer, this.answer);
    }



}
