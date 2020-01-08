package br.ce.wcaquino.test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	private WebDriver driver;

	@Before
	public void inicializa(){
		System.setProperty("webdriver.gecko.driver", "/Users/jeferson.lopes/geckodriver/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "/Users/jeferson.lopes/chromedriver/chromedriver.exe");
		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
	}
	
	@After
	public void finaliza(){
		driver.quit();
	}
	
	@Test
	public void teste() {
//		System.setProperty("webdriver.gecko.driver", "/Users/jeferson.lopes/geckodriver/geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", "/Users/jeferson.lopes/geckodriver");
//		System.setProperty("webdriver.chrome.driver", "/Users/wcaquino/Downloads/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
	}

//	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/Users/jeferson.lopes/geckodriver/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com");
//	}
}
