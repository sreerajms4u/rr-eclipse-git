Feature: Search Product-Dell Laptop 

Scenario: Login to Amazon site from chrome browser 

	Given Amazon land page 
	When User in Login page 
	Then Search Product 
	Then Filter Product
	Then Log Product Description
	And Sign out
	