Feature: Homepage Activity

	Scenario: Validating URl
    	Given user is on browser
    			Then user is redirected to Hompage
    			
    Scenario: Validating signin Page
        Given user is on browser
        	 When  validate the title as "Movie Tickets, Plays, Sports, Events & Cinemas near Mumbai - BookMyShow"
        			Then user clicks on signin button