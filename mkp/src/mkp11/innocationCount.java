package mkp11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class innocationCount {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver","/Users/mookappa/Documents/Applications/geckodriver");
	}
     @Test(priority=1,invocationCount=2)
     public void openAPP() throws InterruptedException
     {
    	 driver =new FirefoxDriver();
    	 driver.get("https://www.w3schools.com");
    	 driver.manage().window().maximize();
    	 
    	Thread.sleep(2000);
     }
     
}
