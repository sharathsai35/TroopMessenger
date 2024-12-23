package locationTracking;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class location {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports Extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Location Tracking in chat.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-1']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='locationTrackingCancelBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Click on location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on location Tracking icon");
		test.info("View the timeslots");
		test.info("EXPECTED RESULT:: It should display location tracking time slots");
		Assert.assertEquals(a, "Location Tracking");
		test.pass(a);
		Assert.assertEquals(a1, "Location Tracking\n"
				+ "Set time : 01 min05 min10 min\n"
				+ "Request\n"
				+ "cancel");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying location tracking timeslots");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-1']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='location-tracking-start-time '])[1]")).getText();
		driver.findElement(By.xpath("//span[@class='location-tracking-start-time ']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='locationTrackingStartBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//div[@id='locationTrackingStartBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-2']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='locationTrackingUserRejectBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test = Extent.createTest("Click on any timeslot & Start the location tracking");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on location Tracking icon");
		test.info("Click on any timeslots");
		test.info("Click on start");
		test.info("EXPECTED RESULT:: It should send the request to the user");
		Assert.assertEquals(a, "Location Tracking");
		test.pass(a);
		Assert.assertEquals(a1, "Location Tracking\n"
				+ "Set time : 01 min05 min10 min\n"
				+ "Request\n"
				+ "cancel");
		test.pass(a1);
		Assert.assertEquals(a2, "05 min");
		test.pass(a2);
		Assert.assertEquals(a3, "locationTrackingStartBtn");
		test.pass(a3);
		Assert.assertEquals(a4, "Location Tracking\n"
				+ "waiting for maneesh's acceptance...\n"
				+ "cancel");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is sending the request to the user");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-1']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='location-tracking-start-time '])[1]")).getText();
		driver.findElement(By.xpath("//span[@class='location-tracking-start-time ']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='locationTrackingCancelBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//div[@id='locationTrackingCancelBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-1 hidden']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Cancel the location tracking");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on location Tracking icon");
		test.info("Click on any timeslots");
		test.info("Click on cancel");
		test.info("EXPECTED RESULT:: It should not send the request to the user");
		Assert.assertEquals(a, "Location Tracking");
		test.pass(a);
		Assert.assertEquals(a1, "Location Tracking\n"
				+ "Set time : 01 min05 min10 min\n"
				+ "Request\n"
				+ "cancel");
		test.pass(a1);
		Assert.assertEquals(a2, "05 min");
		test.pass(a2);
		Assert.assertEquals(a3, "locationTrackingCancelBtn");
		test.pass(a3);
		Assert.assertEquals(a4, "location-tracking-options-container-1 hidden");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not sending the request to the user");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-location-tracking-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-1']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='location-tracking-start-time '])[1]")).getText();
		driver.findElement(By.xpath("//span[@class='location-tracking-start-time ']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='locationTrackingStartBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//div[@id='locationTrackingStartBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-2']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='locationTrackingUserRejectBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//span[@id='locationTrackingUserRejectBtn']")).click();
		Thread.sleep(2000);
		String a6=driver.findElement(By.xpath("//div[@class='location-tracking-options-container-2 hidden']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = Extent.createTest("Cancel the request");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on location Tracking icon");
		test.info("Click on any timeslots");
		test.info("Click on start");
		test.info("Cancel the request to user acceptance");
		test.info("EXPECTED RESULT:: It should send the request to the user");
		Assert.assertEquals(a, "Location Tracking");
		test.pass(a);
		Assert.assertEquals(a1, "Location Tracking\n"
				+ "Set time : 01 min05 min10 min\n"
				+ "Request\n"
				+ "cancel");
		test.pass(a1);
		Assert.assertEquals(a2, "05 min");
		test.pass(a2);
		Assert.assertEquals(a3, "locationTrackingStartBtn");
		test.pass(a3);
		Assert.assertEquals(a4, "Location Tracking\n"
				+ "waiting for maneesh's acceptance...\n"
				+ "cancel");
		test.pass(a4);
		Assert.assertEquals(a5, "locationTrackingUserRejectBtn");
		test.pass(a5);
		Assert.assertEquals(a6, "location-tracking-options-container-2 hidden");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is sending the request to the user");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		Extent.flush();
	}
}
