package com.raghib.selenium;

/* REFERENCE
https://www.youtube.com/watch?v=Mvg08wMy5iE
 */
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//options.setHeadless(true);	//In Selenium version 4.8.0 its Deprecated.
		//options.setHeadless(false);	//In Selenium version 4.8.0 its Deprecated.
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		
//		Duration duration = Duration.ofSeconds(30);		
//		driver.manage().timeouts().implicitlyWait(duration);
//		driver.manage().timeouts().pageLoadTimeout(duration);
		
		driver.get("https://www.google.com/");
		
		System.out.println("Page Title : "+driver.getTitle());
		driver.quit();

	}

}
