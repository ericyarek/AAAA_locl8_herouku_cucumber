Feature: Login

	#login link
	@SPA-1248 @SPA-1247
	Scenario: Verify login valid credentials
		Given the user is on the login page
		When the user enters username "salbinson10@cdbaby.com" and password "salmonalbinson"
		When the user clicks on the Sign in link
		Then label "VA" and "light-side" should be displayed