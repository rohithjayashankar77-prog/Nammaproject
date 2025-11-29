package stepdefinitionpenta;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.loginpage;


public class TC_LF_001 {
	public static WebDriver driver;
	loginpage lp;
	@Given("User has launched the browser and application")
	public void user_has_launched_the_browser_and_application() throws InterruptedException {
		 driver = new ChromeDriver();
		 Hooks.driver=driver;
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000); 
		 lp = new loginpage(driver);
	}

	@When("user enters valid username")
	public void user_enters_valid_username() throws InterruptedException  {
	   lp.username();
	}

	@And("user enters valid password")
	public void user_enters_valid_password() throws InterruptedException   {
	   lp.password();
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException   {
	 lp.loginbutton();  
	}

	@Then("user should be in homepage")
	public void user_should_be_in_homepage() throws InterruptedException {
		Assert.assertEquals(driver.getTitle(), "My Account");
		Thread.sleep(3000);
		driver.close();
	   
	}
}

