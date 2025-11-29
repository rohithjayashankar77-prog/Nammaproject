package stepdefinitionpenta;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.registrationpage;

public class TC_RF_001 {
	 public static WebDriver driver;
	registrationpage rp;
	@Given("user has opened the browser and launched the application")
	public void user_has_opened_the_browser_and_launched_the_application() throws InterruptedException {
	    
		 driver = new ChromeDriver();
		 Hooks.driver=driver;
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		  rp = new registrationpage(driver);
	}

	@When("user enters valid first name")
	public void user_enters_valid_first_name() throws InterruptedException {
	    rp.firstname();
	}

	@And("user enters valid last  name")
	public void user_enters_valid_last_name() throws InterruptedException {
	   rp.lastname();
	}

	@And("user enters valid Email id")
	public void user_enters_valid_email_id() throws InterruptedException {
	   rp.email();
	}

	@And("user enters valid Telephone")
	public void user_enters_valid_telephone() throws InterruptedException {
	   rp.telephone();
	}

	@And("user enters valid  Password")
	public void user_enters_valid_password() throws InterruptedException {
	   rp.password();
	}

	@And("user enters valid Confirm Password")
	public void user_enters_valid_confirm_password() throws InterruptedException {
		rp.confirmpassword();
	}

	@And("user clicks on radio button no")
	public void user_clicks_on_radio_button_no() throws InterruptedException {
	   rp.radiobutton();
	}

	@When("user clicks on privacy policy check box")
	public void user_clicks_on_privacy_policy_check_box() throws InterruptedException {
	   rp.privacypolicy();
	}

	@And("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
	 rp.continuebutton();   
	}

	@Then("user should be registered")
	public void user_should_be_registered() throws InterruptedException {
		//Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
		Thread.sleep(3000);
	   driver.close();
	}


}
