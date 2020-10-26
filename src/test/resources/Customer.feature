Feature: customer creation 
Scenario: Validate customer creation 
	Given I am navigated to PestRoutes domain "https://qatest.pestroutes.com "
	When I enter my username and password 
	And I click on login button 
	And I click on New Customer button 
	And I create customer with first name, last name, and address 
	And I click on save
	Then I validate if customer name and address match in overview tab 
