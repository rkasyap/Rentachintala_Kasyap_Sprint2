Feature: Applying Coupon Activity

    Scenario Outline: Validating discount coupon
    	 Given user is on browser
       		When user clicks on hamburger menu
        		And user clicks on BookaSmile 
        			And user selects the amount and clicks on donate now
        				And user enters <email> and <mobile number> then clicks continue 
    						And user clicks on gift voucher and apply coupon<coupon>
    							Then user clicks on pay now
    						
    	Examples:
    				|email| 		|mobile number| 	|coupon|
    				|abc@gmail.com| |8520312456| 		|xhdkjdjk123|