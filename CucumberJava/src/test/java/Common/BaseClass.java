package Common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.Pair;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import StepDefinition.FromExcel;

public class BaseClass {
	public static org.apache.log4j.Logger logger = null;
	public static WebDriver driver = null;
	public static List<Pair<String, String> > TestingAttributes = new ArrayList<Pair<String, String> >();
	public static void loadLog4j() {
		
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public static void InitExcel()
	{
		FromExcel objExcelFile = new FromExcel();
		
		try {
			TestingAttributes = objExcelFile.readExcel("ExternalSource.xls","AmazonDetails");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public BaseClass() {
		if (driver==null)
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver= new ChromeDriver();
			
			//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");	    
		    //driver= new FirefoxDriver();
			driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
			
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
