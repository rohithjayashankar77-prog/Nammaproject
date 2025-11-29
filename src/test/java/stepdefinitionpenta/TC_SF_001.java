package stepdefinitionpenta;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pagespenta.searchfunction;

public class TC_SF_001 {
	 public static WebDriver driver;
	searchfunction sf;
	@Given("User should be logged in and  be in the homepage")
	public void user_should_be_logged_in_and_be_in_the_homepage() throws InterruptedException {
		driver = new ChromeDriver();
		 Hooks.driver=driver;
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=product/search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		 sf = new searchfunction(driver);
		  
	}

	@When("user enter {string} in the search bar")
	public void user_enter_in_the_search_bar(String string) {
	   sf.search();
	}

	@And("user enter thr search button")
	public void user_enter_thr_search_button() {
	    sf.searchbtn();
	}

	@Then("user should be see results related to {string}")
	public void user_should_be_see_results_related_to(String string) throws InterruptedException {
	   //Assert.assertEquals(driver.getTitle(), "Search");
	  Thread.sleep(3000);
		driver.close();
	}
}
