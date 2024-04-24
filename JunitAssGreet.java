package coding;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAssGreet {
	
	public boolean actualresult;
	public static String actualgreeting;
	public static String expectedgreet;
	public boolean result;
	
	@BeforeClass
	
	public static void readPropertyFile() throws IOException {
		Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C://Users//Administrator//eclipse-workspace//Coding//config1.properties");
        p.load(fis);
        expectedgreet = p.getProperty("expectedgreeting");
        System.out.println("Expected Result:" +expectedgreet);
	}

	@Test
	
       public void currTime()
       {
        LocalDateTime now = LocalDateTime.now();
	
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		System.out.println("Current Date & Time: "+ formatDateTime);
		
		int curtime = LocalTime.now().getHour();
	     if(curtime < 12)
	     {
	    	 actualgreeting = "Good morning";
	}
        
        else if(curtime >= 12 && curtime <=16)
        {
        	actualgreeting = "Good afternoon";
       	 
        }
        else if (curtime >16 && curtime <=19)
        {
        	actualgreeting = "Good evening";
       	
        }
        else
        {
        	actualgreeting = "Good night";
       	 
        }
	     System.out.println(LocalTime.now().getHour());
	     System.out.println("Actual Result: "+actualgreeting);
	     Assert.assertEquals(actualgreeting, expectedgreet);
        
}
	}



