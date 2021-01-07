package Common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogDetails extends BaseClass{
	public void LogProductDetails()
	{

		List<WebElement> elements = driver.findElements(By.className("s-result-item"));
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//logger.info("size= "+elements.size());
			System.out.println("Testtt");
			 int i=0;
			for(WebElement element:elements)
			{
				i++;
				try {
					WebElement element2 = element.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div["+i+"]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
					//logger.info(element2.getText());
					System.out.println(element2.getText());
				} catch (Exception e) {
					try {
						WebElement element2 = element.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div["+i+"]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
						//logger.info(element2.getText());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						try {
							WebElement element2 = element.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div["+i+"]/div/span/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
							//logger.info(element2.getText());
						} catch (Exception e2) {
							// TODO Auto-generated catch block
							//e2.printStackTrace();
						}
					}
				}
			}
			
			//logger.info("Ended!!");
	}

}
