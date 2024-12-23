package controls;

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

public class MiscellaneousOther {
	WebDriver driver;
	ExtentHtmlReporter HtmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void Starttest() {
		HtmlReporter = new ExtentHtmlReporter("MiscellaneousOthers.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Miscellaneous']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[1]/div[1]/div[4]")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[1]/div[2]/div[4]/div/div[1]/span[2]")).getText();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//label[@for='permissionMiscellaneousScreenshotRadioDisable']")).getText();
		driver.findElement(By.xpath("//label[@for='permissionMiscellaneousScreenshotRadioDisable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[2]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous others with disallow in screenshot/screen recording");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on miscellaneous");
		test.info("Click on others tab");
		test.info("Click on radio button of disallow in screenshot/screen recording");
		test.info("click on save button");
		test.info("EXPECTED RESULT ::  It should select the radio button of disallow in Screen-Shot/ Screen-Recording");
		Assert.assertEquals(a, "Screen-Shot/ Screen-Recording");
		test.pass(a);
		Assert.assertEquals(a1, "Disallow");
		test.pass(a1);
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		test.info("ACTUAL RESULT ::  It is selecting the radio button of disallow in Screen-Shot/ Screen-Recording");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Miscellaneous']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[1]/div[1]/div[4]")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[1]/div[2]/div[4]/div/div[1]/span[2]")).getText();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//label[@for='permissionMiscellaneousScreenshotRadioEnable']")).getText();
		driver.findElement(By.xpath("//label[@for='permissionMiscellaneousScreenshotRadioEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[2]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous others with allow in screenshot/screen recording");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on miscellaneous");
		test.info("Click on others tab");
		test.info("Click on radio button of allow in screenshot/screen recording");
		test.info("click on save button");
		test.info("EXPECTED RESULT ::  It should select the radio button of allow in Screen-Shot/ Screen-Recording");
		Assert.assertEquals(a, "Screen-Shot/ Screen-Recording");
		test.pass(a);
		Assert.assertEquals(a1, "Allow");
		test.pass(a1);
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		test.info("ACTUAL RESULT ::  It is selecting the radio button of allow in Screen-Shot/ Screen-Recording");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
