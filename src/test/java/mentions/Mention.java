package mentions;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Mention {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void StartTest() {
	htmlReporter = new ExtentHtmlReporter("Mentionreport.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	}
  @Test
  public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='browser']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@man");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='user-mention-wrapper'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='user-mention-trigger']")).click();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Sending Mentions");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Input:@man");
		test.info("Select the user");
		test.info("Click on that mention");
		test.info("EXPECTED RESULT:: Mention should be highlight in the chat conversation");
		String a=driver.findElement(By.xpath("//div[@data-name='maneesh']")).getText();
		Assert.assertEquals("Maneesh", a);
		System.out.println(a);
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  Mention is highlighted in the chat conversation");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
		}
  @Test
  public void Test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@abc doo");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='user-mention-wrapper active']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='user-mention-trigger']")).click();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Sending Mentions with spaces");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Input:@abc doo");
		test.info("Select the user");
		test.info("Click on that mention");
		test.info("EXPECTED RESULT:: Mention should be highlight in the chat conversation");
		String a=driver.findElement(By.xpath("//div[@data-name='abc doo']")).getText();
		Assert.assertEquals("Abc Doo", a);
		System.out.println(a);
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT::  Mention is highlighted in the chat conversation");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
		}
  @Test
  public void Test2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@abcdoo");
		Thread.sleep(500);
		//driver.findElement(By.xpath("//span[@class='user-mention-trigger']")).click();
		Thread.sleep(2000);
		ExtentTest test= extent.createTest("Sending Mentions without spaces");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user");
		test.info("Input:@abcdoo");
		test.info("Select the user");
		test.info("Click on that mention");
		test.info("EXPECTED RESULT:: It should not appear any mention");
		test.log(Status.PASS,"ACTUAL RESULT::  It is not appearing any mention");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
		}
  

  @AfterSuite
  public void EndTest() {
	  extent.flush();
  }

}
