package Generic_Utility;

import java.util.Date;
import java.util.Random;
/**
 * This class Consits of generic method  related to Java.util package
 * @author SUBHANI
 *
 */
public class JavaUtility {
	/**
	 * This method is generated to randomNumber return to caller 	
	 * @param random
	 * @return
	 */
	public int getRandomNumber(int random) {
		Random r=new Random();
		return r.nextInt(1000);
		
	}
	public String getSystemDate() {
		Date d=new Date();
		return d.toString();
	
		
	}

}
