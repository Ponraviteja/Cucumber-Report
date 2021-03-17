package org.baseclass.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void launchUrl(String Url) {
		
		driver.get(Url);
	}
	
	public static void fill(WebElement ref, String Value) {

		ref.sendKeys(Value);
	}
	
	public static void butClick(WebElement Button) {
		
		Button.click();
	}

}
