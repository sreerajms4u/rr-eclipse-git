package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
	
	protected static WebDriver driver;
	
	private By signInLinkBy = By.id("nav-link-accountList-nav-line-1");
	private By usernameBy = By.name("email");
	private By continueBy = By.id("continue");
	private By passwordBy = By.name("password");
	private By signInSubmitBy = By.id("signInSubmit");
	  
	private By signoutHoverBy = By.id("nav-link-accountList-nav-line-1");
	private By signoutBy = By.id("nav-item-signout");
	  
	public LoginPage(WebDriver driver){
	  this.driver = driver;
	}
	public void loginValidUser(String userName, String password) {
		driver.findElement(signInLinkBy).click();
	    driver.findElement(usernameBy).sendKeys(userName);
	    driver.findElement(continueBy).click();
	    driver.findElement(passwordBy).sendKeys(password);
	    driver.findElement(signInSubmitBy).click();
	}
	public void LogOutFromApplication()
	{
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(signoutHoverBy);
		//action.moveToElement(we).moveToElement(driver.findElement(signoutBy)).click().build().perform();
		//driver.quit();			
	}
}
