package Enhancement2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Videolinks {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("videolinks.html");
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
		StringSelection str = new StringSelection("/home/tvisha/Downloads/trim.7DEC34D2-2B2A-4007-9072-D1B006E72B83.MOV");
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
		Thread.sleep(2000);
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		Assert.assertEquals(a, "video-attachment-wrapper");
		String a1=driver.findElement(By.xpath("//span[@class='link-text']")).getText();
		WebElement e=driver.findElement(By.xpath("//span[@class='link-text']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		String a2=driver.findElement(By.xpath("//span[@class='copy-icon']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Send the video");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on attachment");
		test.info("Select the video & attach the video");
		test.info("EXPECTED RESULT:: It should display video attachment,link & copy icon");
		test.pass(a);
		Assert.assertEquals(a1, "https://media.troopmessenger.com/1672989777660_xajwrrSFyr/trim.7DEC34D2_2B2A_4007_9072_D1B006E72B83.MOV");
		test.pass(a1);
		Assert.assertEquals(a2, "copy-icon");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying video attachment,link & copy icon");
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
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		Assert.assertEquals(a, "video-attachment-wrapper");
		String a1=driver.findElement(By.xpath("//span[@class='link-text']")).getText();
		driver.findElement(By.xpath("//span[@class='link-text']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on attachment");
		test.info("Select the video & attach the video");
		test.info("Click on that link");
		test.info("EXPECTED RESULT:: It should click on that link");
		test.pass(a);
		Assert.assertEquals(a1, "https://media.troopmessenger.com/1672989777660_xajwrrSFyr/trim.7DEC34D2_2B2A_4007_9072_D1B006E72B83.MOV");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking on that link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
    }
	@Test
	public void test02() throws InterruptedException, AWTException {
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
		String a=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		Assert.assertEquals(a, "video-attachment-wrapper");
		String a1=driver.findElement(By.xpath("//span[@class='link-text']")).getText();
		WebElement e=driver.findElement(By.xpath("//span[@class='link-text']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).perform();
		driver.findElement(By.xpath("//span[@class='copy-icon']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		ExtentTest test = extent.createTest("Click on copy icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Click on attachment");
		test.info("Select the video & attach the video");
		test.info("Click on copy icon");
		test.info("EXPECTED RESULT:: It should click on copy icon");
		test.pass(a);
		Assert.assertEquals(a1, "https://media.troopmessenger.com/1672989777660_xajwrrSFyr/trim.7DEC34D2_2B2A_4007_9072_D1B006E72B83.MOV");
		test.pass(a1);
		Assert.assertEquals(a2, "Copied!");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking on copy icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
    }
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}	
	
