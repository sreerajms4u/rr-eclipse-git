package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductFilter {
	protected static WebDriver driver;
	
	private By ratingFilterBy = By.xpath("//*[@class='a-icon a-icon-star-medium a-star-medium-4']");
	
	public ProductFilter(WebDriver driver) {
		this.driver = driver;
	}
	public void FilterProduct(String memoryValue, String osValue, String discountValue, String reviewValue)
	{
		try {
			driver.findElement(By.linkText(memoryValue)).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.findElement(By.linkText(osValue)).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			By discountFilterBy = By.xpath("//*[contains(text(), '"+discountValue+"']");
			driver.findElement(discountFilterBy).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.findElement(ratingFilterBy).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
