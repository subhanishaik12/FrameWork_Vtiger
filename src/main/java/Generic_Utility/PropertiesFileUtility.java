package Generic_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class Consits of From read the properties Utility
 * @author SUBHANI SHAIK
 * Generic methods
 *
 */
public class PropertiesFileUtility {
	public  String GetDataFromPropertiesUtility(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IconstantsUtility.PropertiesFilePath);
		Properties pobj=new Properties();
		pobj.load(fis);
	    String value=pobj.getProperty(key);
	    return value;
		
		
	}
	
	

}
