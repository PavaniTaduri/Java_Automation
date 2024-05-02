package Files;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import utils.CaptureScreenShot;
import utils.openChromeBrowser;

public class TestLoginFilename {


		// TODO Auto-generated method stub
		static WebDriver driver;
		
		
		public static void main(String[] args) throws Exception {
			
				  
				openChromeBrowser ob = new openChromeBrowser();
				
				driver = ob.openChrome();
				
				driver.get("https://the-internet.herokuapp.com/login");
				
				String u = "Pavani";
				String p = "@ustwellcome";
				
				driver.findElement(By.id("username")).sendKeys(u);
				driver.findElement(By.id("password")).sendKeys(p);
			
				driver.findElement(By.cssSelector("#login > button")).click();
				try {
					driver.findElement(By.partialLinkText("Logout"));
				}
				catch(NoSuchElementException e)
				{
					System.out.println("Login Failed.");
					userNamePass fn = new userNamePass();
					
					String filename = fn.fileNameForLogin(u,p);
					System.out.println(filename);
					
					CaptureScreenShot cs = new CaptureScreenShot();
					cs.takeSnapShot(driver, filename);
				}
				

	}

}
