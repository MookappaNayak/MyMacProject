package mkp11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParalleleExecution {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver" ,  "/Users/mookappa/Documents/Applications/geckodriver");
		System.setProperty("webdriver.chrome.driver" ,  "/Users/mookappa/Documents/Applications/chromedriver");
	}
            @Parameters({"browser"})
            @BeforeClass
            public void openApp(String browser)
            {
            	if(browser.equals("chrome"))
            	{
            		driver=new ChromeDriver();
            	}
            	else if(browser.equals("Firefox")){
            		driver=new FirefoxDriver();
            	}
            	else
            	{
            		
            	}
            	
            	driver.get("http://www.w3schools.com");
            }
            
}
