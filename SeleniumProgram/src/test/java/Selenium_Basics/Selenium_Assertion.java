package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import static org.assertj.core.api.Assertions.*;


public class Selenium_Assertion {
	@Description("open the url")

	@Test
	  public void test_Selenium01() {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        // TestNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/?zx=1756405454355&no_sw_cr=1");
       // AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
	}
	
	

}
