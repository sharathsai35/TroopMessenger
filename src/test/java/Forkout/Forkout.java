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

public class Forkout {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
	htmlReporter = new ExtentHtmlReporter("forkout.html");
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
		ExtentTest test = extent.createTest("Multiple users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("@Ashok 123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("Mentions");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:@Ashok 123 ");
		test.info("Forkout:select multiple users");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: It should display mentions as highlight");
		test.log(Status.FAIL,"ACTUAL RESULT::  mentions was not highlighted");
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/div/div[1]/div[5]/div/div/div[1]/div/div[3]/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("hi");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("Deselecting Marker");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:hi");
		test.info("Forkout:select multiple users");
		test.info("Forkout:Deselect marker");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: System should display the msgs without forkout symbol");
		test.log(Status.PASS,"ACTUAL RESULT:: System should display the msgs without forkout symbol");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[4]/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("@Ashok");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[3]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("Deselecting marker with mentions");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:@Ashok");
		test.info("Forkout:select multiple users");
		test.info("Forkout:Deselect marker");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: System should display mentions without forkout symbol");
		test.log(Status.PASS,"ACTUAL RESULT::  System should display mentions without forkout symbol");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[3]/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("@Ashok");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("By using forkout with groups");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:@Ashok");
		test.info("Forkout:select multiple users");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: System should display mentions are highlight to particular users");
		test.log(Status.PASS,"ACTUAL RESULT::  System should display mentions are highlight to particular users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[3]/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("@Ashok123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("Mentions with forkout");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:@Ashok123");
		test.info("Forkout:select multiple users");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: System should display messages with highlighted to particular users");
		test.log(Status.FAIL,"ACTUAL RESULT::  messages are not highlighted to particular users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[3]/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("how r u");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("Deselecting marker");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:how r u");
		test.info("Forkout:select multiple users");
		test.info("Forkout:Deselecting marker");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: System should display the msgs without forkout symbol to particular users");
		test.log(Status.PASS,"ACTUAL RESULT::  System should display the msgs without forkout symbol to particular users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/div[5]/div/div/div[1]/div/div[3]/div[2]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[4]/span[2]")).sendKeys("@CFV");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[1]/div/div[10]/div[2]/div[6]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[2]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[3]/div[1]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[12]/div[2]/div[1]/div[3]/div/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"sendMessageBtn\"]")).click();
		ExtentTest test = extent.createTest("Deselecting marker with mentions");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:msmsai@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Input:@CFVzhghsdh123‌");
		test.info("Forkout:select multiple users");
		test.info("Forkout:deselect marker");
		test.info("Submit:Click on Send Button");
		test.info("EXPECTED RESULT:: System should display the mentions without fork symbol to particular users");
		test.log(Status.FAIL,"ACTUAL RESULT::  it is not highlighting the mention content ");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
