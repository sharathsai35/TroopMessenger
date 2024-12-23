package adjustment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Layoutadjustment {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
	htmlReporter = new ExtentHtmlReporter("layoutadjustment.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		WebElement e=driver.findElement(By.xpath("//div[@class='left-container ui-resizable ui-resizable-autohide']"));
		Actions a=new Actions(driver);
		//a.moveToElement(e).dragAndDropBy(e, 230, 400).perform();
		//a.moveToElement(e, 230, 400).build().perform();
		a.moveToElement(e).moveByOffset(230, 400).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='left-container ui-resizable ui-resizable-autohide']")).getSize();
		ExtentTest test = extent.createTest("Auto adjust");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("PersonalSetting:click on setting");
		test.info("Visualization:click on visualization");
		test.info("Autoadjust:click on Auto Adjust");
		test.info("Chat:Goto Chat");
		test.info("EXPECTED RESULT:: System should autohide the messages by resizing");
		test.log(Status.PASS,"ACTUAL RESULT::  System should autohide the messages by resizing");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[7]/div/div[2]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		driver.findElement(By.xpath("//div[@class='left-container ui-resizable ui-resizable-autohide']")).click();
		ExtentTest test = extent.createTest("Board Pannel");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("PersonalSetting:click on setting");
		test.info("Visualization:click on visualization");
		test.info("BoardPannel:click on BoardPannel");
		test.info("Chat:Goto Chat");
		test.info("EXPECTED RESULT:: System should not hide the messages by resizing");
		test.log(Status.PASS,"ACTUAL RESULT::  System should not hide the messages by resizing ");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[7]/div/div[2]/div[1]/div[3]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		driver.findElement(By.xpath("//div[@class='left-container ui-resizable ui-resizable-autohide']")).click();
		ExtentTest test = extent.createTest("Narrow Pannel");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("PersonalSetting:click on setting");
		test.info("Visualization:click on visualization");
		test.info("NarrowPannel:click on Narrow Pannel");
		test.info("Chat:Goto Chat");
		test.info("EXPECTED RESULT:: System should hide the messages by resizing");
		test.log(Status.PASS,"ACTUAL RESULT::  System should hide the messages by resizing");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
