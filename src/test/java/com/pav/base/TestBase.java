package com.pav.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	/*
	 * webdriver properties logs extentreports db excel mail
	 */
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	FileInputStream fis;
	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {

		
			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\or.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				or.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(System.getProperty("user.dir"));
			String browser = config.getProperty("browser");
			System.out.println(browser);
			// String fbloginbutton = or.getProperty("fblgn");

			if (driver == null) {
				if (browser.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					//System.setProperty("webdriver.chrome.driver","C:\\Users\\pavit\\eclipse-workspace\\DataDrivenFrameworkRA1\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				// setProperty("WebDriver.chrome.driver", );
				//driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				// setProperty("WebDriver.chrome.driver", );
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				// setProperty("WebDriver.chrome.driver", );
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		String Url = config.getProperty("testsiteurl");
		driver.get(Url);
		driver.manage().window().maximize();
			}//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}
}
