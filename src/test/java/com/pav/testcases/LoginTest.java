package com.pav.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.pav.base.TestBase;

public class LoginTest extends TestBase{
	
	
	@Test
	public void loginTest() {
		
		driver.findElement(By.cssSelector(or.getProperty("fblgn"))).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
