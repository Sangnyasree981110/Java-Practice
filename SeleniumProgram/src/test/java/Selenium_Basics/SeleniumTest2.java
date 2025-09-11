package Selenium_Basics;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;

public class SeleniumTest2 {
	 @Description("Open the app.vwo.com and Verify the Current url!")
	    @Test
	    public void test_Selenium02(){
		 WebDriverManager.chromedriver().setup();
	        // Open the url
		 WebDriver driver = new ChromeDriver();

	        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX),
	        // Create New Session Endpoint - 16 digit Unique ID is also created.


	        // get the title
	        //         // Navigate the URL -> HTTP GET the URL
	        driver.get("https://app.vwo.com");

	        // verify the title
	        // Assert the URL - Validation - TestNG Assertions

	        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

	        // POST request to close all the tabs in the browser
	        driver.quit();


	    }
}
