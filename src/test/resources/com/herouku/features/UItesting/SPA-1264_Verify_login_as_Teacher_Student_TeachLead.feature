Feature: Login as Teacher Student TeachLead

	#The user  should be able to login from Teacher, Student, TeachLead accounts.
	@SPA-1264 @SPA-1247
	Scenario Outline: Verify login as Teacher Student TeachLead
		Given the user is on the login page
		When the user enters username "<email>" and password "<password>"
		When the user clicks on the Sign in link
		Then label "VA" and "light-side" should be displayed
		
		Examples:
		    |email                   |password      |
		    |salbinson10@cdbaby.com  |salmonalbinson|
		    |smathwiny@wix.com       |susannamathwin|
		    |emccuish11@omniture.com |emmymccuish   |