package StepDefinition;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.sun.istack.internal.logging.Logger;

public class BaseClass {
	public static org.apache.log4j.Logger logger = null;
	public static WebDriver driver = null;
	public static void loadLog4j() {
		String log4Jpath = "log4j.properties";
		PropertyConfigurator.configure(log4Jpath);
	}
	
	public BaseClass() {
		
	}

}
