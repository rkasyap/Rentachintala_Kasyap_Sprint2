package StepDefinition;

import com.pages.Sports;

import io.cucumber.java.en.*;

public class SportsTest {
	Sports spt;
	
	    @When("^user clicks on sports button$")
	    public void user_clicks_on_sports_button() {
	    	spt = new Sports();
	    	spt.sportsBut();
	    }

	    @And("^user selects the sport$")
	    public void user_selects_the_sport()  {
	      spt.selectBut();
	    }
	   
	    @Then("user is  able to see the sports page")
	    public void user_is_able_to_see_the_sports_page() {
	    	System.out.println(spt.sportsPage());
		       spt.teardown();
	    }


}
