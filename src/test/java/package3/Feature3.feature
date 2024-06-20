Feature: Checkout the products
	Scenario:
 
		Given I Am on the SauceDemo login page
		When I Enter the username "standard_user"
		And I Enter the password "secret_sauce"
		And I Click the login button
		When I Click add to cart button
		And I click the cart icon
		And I click the checkout button
		When I enter the user information block i enter first name "ruban"
		And I enter the last name "rajasekar"
		And I enter the postal code "600057"
		Then I click the continue button
		And I check that the total price is equal
