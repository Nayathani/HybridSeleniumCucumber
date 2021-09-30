package com.testCases;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.SeleniumReusableFunctions.SeleniumUtilities;
import com.pages.LoginPage;


public class LoginTestCase extends Library {
	LoginPage lpage;
	 SeleniumUtilities sUti;
	@BeforeTest
   public void stratUp() {
       launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

   }
   @Test
   public void login() {
       LoginPage lpage=new LoginPage(driver);
       lpage.login("Admin", "admin123");

   }
   @AfterClass
   public void close() throws IOException {
       SeleniumUtilities sUti = new SeleniumUtilities(driver);
       sUti.to_take_screenshot("C:\\Users\\RAHUL\\eclipse-workspace\\LTI\\HybridSeleniumCucumber\\src\\test\\resources\\screenshots\\orange.png");
       quit();

   }

}