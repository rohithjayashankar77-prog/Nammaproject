package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	//construction
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	//locators
	
By un = By.id("input-email");		
By ps = By.id("input-password");
By lb = By.xpath("//input[@value='Login']");
	
	
	
	//action method
	
public void username() throws InterruptedException
{
	driver.findElement(un).sendKeys("rohi79@gmail.com");
	
		
}
	
 public void password() throws InterruptedException
 {
	 driver.findElement(ps).sendKeys("Rohikj@45");
	 
 }
 
 public void loginbutton() throws InterruptedException
 {
	 driver.findElement(lb).click();
	 
	 
 }
 
}

