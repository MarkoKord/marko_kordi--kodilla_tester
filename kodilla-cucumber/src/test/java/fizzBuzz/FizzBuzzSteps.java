package fizzBuzz;


import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {
        Given("Number is equal to {int}", (Integer number) -> {
            this.number = number;
        });

        When("Check if the number is divisible by 3 and 5", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.fizzBuzzChecker(this.number);
        });

        Then("Should get an answer which is: {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }
}