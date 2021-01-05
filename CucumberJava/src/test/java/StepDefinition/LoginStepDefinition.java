package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass
{
	WebDriver driver;
	@Before
	
	@Given("Amazon land page")
	public void amazon_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		logger = Logger.getLogger(LoginStepDefinition.class.getName());
		loadLog4j();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	}
	
	@When("User in Login page")
	public void User_in_login_page()
	{
		
		logger.info("Start Login!!");
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9495349001"); 
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sree@123"); 
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Select drpCategory= new Select(driver.findElement(By.id("searchDropdownBox")));
		
		drpCategory.selectByVisibleText("Electronics");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.linkText("Laptops & Accessories")).click();
		driver.findElement(By.linkText("Laptops")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dell Laptops"); 
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.className("a-icon-prime")).click();
		driver.findElement(By.linkText("3 GB")).click();
		driver.findElement(By.linkText("Windows 10")).click();
		driver.findElement(By.linkText("& Up")).click();
		driver.findElement(By.linkText("10% Off or more")).click();
		
		logger.info("Ended!!");
	}
	
}
