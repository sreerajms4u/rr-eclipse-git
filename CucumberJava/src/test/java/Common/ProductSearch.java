package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch extends BaseClass{

	public void SearchAmazonProduct()
	{
	
		//Step 2 - Select category as ‘Electronics’ from the search Menu
				//logger.info("Step 2 - Select category as ‘Electronics’ from the search Menu");
				Select drpCategory= new Select(driver.findElement(By.id("searchDropdownBox")));
				drpCategory.selectByVisibleText(getKeyValue(TestingAttributes,"category"));
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				
				//Step 3 - Search for item (Dell laptop) with filter by memory, os,review and discount
				//logger.info("Step 3 - Search for item (Dell laptop) with filter by memory, os,review and discount");
				driver.findElement(By.linkText(getKeyValue(TestingAttributes,"productCategory"))).click();
				driver.findElement(By.linkText(getKeyValue(TestingAttributes,"product"))).click();
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(getKeyValue(TestingAttributes,"item")); 
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				if (getKeyValue(TestingAttributes,"isPrime").equals("true")) {
					driver.findElement(By.className("a-icon-prime")).click();
				}
				
				
	}

}
