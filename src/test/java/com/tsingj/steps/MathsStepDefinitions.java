package com.tsingj.steps;

import io.cucumber.java.en.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.tsingj.app.Calculator;

public class MathsStepDefinitions {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Given("a is {int}")
    public void givenAIs(int value) {
        a = value;
    }

    @Given("b is {int}")
    public void givenBIs(int value) {
        b = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a,b);
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
    }

}
