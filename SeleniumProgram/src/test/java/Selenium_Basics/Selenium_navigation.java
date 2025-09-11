package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;


public class Selenium_navigation {
	
	@Description("open the url")
	@Test
	
	public void Test() throws InterruptedException
	{
		
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--incognito");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://google.com");
		Thread.sleep(1000);
		driver.navigate().to("https://bing.com");
		Thread.sleep(1000);
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	}
	
	

}
