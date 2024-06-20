Feature: Add to Cart
	Scenario: 
		Given I am on the sauceDemo login page
		When I enter the username "username"
		And I enter the password "password"
		And I click the login button
		When I click add to cart button
		Then I check number of items in cart is correct

