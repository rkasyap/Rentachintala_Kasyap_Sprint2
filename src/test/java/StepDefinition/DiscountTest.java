package StepDefinition;

import com.pages.Discount;

import io.cucumber.java.en.*;

public class DiscountTest {
	
	Discount disc;
	
	@When("user selects the amount and clicks on donate now")
	public void user_selects_the_amount_and_clicks_on_donate_now() {
	    disc = new Discount();
	    disc.paymentPage();
	}

	  @And("^user enters (.+) and (.+) then clicks continue $")
	    public void user_enters_and_then_clicks_continue(String email, String mobilenumber) {
		  	disc.details(email, mobilenumber);
	    }

	    @And("^user clicks on gift voucher and apply coupon(.+)$")
	    public void user_clicks_on_gift_voucher_and_apply_coupon(String coupon)  {
	    	disc.applyVoucher(coupon);
	    }


	@Then("user clicks on pay now")
	public void user_clicks_on_pay_now() {
	    disc.pay();
	}

}