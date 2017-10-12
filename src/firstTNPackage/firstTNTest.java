package firstTNPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class firstTNTest {
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void main() {
	  
 
      driver.findElement(By.id("user_email")).sendKeys("yan.gao@darkmatter.ae");
 
      // Find the element that's ID attribute is 'pwd' (Password)
 
      // Enter Password on the element found by the above desc.
 
      driver.findElement(By.id("user_password")).sendKeys("123456");
 
      // Now submit the form. WebDriver will find the form for us from the element
 
      driver.findElement(By.id("btn-signin")).click();
      
      WebElement message =  driver.findElement(By.className("message-text"));

      System.out.println(message.getText());

      Assert.assertEquals(message.getText(),"Signed in successfully.");
 
      // Print a Log In message to the screen
 
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
 
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		driver.get("https://courses.ultimateqa.com/users/sign_in");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
