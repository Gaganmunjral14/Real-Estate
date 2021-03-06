package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class SimpleTestCasesTest {
	private WebDriver driver; 
	private String baseUrl; 
	private HomePagePOM homePagePOM; 
	private static Properties properties; 
	private ScreenShot screenShot; 


	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homePagePOM = new HomePagePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void loginPassTest() {
		
		homePagePOM.clickloginBtn();
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("adminuser@12345");
		homePagePOM.clicksignInBtn();
		homePagePOM.clickhomePageBtn();
	    homePagePOM.clickuserMenuBtn();
	    homePagePOM.clickmyProfileBtn();
		homePagePOM.sendAgentTitle("manzoor");
		homePagePOM.sendphone("9876543210");
		homePagePOM.clicksaveChangeBtn();
		screenShot.captureScreenShot("First");
	}
	
	@Test
	public void loginPassTest1() {
		
		homePagePOM.clickloginBtn();
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("adminuser@12345");
		homePagePOM.clicksignInBtn();
		homePagePOM.clickhomePageBtn();
	    homePagePOM.clickuserMenuBtn();
	    homePagePOM.clickmyProfileBtn();
		homePagePOM.sendcurrentPassword("manzoor");
		homePagePOM.sendnewPassword("mehadi");
		homePagePOM.sendconfirmNewPassword("mehadi");
		homePagePOM.clicksaveChangeBtn();
		screenShot.captureScreenShot("First");
	}
	
	@Test
	public void loginPassTest2() {
		
		homePagePOM.clickloginBtn();
		homePagePOM.sendUserName("admin");
		homePagePOM.sendPassword("adminuser@12345");
		homePagePOM.clicksignInBtn();
		homePagePOM.clickhomePageBtn();
	    homePagePOM.clickuserMenuBtn();
	    homePagePOM.clicklogOutBtn();
		screenShot.captureScreenShot("First");
	}
	
}



	

