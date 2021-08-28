package com.vtiger.comcast.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author nikhil 
 *
 */

public class FileUtility {
	/**
	 * its used to read the data from commonData.properties File based on Key which you pass as an argument
	 * @param key
	 * @throws Throwable 
	 */
    public String getPropertyKeyValue(String key) throws Throwable {
    	 FileInputStream fis = new FileInputStream("./resources/config.properties");
    	 Properties pobj = new Properties();
    	 pobj.load(fis);
    	 String value = pobj.getProperty(key);
		return value;
    	
    }
    
   // public String getChromeDriverKey()


}
