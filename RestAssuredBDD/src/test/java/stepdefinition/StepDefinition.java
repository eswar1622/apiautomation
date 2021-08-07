package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class StepDefinition {
	@Given("Update API payload")
	public void update_api_payload() {
		
		RestAssured.baseURI = "https://reqres.in";
	   
	}

	@When("user calls {string} to update the infromation")
	public void user_calls_to_update_the_infromation(String string) {
	    
	}

	@Then("the API is success with status code {int}")
	public void the_api_is_success_with_status_code(Integer int1) {
	    
	}

	@Then("status in the response is id")
	public void status_in_the_response_is_id() {
	
	
	}


}
