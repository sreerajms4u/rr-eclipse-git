package Pages;

import java.io.Console;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogDetails {
	protected static WebDriver driver;
	public org.apache.log4j.Logger logger = null;
	private By productListBy = By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");
	
	public LogDetails(WebDriver driver, Logger logger){
		this.driver = driver;
		this.logger = logger;
	}
	public void LogProductDetails() throws InterruptedException
	{
		List<WebElement> elements = driver.findElements(productListBy);	
		Thread.sleep(0);
		for(WebElement element:elements)
		{
			System.out.println(element.getText());
		}			
		logger.info("Ended!!");
	}

}
