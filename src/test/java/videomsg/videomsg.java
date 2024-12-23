package videomsg;

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

public class videomsg {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports Extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("video msg.html");
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
		String a=driver.findElement(By.xpath("//div[@class='input-video-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-video-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='format-selection-wrapper']")).getText();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Click on video msg icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on video msg icon");
		test.info("View the page");
		test.info("EXPECTED RESULT:: It should click video msg");
		Assert.assertEquals(a, "Video Message");
		test.pass(a);
		Assert.assertEquals(a1, "");
		test.pass(a1);
		Assert.assertEquals(a3, "Video Resolution\n"
				+ "portrait [9:16]\n"
				+ "landscape [16:9]\n"
				+ "Start");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking video msg");
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
		String a=driver.findElement(By.xpath("//div[@class='input-video-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-video-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='format-selection-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='video-format active']")).getText();
		driver.findElement(By.xpath("//div[@class='video-format active']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='start-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='start-btn']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Potrait & Start the video");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on video msg icon");
		test.info("Click on portrait");
		test.info("Click on start");
		test.info("EXPECTED RESULT:: It should click video msg");
		Assert.assertEquals(a, "Video Message");
		test.pass(a);
		Assert.assertEquals(a3, "Video Resolution\n"
				+ "portrait [9:16]\n"
				+ "landscape [16:9]\n"
				+ "Start");
		test.pass(a3);
		Assert.assertEquals(a2, "portrait [9:16]");
		test.pass(a2);
		Assert.assertEquals(a1, "start-btn");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking video msg");
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
		String a=driver.findElement(By.xpath("//div[@class='input-video-btn input-action-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='input-video-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='format-selection-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='video-format']")).getText();
		driver.findElement(By.xpath("//div[@class='video-format']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='start-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='start-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Landscape & Start the video");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on video msg icon");
		test.info("Click on landscape");
		test.info("Click on start the video");
		test.info("EXPECTED RESULT:: It should display video msg");
		Assert.assertEquals(a, "Video Message");
		test.pass(a);
		Assert.assertEquals(a3, "Video Resolution\n"
				+ "portrait [9:16]\n"
				+ "landscape [16:9]\n"
				+ "Start");
		test.pass(a3);
		Assert.assertEquals(a2, "landscape [16:9]");
		test.pass(a2);
		Assert.assertEquals(a1, "start-btn");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying video msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		Extent.flush();
	}
}
