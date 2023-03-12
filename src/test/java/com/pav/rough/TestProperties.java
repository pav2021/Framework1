package com.pav.rough;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestProperties{

	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		Properties or = new Properties();
		// System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		fis= new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\or.properties");
		or.load(fis);
		
		/*
		 * String browser = config.getProperty("browser"); String fbloginbutton =
		 * or.getProperty("fblgn"); if (browser.equalsIgnoreCase("chrome")) {
		 * //setProperty("WebDriver.chrome.driver", ); WebDriver driver = new
		 * ChromeDriver(); } if (browser.equalsIgnoreCase("firefox")) {
		 * //setProperty("WebDriver.chrome.driver", ); WebDriver driver = new
		 * FirefoxDriver(); } else if (browser.equalsIgnoreCase("edge")) {
		 * //setProperty("WebDriver.chrome.driver", ); WebDriver driver = new
		 * EdgeDriver(); }
		 */
		
		
	}
}
