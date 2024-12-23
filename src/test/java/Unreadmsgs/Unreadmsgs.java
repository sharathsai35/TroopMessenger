package Unreadmsgs;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Unreadmsgs {
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports Extent;
	@BeforeSuite
	public void beforeSuite() {
		htmlreporter= new ExtentHtmlReporter("Unread messages.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlreporter);
	}	
	@Test
	public void Test0() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//click on Unread msgs
		driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).click();
		Thread.sleep(200);
		String a = driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).getAttribute("id");
		Assert.assertEquals("unreadMessageFilterBtn", a);
		ExtentTest test= Extent.createTest("Click on Unread messages");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Unread messages: Click on Unread messages icon");
		test.info("EXPECTED RESULT:: It should display Unread messages page");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying Unread messages page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
	}
	@Test
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-forkout-btn input-action-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-1478-2']")).click();
		driver.findElement(By.xpath("//label[@for='forkoutUser-1-1479-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//click on Unread msgs
		driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).click();
		Thread.sleep(200);
		String a = driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).getAttribute("id");
		Assert.assertEquals("unreadMessageFilterBtn", a);
		Thread.sleep(300);
		String b = driver.findElement(By.xpath("//div[@data-name='removed group 12']")).getAttribute("data-name");
		Assert.assertEquals("removed group 12", b);
		Thread.sleep(300);
		String c = driver.findElement(By.xpath("//div[@data-name='Android']")).getAttribute("data-name");
		Assert.assertEquals("Android", c);
		Thread.sleep(300);
		ExtentTest test= Extent.createTest("By sending msgs to the user1 & Login the user1 & View the unread msg icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on user1");
		test.info("Send the msg with forkout to user1 & groups");
		test.info("Login the user1");
		test.info("In user1 , Click on unread msg icon");
		test.info("EXPECTED RESULT:: It should display Unread messages users/groups");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying Unread messages users/groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
	}
	@Test
	public void Test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//click on Unread msgs
		driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).click();
		Thread.sleep(200);
		String a = driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).getAttribute("id");
		Assert.assertEquals("unreadMessageFilterBtn", a);
		Thread.sleep(300);
		//click on users/group
		driver.findElement(By.xpath("//div[@data-name='removed group 12']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@data-name='Android']")).click();
		Thread.sleep(300);
		//click on Unread msgs
		driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).click();
		Thread.sleep(600);
		//click on Unread msgs
		driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).click();
		Thread.sleep(200);
		String b = driver.findElement(By.xpath("//div[@data-name='removed group 12']")).getText();
		Assert.assertEquals("", b);
		Thread.sleep(300);
		String c = driver.findElement(By.xpath("//div[@data-name='Android']")).getText();
		Assert.assertEquals("", c);
		Thread.sleep(300);
		ExtentTest test= Extent.createTest("Click on Unread messages & click on users/groups");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Unread messages: Click on Unread messages icon");
		test.info("User/group: Click on users/groups");
		test.info("Unread messages: Click on Unread messages icon");
		test.info("Unread messages: Click on Unread messages icon");
		test.info("EXPECTED RESULT:: It should not display Read	 messages users/groups");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying Read messages users/groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
	}
	@Test
	public void Test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//click on Unread msgs
		driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).click();
		Thread.sleep(200);
		String a = driver.findElement(By.xpath("//span[@id='unreadMessageFilterBtn']")).getAttribute("id");
		Assert.assertEquals("unreadMessageFilterBtn", a);
		Thread.sleep(300);
		String b = driver.findElement(By.xpath("//div[@class='no-unread-contacts-section']")).getText();
		Assert.assertEquals("All caught up", b);
		Thread.sleep(300);
		ExtentTest test= Extent.createTest("Click on Unread messages without any unread msgs");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Unread messages: Click on Unread messages icon");
		test.info("EXPECTED RESULT:: It should display All caught up");
		test.pass(a);
		test.pass(b);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying All caught up");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
	}
	@AfterSuite
	public void afterSuite() {
		Extent.flush();
	}

}
