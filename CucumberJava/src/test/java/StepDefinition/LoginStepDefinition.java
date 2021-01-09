package StepDefinition;

import Common.UtilityClass;
import Pages.LogDetails;
import Pages.LoginPage;
import Pages.ProductFilter;
import Pages.ProductSearch;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends UtilityClass
{
	
	@Before
	
	@Given("^Open the browser and launch the application$")
	public void open_browser_and_launch_application() {
		SetTestingAttributes();
	    driver.get("https://www.amazon.in/");
	}
	
	@When("^Login to Application$")
	public void login_to_application()
	{	
		LoginPage login = new LoginPage(driver);
		login.loginValidUser(getKeyValue(TestingAttributes,"userName"),getKeyValue(TestingAttributes,"password"));
		
	}
	@Then("^Search Product$")
	public void SearchProduct()
	{
		String category = getKeyValue(TestingAttributes,"category");
		String productCategory = getKeyValue(TestingAttributes,"productCategory");
		String product = getKeyValue(TestingAttributes,"product");
		String item = getKeyValue(TestingAttributes,"item");
		
		ProductSearch search = new ProductSearch(driver, logger);
		search.SearchProductItem(category,productCategory,product,item);
	}
		
	@Then ("^Filter Product$")
	public void FilterProduct()
	{
		String memoryValue = getKeyValue(TestingAttributes,"memory");
		String osValue = getKeyValue(TestingAttributes,"os");
		String discountValue = getKeyValue(TestingAttributes,"discount");
		String reviewValue = getKeyValue(TestingAttributes,"review");
		
		ProductFilter filter = new ProductFilter(driver);
		filter.FilterProduct(memoryValue,osValue,discountValue,reviewValue);
		
	}
	@Then ("^Log Product Description$")
	public void LogProductDescription() throws InterruptedException
	{
		LogDetails logdetail = new LogDetails(driver, logger);
		logdetail.LogProductDetails();
	}
	@And ("^Sign out$")
	public void Signout()
	{
		LoginPage login = new LoginPage(driver);
		login.LogOutFromApplication();
	}
			
}
