package Selenium_Basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTest {

	   @Test
	    public void test_Code(){
	        Assert.assertEquals("pramod","Pramod");
	    }

	    @Test
	    public void test_OpenVWOLoginPage(){
	        // Open VWO.com, right?
	    	WebDriverManager.chromedriver().setup();
	        // Open the url
	    	WebDriver driver = new ChromeDriver();

	        driver.get("https://app.vwo.com");
	        driver.quit();

}
}
