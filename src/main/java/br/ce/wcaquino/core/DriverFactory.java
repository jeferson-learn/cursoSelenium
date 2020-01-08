package br.ce.wcaquino.core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static WebDriver driver;
	
	private DriverFactory() {}
	
//	public static WebDriver getDriver(String driverName){
	public static WebDriver getDriver(){
		if(driver == null) {
			/*** Ken mini arrumou ***/ 
//			if(driverName.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\jeferson.lopes\\chromedriver\\chromedriver.exe");
//				driver = new ChromeDriver();
//			} else {
//				driver = new FirefoxDriver();
//			}
			
			switch (Propriedades.browser) {
				case FIREFOX:
					driver = new FirefoxDriver();				
					break;
				case CHROME: 
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\jeferson.lopes\\chromedriver\\chromedriver.exe");
					driver = new ChromeDriver();
					break;
			}
			
			driver.manage().window().setSize(new Dimension(1200, 765));			
		}
		
		return driver;
	}

	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
