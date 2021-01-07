package Common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductFilter extends BaseClass {

	public void FilterAmazonProduct()
	{
		//WebElement t= w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']")));
		//List<WebElement> elements = t.findElements(By.xpath("./child::*"));
		logger.info("Starting FilterAmazonProduct");
		
		driver.findElement(By.linkText(getKeyValue(TestingAttributes,"memory"))).click();
		driver.findElement(By.linkText(getKeyValue(TestingAttributes,"os"))).click();
		//driver.findElement(By.linkText(getKeyValue(TestingAttributes,"discount"))).click();
		//driver.findElement(By.xpath("//span[text()='"+getKeyValue(TestingAttributes,"review")+"']")).click();
		logger.info("Ends FilterAmazonProduct");
	
	}

}
