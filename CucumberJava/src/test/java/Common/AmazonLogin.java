package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin extends BaseClass{
	
	public void LoginToAmazon()
	{
		
//logger.info("Start Login!!");
		
		
		
		//Step 1 - Login to Amazon from Chrome Browser
		//logger.info("Step 1 - Login to Amazon from Chrome Browser");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(getKeyValue(TestingAttributes,"userName")); 
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(getKeyValue(TestingAttributes,"password")); 
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	public void LogOutFromAmazon()
	{
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//span[@id='nav-item-signout']"))).click().build().perform();
		
		
		//driver.findElement(By.xpath("//*[@id='nav-item-signout']/span']")).click();
		//logger.info("Logout from Amazon");
		//driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.quit();
		
	}
	

	
}
