package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver","\\home\\");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
