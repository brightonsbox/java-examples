package com.brightonsbox.cucumber.calculator;

import com.brightonsbox.cucumber.calculator.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorStepDefinitions {

    private Calculator calculator;
    private Integer result;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(final Integer a, final Integer b) {
        result = calculator.add(a, b) ;
    }

    @Then("I should get {int}")
    public void i_should_get(final Integer expectedResult) {
        assertThat(result).isEqualTo(expectedResult);
    }
}
