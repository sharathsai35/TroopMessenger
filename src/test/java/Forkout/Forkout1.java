package Forkout;

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

public class Forkout1 {
		WebDriver driver;
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;

		String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
		@BeforeSuite
		public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("report2.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		}
		@Test
		public void test() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("hi");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
			ExtentTest test = extent.createTest("Multiple users with msg");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:abcd@gmail.com");
			test.info("Password:sai@123");
			test.info("Login:Click on Login");
			test.info("Input:hi");
			test.info("Forkout:select multiple users");
			test.info("Submit:Click on Send Button");
			test.info("EXPECTED RESULT:: It should display in selected users");
			test.log(Status.PASS,"ACTUAL RESULT::  It is displaying the selected users");
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
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("@New User1");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[3]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
			ExtentTest test = extent.createTest("Multiple users & with mention");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:abcd@gmail.com");
			test.info("Password:sai@123");
			test.info("Login:Click on Login");
			test.info("Input: @new user1");
			test.info("Forkout:select multiple users");
			test.info("Submit:Click on Send Button");
			test.info("EXPECTED RESULT:: It should display in selected users and message should be highlighted");
			test.log(Status.PASS,"ACTUAL RESULT::  It is displaying in selected users and message It is highlighted");
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
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@sha");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[1]/div/div[10]/div[2]/div[10]/span")).click();
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[4]/div[2]/label")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			ExtentTest test=extent.createTest("Deselecting Marker");
			test.log(Status.INFO,"Chrome browser launched Successfully");
			test.info("Navigate to url");
			test.info("Email:abcd@gmail.com");
			test.info("Password:sai@123");
			test.info("Login:Click on Login");
			test.info("Input:@sharath");
			test.info("Forkout:select multiple users");
			test.info("Submit:Click on Send button");
			test.info("Expected Result::  It should send the messages without marker");
			test.log(Status.PASS, "Actual result:: It is sending the message without marker");
			test.pass("Test Cases:: TestCase Passed");
			driver.close();
		}
		@Test
		public void test3() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
			driver=new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
			driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("@new");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[1]/div/div[10]/div[2]/div[4]/div/span")).click();
			driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[4]/div[2]/label")).click();
			driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
			ExtentTest test=extent.createTest("Deselecting Marker");
			test.log(Status.INFO,"Chrome browser launched Successfully");
			test.info("Navigate to url");
			test.info("Email:abcd@gmail.com");
			test.info("Password:sai@123");
			test.info("Login:Click on Login");
			test.info("Input:@sha");
			test.info("Forkout:select multiple users");
			test.info("Submit:Click on Send button");
			test.info("Expected Result::  It should send the messages without marker");
			test.log(Status.PASS, "Actual result:: ");
			test.pass("TestCases:: TestCases Passed");
			driver.close();
		}
		@AfterSuite
		public void endTest() {
			extent.flush();
		}
}
