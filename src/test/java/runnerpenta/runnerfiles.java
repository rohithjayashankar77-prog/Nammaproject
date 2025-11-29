package runnerpenta;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {
				//"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\pentalife\\featurespenta\\01_registrationpenta.feature",
				"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\pentalife\\featurespenta\\02_login.feature",
				//"C:\\Users\\ASUS\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\pentalife\\featurespenta\\03_Searchpenta.feature"
				},
		glue = {"stepdefinitionpenta"},
		dryRun=false,
		monochrome = true,
	    plugin = {
	        "pretty",
	        "html:reports/cucumber-html-report.html",
	       // "json:reports/cucumber.json",
	       // "junit:reports/cucumber.xml"
	    }
	  )
		
public class runnerfiles extends AbstractTestNGCucumberTests {

}
