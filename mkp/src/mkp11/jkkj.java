package mkp11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jkkj {
	public static void main(String[] args) {
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver" ,  "/Users/mookappa/Documents/Applications/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com");
		
		driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 driver.close();
	}

}
