package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigLoader;

public class SiteCheck {
	
	
	@Test
	public void checkSite() {
		System.out.println("Testing Starts!!!");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(ConfigLoader.getMyValue("easy.url"));
		String str = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertTrue(str.contains("Selenium Easy Demo"));
		
		
	}

}
