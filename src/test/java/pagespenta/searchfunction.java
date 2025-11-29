package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchfunction {
  WebDriver driver;
  
 public searchfunction( WebDriver driver)
 {
	 this.driver = driver;
 }
 //locators
 By sh = By.xpath("//input[@placeholder='Search']"); 
 By sb = By.xpath("//button[@class='btn btn-default btn-lg']");
 
  //action method
 public void search()
 {
	 driver.findElement(sh).sendKeys("laptop"); 
 }
  
 public void searchbtn()
 {
	 
	driver.findElement(sb).click(); 
 }
  
}
