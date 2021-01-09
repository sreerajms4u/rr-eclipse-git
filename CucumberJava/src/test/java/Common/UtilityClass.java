package Common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.Pair;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	public static org.apache.log4j.Logger logger = null;
	public static WebDriver driver = null;
	public static List<Pair<String, String> > TestingAttributes = new ArrayList<Pair<String, String> >();
	
	
	public static void SetTestingAttributes()
	{
		ExcelHandler objExcelFile = new ExcelHandler();
		
		try {
			TestingAttributes = objExcelFile.readExcel("ExternalSource.xls","AmazonDetails");
		} catch (IOException e) {
			logger.info(e.getMessage());
		}
	}
	
	public UtilityClass() {
		if (driver==null)
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
			
		}
		if(logger == null){
			AppLogger applogger = new AppLogger();
			logger = applogger.logger;
		}
	}
	
	public String getKeyValue(List<Pair<String, String>> list, String key){
		
		String value = "";
		for (Pair<String, String> pair : list) {
			String id = pair.getKey().toString().trim();
			if(id.equals(key) ){
				value =  pair.getValue();
				break;
			}
		}
	
	return value;
		
	}

}
