package StepDefinition;

import com.pages.Profile;

import io.cucumber.java.en.*;

public class ProfileTest {
	
	Profile prof;

	@When("user clicks on hamburger menu")
	public void user_clicks_on_hamburger_menu() {
	    prof = new Profile();
	    prof.hamburgerMenu();
	}

	@When("user clicks on notification")
	public void user_clicks_on_notification() {
	    prof.validateNotification();
	}

	@Then("notifications will be displayed")
	public void notifications_will_be_displayed() {
	   Boolean bool = prof.notificationWindows();
	   if(bool==true) {
		   System.out.println(bool);   
	   }
	   else
	   {
		   System.out.println(bool);
	   }
	   prof.teardown();
	}

	@When("user clicks on BookaSmile")
	public void user_clicks_on_booka_smile() {
			prof.bookasmile();
	}

	@Then("BookaSmile page will be displayed")
	public void booka_smile_page_will_be_displayed() {
		 Boolean bol = prof.bookasmileWindow();
		   if(bol==true) {
			 System.out.println(bol);
		   }
		   else
		   {
			   System.out.println(bol);
		   }
		   prof.teardown();
	}
	
}
