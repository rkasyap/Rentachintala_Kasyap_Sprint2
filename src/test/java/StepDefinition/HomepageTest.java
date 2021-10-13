package StepDefinition;

import org.testng.Assert;

import com.pages.Homepage;

import io.cucumber.java.en.*;

public class HomepageTest {
	
	Homepage hm;
	
	@Given("user is on browser")
	public void user_is_on_browser() throws InterruptedException {
	   hm = new Homepage();
	   hm.initialization();
	   hm.cancelPopup();
	}

	@Then("user is redirected to Hompage")
	public void user_is_redirected_to_hompage() {
	   System.out.println(hm.validateUrl());
	   hm.teardown();
	}
	
	@When("validate the title as {string}")
	public void validate_the_title_as(String expectedTitle) {
		String ActualTitle = hm.validateTitle();
    	Assert.assertEquals(ActualTitle, expectedTitle);
	}
	 
	@Then("user clicks on signin button")
	public void user_click_on_signin_button() {
		hm.Signin();  
		hm.teardown();
	}


}
