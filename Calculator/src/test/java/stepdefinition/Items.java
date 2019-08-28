package stepdefinition;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Items {
	private List<Integer> numbers;
	private int sum;
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition(List<Integer> numbers) throws Throwable {
	    this.numbers= numbers;
	}

	@When("^I summarize them$")
	public void i_summarize_them() throws Throwable {
	    for(Integer number: numbers) {
	    	sum+=number;
	    }	}

	@Then("^I should get (\\d+)$")
	public void i_should_get(int estVal) throws Throwable {
	    assertThat(sum, estVal);
	    System.out.println("please pay: "+sum);
	}

	private void assertThat(int sum2, int estVal) {
		// TODO Auto-generated method stub
		
	}
}
