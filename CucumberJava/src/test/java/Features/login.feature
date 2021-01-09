Feature: Search Product-Dell Laptop 

Scenario: Login to Amazon site from chrome browser 

	Given Open the browser and launch the application 
	When Login to Application 
	Then Search Product 
	Then Filter Product
	Then Log Product Description
	And Sign out
	