package Burnouttwouser;

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

public class twouser {
	WebDriver driver;
	WebDriver driver1;
	ExtentHtmlReporter htmlReporter;
	ExtentReports Extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Burnoutwithtwousers.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlReporter);
	}
	@Test
	public void testas() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinu@gmail.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//burnout option
		String a1=driver.findElement(By.xpath("//div[@class='input-burnout-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-burnout-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='private-chat-start-time active']")).getText();
		driver.findElement(By.xpath("//span[@class='private-chat-start-time active']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='privateChatStartBtn']")).getText();
		driver.findElement(By.xpath("//div[@id='privateChatStartBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//span[@class='burnout-user-acceptance-status-text']")).getText();
		Thread.sleep(1000);
		String a5=driver1.findElement(By.xpath("//span[@class='private-chat-alert-accept']")).getAttribute("class");
		driver1.findElement(By.xpath("//span[@class='private-chat-alert-accept']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@id='privateChatSopBtnNew']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		String a8 = driver1.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='privateChatSopBtnNew']")).click();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Burnout with two users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Open another chrome");
		test.info("Email : vinu@gmail.com");
		test.info("Password : 123456");
		test.info("Click on login");
		test.info("Send request to vinu from chrome1");
		Assert.assertEquals(a1, "input-burnout-btn input-action-btn");
		test.pass(a1);
		Assert.assertEquals(a2, "02 min");
		test.pass(a2);
		Assert.assertEquals(a3, "start");
		test.pass(a3);
		test.info("Accept the request of burnout in vinu");
		Assert.assertEquals(a4, "");
		test.pass(a4);
		Assert.assertEquals(a5, "private-chat-alert-accept");
		test.pass(a5);
		test.info("Send the msg");
		test.info("EXPECTED RESULT:: Messages should appear in both the users in burnout");
		Assert.assertEquals(a6, "privateChatSopBtnNew");
		test.pass(a6);
		Assert.assertEquals(a7, "hii");
		test.pass(a7);
		Assert.assertEquals(a8, "hii");
		test.pass(a8);
		test.log(Status.PASS,"ACTUAL RESULT:: Message appeared in both the user in burnout");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
		driver1.close();
	}
	@Test
	public void testas1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinu@gmail.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//burnout option
		String a1=driver.findElement(By.xpath("//div[@class='input-burnout-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-burnout-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='private-chat-start-time active']")).getText();
		driver.findElement(By.xpath("//span[@class='private-chat-start-time active']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='privateChatStartBtn']")).getText();
		driver.findElement(By.xpath("//div[@id='privateChatStartBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//span[@class='burnout-user-acceptance-status-text']")).getText();
		Thread.sleep(1000);
		String a5=driver1.findElement(By.xpath("//span[@class='private-chat-alert-accept']")).getAttribute("class");
		driver1.findElement(By.xpath("//span[@class='private-chat-alert-accept']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@id='privateChatSopBtnNew']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		String a8 = driver1.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='privateChatSopBtnNew']")).click();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Burnout in Trumpet");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Open another chrome");
		test.info("Email : vinu@gmail.com");
		test.info("Password : 123456");
		test.info("Click on login");
		test.info("Send request to vinu from chrome1");
		Assert.assertEquals(a1, "input-burnout-btn input-action-btn");
		test.pass(a1);
		Assert.assertEquals(a2, "02 min");
		test.pass(a2);
		Assert.assertEquals(a3, "start");
		test.pass(a3);
		test.info("Accept the request of burnout in vinu");
		Assert.assertEquals(a4, "");
		test.pass(a4);
		Assert.assertEquals(a5, "private-chat-alert-accept");
		test.pass(a5);
		test.info("Send the msg");
		Assert.assertEquals(a6, "privateChatSopBtnNew");
		test.pass(a6);
		Assert.assertEquals(a7, "hii");
		test.pass(a7);
		Assert.assertEquals(a8, "hii");
		test.pass(a8);
		test.info("Click on trumpet in burnout");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a9, "input-trumpet-btn input-action-btn");
		test.pass(a9);
		Assert.assertEquals(a10, "Trumpet is not allowed in Burnout");
		test.pass(a10);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
		driver1.close();
	}
	@Test
	public void testas2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinu@gmail.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//burnout option
		String a1=driver.findElement(By.xpath("//div[@class='input-burnout-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-burnout-btn input-action-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@class='private-chat-start-time active']")).getText();
		driver.findElement(By.xpath("//span[@class='private-chat-start-time active']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='privateChatStartBtn']")).getText();
		driver.findElement(By.xpath("//div[@id='privateChatStartBtn']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//span[@class='burnout-user-acceptance-status-text']")).getText();
		Thread.sleep(1000);
		String a5=driver1.findElement(By.xpath("//span[@class='private-chat-alert-accept']")).getAttribute("class");
		driver1.findElement(By.xpath("//span[@class='private-chat-alert-accept']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@id='privateChatSopBtnNew']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String a7 = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		String a8 = driver1.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='privateChatSopBtnNew']")).click();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Burnout in forkout,read receipt");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Open another chrome");
		test.info("Email : vinu@gmail.com");
		test.info("Password : 123456");
		test.info("Click on login");
		test.info("Send request to vinu from chrome1");
		Assert.assertEquals(a1, "input-burnout-btn input-action-btn");
		test.pass(a1);
		Assert.assertEquals(a2, "02 min");
		test.pass(a2);
		Assert.assertEquals(a3, "start");
		test.pass(a3);
		test.info("Accept the request of burnout in vinu");
		Assert.assertEquals(a4, "");
		test.pass(a4);
		Assert.assertEquals(a5, "private-chat-alert-accept");
		test.pass(a5);
		test.info("Send the msg");
		Assert.assertEquals(a6, "privateChatSopBtnNew");
		test.pass(a6);
		Assert.assertEquals(a7, "hii");
		test.pass(a7);
		Assert.assertEquals(a8, "hii");
		test.pass(a8);
		test.info("Click on forkout,read receipt in burnout");
		test.info("EXPECTED RESULT:: It should not click on forkout & read receipt");
		test.log(Status.PASS,"ACTUAL RESULT::  It is not clicking on forkout & read receipt");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
		driver1.close();
	}
	@AfterSuite
	public void endTest() {
		Extent.flush();
	}
}