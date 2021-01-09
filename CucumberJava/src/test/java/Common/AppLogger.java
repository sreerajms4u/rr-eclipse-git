package Common;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class AppLogger {
	public static org.apache.log4j.Logger logger = null;
	
	public AppLogger() {
		logger = Logger.getLogger(AppLogger.class.getName());
		PropertyConfigurator.configure("log4j.properties");
	}

}
