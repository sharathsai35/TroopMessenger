package Enhancement2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Audiopopout {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("audiopopout.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test00() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='naga']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(1000);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1638963475702.mp3");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Control+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		Assert.assertEquals(a, "audio-attachment-wrapper");
		String a2=driver.findElement(By.xpath("//span[@class='audio-popout-icon']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Send the audio");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on attachment");
		test.info("Select the audio & attach the audio");
		test.info("EXPECTED RESULT:: It should display audio attachment & popout icon");
		test.pass(a);
		Assert.assertEquals(a2, "audio-popout-icon");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying audio attachment & popout icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
    }
	@Test
	public void test01() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='naga']")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='audio-attachment-wrapper']")).getAttribute("class");
		Assert.assertEquals(a, "audio-attachment-wrapper");
		String a2=driver.findElement(By.xpath("//span[@class='audio-popout-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//span[@class='audio-popout-icon']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Click on audio popout");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on attachment");
		test.info("Select the audio & attach the audio");
		test.info("Click on audio popout");
		test.info("EXPECTED RESULT:: It should click on audio popout icon");
		test.pass(a);
		Assert.assertEquals(a2, "audio-popout-icon");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking on audio popout icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.quit();
    }
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
