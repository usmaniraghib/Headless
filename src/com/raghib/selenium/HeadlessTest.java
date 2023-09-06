package com.raghib.selenium;

import java.time.Duration;

/* REFERENCE
https://www.youtube.com/watch?v=Mvg08wMy5iE
 */

import org.openqa.selenium.WebDriver;

public class HeadlessTest extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";
	
	public static String url = "https://www.google.com/";
	
	public static void main(String[] args) {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);

		// options.setHeadless(true); //In Selenium version 4.8.0 its Deprecated.
		// options.setHeadless(false); //In Selenium version 4.8.0 its Deprecated.
		// options.addArguments("--headless=new"); //In Selenium version 4.9.0 own words.
		
		System.out.println("Page Title : " + driver.getTitle());
		BaseClass.quitDriver();
	}
}
