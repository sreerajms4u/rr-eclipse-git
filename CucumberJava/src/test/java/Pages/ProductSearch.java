package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch{

	protected static WebDriver driver;
	public org.apache.log4j.Logger logger = null;
	
	public ProductSearch(WebDriver driver, Logger logger){
		this.driver = driver;
		this.logger = logger;
	}
	
	private By searchCategoryBy = By.id("searchDropdownBox");
	private By searchSubmitBy = By.id("nav-search-submit-button");
	private By searchBy = By.id("twotabsearchtextbox");
	
	public void SearchProductItem(String category, String productCategory, String prodcut, String item)
	{
		logger.info("Starting SearchProductItem");
		try {
			Select drpCategory= new Select(driver.findElement(searchCategoryBy));
			drpCategory.selectByVisibleText(category);
			driver.findElement(searchSubmitBy).click();
			driver.findElement(By.linkText(productCategory)).click();
			driver.findElement(By.linkText(prodcut)).click();
			driver.findElement(searchBy).sendKeys(item); 
			driver.findElement(searchSubmitBy).click();
		} catch (Exception e) {
			logger.info("Error: "+e.getMessage());
		}				
				
	}

}
