package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage {
	WebDriver driver;

	// Constructor
	public registrationpage(WebDriver driver) 
	{
		this.driver = driver;
	}
//locators

	By fn = By.id("input-firstname");
	By ln = By.id("input-lastname");
	By el = By.id("input-email");
	By tp = By.id("input-telephone");
	By ps = By.id("input-password");
	By cps = By.id("input-confirm");
	By rb = By.xpath("//input[@value='0']");
	By pp = By.xpath("//input[@name='agree']");
	By cb = By.xpath("//input[@value='Continue']");

	// action methods

	public void firstname() throws InterruptedException {
		driver.findElement(fn).sendKeys("rohi");
		Thread.sleep(2000);
	}

	public void lastname() throws InterruptedException {
		driver.findElement(ln).sendKeys("KJ");
		Thread.sleep(2000);
	}

	public void email() throws InterruptedException {
		driver.findElement(el).sendKeys("rohi71@gmail.com");
		Thread.sleep(2000);

	}

	public void telephone() throws InterruptedException {
		driver.findElement(tp).sendKeys("8073773464");
		Thread.sleep(2000);
	}

	public void password() throws InterruptedException {
		driver.findElement(ps).sendKeys("Rohithkj@45");
		Thread.sleep(2000);
	}

	public void confirmpassword() throws InterruptedException {
		driver.findElement(cps).sendKeys("Rohithkj@45");
		Thread.sleep(2000);
	}

	public void radiobutton() throws InterruptedException {
		driver.findElement(rb).click();
		Thread.sleep(2000);
	}

	public void privacypolicy() throws InterruptedException {
		driver.findElement(pp).click();
		Thread.sleep(2000);
	}

	public void continuebutton() throws InterruptedException {
		driver.findElement(cb).click();
		Thread.sleep(2000);
	}
}
