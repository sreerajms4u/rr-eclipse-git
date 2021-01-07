package StepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import Common.AmazonLogin;
import Common.BaseClass;
import Common.LogDetails;
import Common.ProductFilter;
import Common.ProductSearch;

import org.apache.log4j.Logger;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass
{
	
	@Before
	
	@Given("Amazon land page")
	public void amazon_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		logger = Logger.getLogger(LoginStepDefinition.class.getName());
		loadLog4j();
		InitExcel();
		
		
	    
	    driver.get("https://www.amazon.in/");
	}
	
	@When("User in Login page")
	public void User_in_login_page()
	{
	
		AmazonLogin login = new AmazonLogin();
		login.LoginToAmazon();
		
	}
	@Then("Search Product")
	public void SearchProduct()
	{
		ProductSearch search = new ProductSearch();
		search.SearchAmazonProduct();
	}
		
	@Then ("Filter Product")
	public void FilterProduct()
	{
		ProductFilter filter = new ProductFilter();
		filter.FilterAmazonProduct();
		
	}
	@Then ("Log Product Description")
	public void LogProductDescription()
	{
		LogDetails logdetail = new LogDetails();
		logdetail.LogProductDetails();
	}
	@And ("Sign out")
	public void Signout()
	{
		AmazonLogin login = new AmazonLogin();
		login.LogOutFromAmazon();
	}
			
}
