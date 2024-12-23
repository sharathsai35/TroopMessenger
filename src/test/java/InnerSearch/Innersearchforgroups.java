package InnerSearch;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Innersearchforgroups {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("InnerSearchforgroups.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void test000() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a4=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on inner search in user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("EXPECTED RESULT:: It should display inner search");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a4, "Enter characters to search");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying inner search");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test001() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter valid text in inner search");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("EXPECTED RESULT:: It should display related msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test002() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("adssad");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='no-conversation-found-text']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Enter invalid text in inner search");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : sadsa");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "Ouhh... It's empty in here.");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test003() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']"));
		e.sendKeys(Keys.BACK_SPACE);
		String a4=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Clear the entered text in inner search");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Clear the entered text");
		test.info("EXPECTED RESULT:: It should clear the entered text");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a3);
		Assert.assertEquals(a4, "Enter characters to search");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clearing the entered text");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//All users
	@Test
	public void test004() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on all users in inner search");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("EXPECTED RESULT:: It should click on all users tab");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is clicking on all users tab");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test005() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-username='maneesh']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-44-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a7=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on all users & Select one user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("EXPECTED RESULT:: It should display user msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "maneesh");
		test.pass(a6);
		Assert.assertEquals(a5, "TODAY\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22\n"
				+ "Ouhh... It's empty in here.");
		test.pass(a5);
		Assert.assertEquals(a7, "maneesh");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying user msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test006() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a7=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Select myself user in all users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Select myself");
		test.info("EXPECTED RESULT:: It should display myself msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "sharath");
		test.pass(a6);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Ouhh... It's empty in here.");
		test.pass(a5);
		Assert.assertEquals(a7, "Myself");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only myself msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test007() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-username='doo']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-64-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a7=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Select the user in all users(User didnot msg in that group)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Select user");
		test.info("EXPECTED RESULT:: It should not display user msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "doo");
		test.pass(a6);
		Assert.assertEquals(a5, "Ouhh... It's empty in here.");
		test.pass(a5);
		Assert.assertEquals(a7, "doo");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not displaying only myself msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test008() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		String a8=driver.findElement(By.xpath("//div[@data-username='doo']")).getAttribute("data-username");
		String a9=driver.findElement(By.xpath("//div[@data-username='maneesh']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-64-1']")).click();
		driver.findElement(By.xpath("//label[@for='searchSender-44-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a7=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Select multiple user in all users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Select myself");
		test.info("Select user & user1");
		test.info("EXPECTED RESULT:: It should display multiple user msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "sharath");
		test.pass(a6);
		Assert.assertEquals(a8, "doo");
		test.pass(a8);
		Assert.assertEquals(a9, "maneesh");
		test.pass(a9);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22\n"
				+ "Ouhh... It's empty in here.");
		test.pass(a5);
		Assert.assertEquals(a7, "3 Selected");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying multiple user msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test009() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='searchSenderInput']")).sendKeys("sharath");
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Search the valid user in all users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Click on search in all users");
		test.info("Enter valid username");
		test.info("EXPECTED RESULT:: It should search the username");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "Myself");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is searching the username");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test010() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='searchSenderInput']")).sendKeys("sai teja");
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Search the invalid user in all users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Click on search in all users");
		test.info("Enter invalid username : sai teja");
		test.info("EXPECTED RESULT:: It should not display usernames");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not displaying usernames");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//All dates
	@Test
	public void test10() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on all dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("EXPECTED RESULT:: It should display dates");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying dates");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test11() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-option']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-option']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Today dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select Today");
		test.info("EXPECTED RESULT:: It should display today date msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Today");
		test.pass(a2);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Today date msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test12() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[2]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Yesterday dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select Yesterday");
		test.info("EXPECTED RESULT:: It should display Yesterday date msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Yesterday");
		test.pass(a2);
		Assert.assertEquals(a5, "Ouhh... It's empty in here.");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Yesterday date msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test13() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Late 7 days");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select Last 7 days");
		test.info("EXPECTED RESULT:: It should display Last 7 days msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Last 7 Days");
		test.pass(a2);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Last 7 days msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test14() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[4]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Last 30 days");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select Last 30 days");
		test.info("EXPECTED RESULT:: It should display last 30 days msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Last 30 Days");
		test.pass(a2);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Last 30 days msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test15() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[5]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on This month");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select This month");
		test.info("EXPECTED RESULT:: It should display This month msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "This Month");
		test.pass(a2);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying This month msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test16() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[6]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on This year");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select This year");
		test.info("EXPECTED RESULT:: It should display This year msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "This Year");
		test.pass(a2);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying This year msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test17() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[7]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Last year");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select Last year");
		test.info("EXPECTED RESULT:: It should display Last year msgs");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Last Year");
		test.pass(a2);
		Assert.assertEquals(a5, "Ouhh... It's empty in here.");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Last year msgs");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test18() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[8]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on All dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select All dates");
		test.info("EXPECTED RESULT:: It should display Enter characters to search");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "All Dates");
		test.pass(a2);
		Assert.assertEquals(a5, "Enter characters to search");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Enter characters to search");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test19() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='single-conversation-custom-option-label'])")).getText();
		//driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Apply without entering any date");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select date range");
		test.info("Don't enter any date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Date Range");
		test.pass(a2);
		Assert.assertEquals(a6, "Please select from date");
		test.pass(a6);
		Assert.assertEquals(a5, "Enter characters to search");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test20() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='single-conversation-custom-option-label'])")).getText();
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterFrom']")).click();
		String a7=driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterFrom']")).getAttribute("placeholder");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr//td[@class='today day']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Apply by entering only from date");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select date range");
		test.info("Select only from date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Date Range");
		test.pass(a2);
		Assert.assertEquals(a7, "From");
		test.pass(a7);
		Assert.assertEquals(a6, "Please select to date");
		test.pass(a6);
		Assert.assertEquals(a5, "Enter characters to search");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test21() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='single-conversation-custom-option-label'])")).getText();
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterTo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[3]/td[4]")).click();
		String a7=driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterTo']")).getAttribute("placeholder");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Apply by entering only to date");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select date range");
		test.info("Select only to date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Date Range");
		test.pass(a2);
		Assert.assertEquals(a7, "To");
		test.pass(a7);
		Assert.assertEquals(a6, "Please select from date");
		test.pass(a6);
		Assert.assertEquals(a5, "Enter characters to search");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test22() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("(//span[@class='single-conversation-custom-option-label'])")).getText();
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterFrom']")).click();
		String a7=driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterFrom']")).getAttribute("placeholder");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr//td[@class='today day']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterTo']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterTo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[3]/td[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='singleConversationCustomDateRangeFilterApply']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Apply by entering from & to dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select date range");
		test.info("Click on from date & Select the date");
		test.info("Click on to date & Select the date");
		test.info("Click on apply");
		test.info("EXPECTED RESULT:: It should display ");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a2, "Date Range");
		test.pass(a2);
		Assert.assertEquals(a7, "From");
		test.pass(a7);
		Assert.assertEquals(a6, "To");
		test.pass(a6);
		Assert.assertEquals(a5, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying Enter characters to search");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Filters icon
	@Test
	public void test23() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on text icon");
		test.info("EXPECTED RESULT:: It should display only text msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Text");
		test.pass(a2);
		Assert.assertEquals(a3, "TODAY\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only text msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test24() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on text icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on text icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only text msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Text");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only text msgs with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test25() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[2]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[2]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//img[@class='image_attachment']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on image icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on image icon");
		test.info("EXPECTED RESULT:: It should display only images msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Image");
		test.pass(a2);
		Assert.assertEquals(a3, "image_attachment");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only images msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test26() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[2]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//img[@class='image_attachment']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on image icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on image icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only images with up & down arrow with count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Image");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "image_attachment");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only images with up & down arrow with count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test27() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[3]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[3]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on video icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on video icon");
		test.info("EXPECTED RESULT:: It should display only video msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Media");
		test.pass(a2);
		Assert.assertEquals(a3, "video-attachment-wrapper");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only video msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test28() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[3]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on video icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on video icon");
		test.info("Click on switch icon");
		test.info("EXPECTED RESULT:: It should display only videos with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Media");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "video-attachment-wrapper");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only videos with up & down & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test29() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[4]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[4]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on doc icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on doc icon");
		test.info("EXPECTED RESULT:: It should display only doc msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "File");
		test.pass(a2);
		Assert.assertEquals(a3, "sai__maneeh.pdf");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only doc msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test30() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[4]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on doc icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on doc icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only doc msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "File");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "sai__maneeh.pdf");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only doc msgs up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test31() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[5]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[5]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='browser-link']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on link icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on link icon");
		test.info("EXPECTED RESULT:: It should display only link msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Link");
		test.pass(a2);
		Assert.assertEquals(a3, "https://www.google.com");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only link msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test32() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[5]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//span[@class='browser-link']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on link icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on link icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only link msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Link");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "https://www.google.com");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only link msgs with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test33() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[6]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[6]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='messenger-contact-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on contact icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on contact icon");
		test.info("EXPECTED RESULT:: It should display only contacts in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Contact");
		test.pass(a2);
		Assert.assertEquals(a3, "messenger-contact-wrapper");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only contacts in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test34() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[6]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@class='messenger-contact-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on contact icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on contact icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only contacts with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Contact");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "messenger-contact-wrapper");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only contacts with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test35() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[7]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[7]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='conversation-location-map']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Location icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Location icon");
		test.info("EXPECTED RESULT:: It should display only Location in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Location");
		test.pass(a2);
		Assert.assertEquals(a3, "conversation-location-map");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Location in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test36() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[7]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@class='conversation-location-map']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Location icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Location icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only Location with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Location");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "conversation-location-map");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Location with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test37() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[8]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[8]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Read Receipt icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Read Receipt icon");
		test.info("EXPECTED RESULT:: It should display only Read Receipt msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Read Receipt");
		test.pass(a2);
		Assert.assertEquals(a3, "read-receipt-chat-button");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only read receipt msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test38() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[8]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@class='read-receipt-chat-button']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Read Receipt icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Read Receipt icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only Read Receipt msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Read Receipt");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "read-receipt-chat-button");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only read receipt msgs with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test39() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[9]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[9]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@class='flag-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Flag icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Flag icon");
		test.info("EXPECTED RESULT:: It should display only Flag msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Flag");
		test.pass(a2);
		Assert.assertEquals(a3, "flag-conversation-label-icon");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Flag msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test40() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[9]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//span[@class='flag-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Flag icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Flag icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only Flag msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Flag");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "flag-conversation-label-icon");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Flag msgs with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test41() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[10]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[10]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='respond-later-chat-icon']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Respond Later icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Respond Later icon");
		test.info("EXPECTED RESULT:: It should display only Respond Later msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Respond Later");
		test.pass(a2);
		Assert.assertEquals(a3, "respond-later-chat-icon");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Respond Later msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test42() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[10]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@class='respond-later-chat-icon']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Respond Later icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Respond Later icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only Respond Later msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Respond Later");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "respond-later-chat-icon");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Respond Later msgs with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test43() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[11]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[11]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Code Snippet icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Code Snippet icon");
		test.info("EXPECTED RESULT:: It should display only Code Snippet msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Code Snippet");
		test.pass(a2);
		Assert.assertEquals(a3, "code-snippet-wrapper");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Code Snippet msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test44() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group creation']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[11]")).getAttribute("title");
		driver.findElement(By.xpath("(//div[@class='search-filter-icon'])[11]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='conversationSearchArrowContainer']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@class='code-snippet-wrapper']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Code Snippet icon & switch");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on Code Snippet icon");
		test.info("Click on switch button");
		test.info("EXPECTED RESULT:: It should display only Code Snippet msgs with up & down arrow & count");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Code Snippet");
		test.pass(a2);
		Assert.assertEquals(a4, "conversationSearchArrowContainer");
		test.pass(a4);
		Assert.assertEquals(a3, "code-snippet-wrapper");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying only Code Snippet msgs with up & down arrow & count");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of enter text & all users
	@Test
	public void test45() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a7=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & Select the user in all users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "sharath");
		test.pass(a6);
		Assert.assertEquals(a5, "TODAY\n"
				+ "test\n"
				+ "14:22\n"
				+ "Ouhh... It's empty in here.");
		test.pass(a5);
		Assert.assertEquals(a7, "Myself");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test46() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("asdas");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a7=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & Select the user in all users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter invalid text : sadsa");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a6, "sharath");
		test.pass(a6);
		Assert.assertEquals(a5, "Ouhh... It's empty in here.");
		test.pass(a5);
		Assert.assertEquals(a7, "Myself");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combination of enter text & all dates
	@Test
	public void test47() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a6=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & Select last 7 days in all dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all dates");
		test.info("Select Last 7 days");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a6, "Last 7 Days");
		test.pass(a6);
		Assert.assertEquals(a5, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test48() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("asdas");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a6=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & Select last 7 days in all dates");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter invalid text : sadsa");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a6, "Last 7 Days");
		test.pass(a6);
		Assert.assertEquals(a5, "Ouhh... It's empty in here.");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of enter text & filter icons
	@Test
	public void test49() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & Select text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on text icon");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a5, "Text");
		test.pass(a5);
		Assert.assertEquals(a6, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test50() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("asdas");
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & Select text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter invalid text : sadsa");
		test.info("Click on text icon");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a5, "Text");
		test.pass(a5);
		Assert.assertEquals(a6, "Ouhh... It's empty in here.");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of enter text,all users & all dates
	@Test
	public void test51() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & Select the user & Select the date");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a5, "sharath");
		test.pass(a5);
		Assert.assertEquals(a10, "Myself");
		test.pass(a10);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a9);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test52() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("asdas");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & Select the user & Select the date");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter invalid text : sadsa");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a5, "sharath");
		test.pass(a5);
		Assert.assertEquals(a10, "Myself");
		test.pass(a10);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Ouhh... It's empty in here.");
		test.pass(a9);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of enter text,all users & filters icon
	@Test
	public void test53() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & Select the user & Select text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Select text icon in filters");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a5, "sharath");
		test.pass(a5);
		Assert.assertEquals(a10, "Myself");
		test.pass(a10);
		Assert.assertEquals(a6, "Text");
		test.pass(a6);
		Assert.assertEquals(a7, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test54() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("asdas");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & Select the user & Select text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : asdad");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Select text icon in filters");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Users");
		test.pass(a3);
		Assert.assertEquals(a4, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a4);
		Assert.assertEquals(a5, "sharath");
		test.pass(a5);
		Assert.assertEquals(a10, "Myself");
		test.pass(a10);
		Assert.assertEquals(a6, "Text");
		test.pass(a6);
		Assert.assertEquals(a7, "Ouhh... It's empty in here.");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of enter text,all dates & filters icon
	@Test
	public void test55() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a5=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & Select the date & Select text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Select text icon in filters");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a5, "Last 7 Days");
		test.pass(a5);
		Assert.assertEquals(a6, "Text");
		test.pass(a6);
		Assert.assertEquals(a7, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test56() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("asdas");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a5=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & Select the date & Select text icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : sadasd");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Select text icon in filters");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "Search");
		test.pass(a2);
		Assert.assertEquals(a3, "All Dates");
		test.pass(a3);
		Assert.assertEquals(a4, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a4);
		Assert.assertEquals(a5, "Last 7 Days");
		test.pass(a5);
		Assert.assertEquals(a6, "Text");
		test.pass(a6);
		Assert.assertEquals(a7, "Ouhh... It's empty in here.");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of all users & all dates
	@Test
	public void test57() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of select user & Select the date");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22");
		test.pass(a9);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related myself msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combination of all users,all dates & filters icon
	@Test
	public void test58() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of select user & Select the date & filters icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a10);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combination of all dates & filter icon
	@Test
	public void test59() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of Select the date & filters icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "TODAY\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a10);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of enter text,all users,all dates & filter icon
	@Test
	public void test60() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("t");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter valid text & select user & Select the date & filters icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("EXPECTED RESULT:: It should display related myself msgs in chat page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a10);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying related msgs in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test61() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("aasda");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of enter invalid text & select user & Select the date & filters icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : dsaf");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("EXPECTED RESULT:: It should display error msg");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "Ouhh... It's empty in here.");
		test.pass(a10);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying error msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//combination of search with refresh
	@Test
	public void test62() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		String a13=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of search with valid data & Click on refresh");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("Click on refresh icon");
		test.info("EXPECTED RESULT:: It should refresh the page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a10);
		Assert.assertEquals(a12, "Refresh");
		test.pass(a12);
		Assert.assertEquals(a13, "Enter characters to search");
		test.pass(a13);
		test.log(Status.PASS,"ACTUAL RESULT::  It is refreshing the page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test63() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("aasda");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		String a13=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of search with invalid data & Click on refresh icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : dsaf");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("Click on refresh icon");
		test.info("EXPECTED RESULT:: It should refresh the page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "Ouhh... It's empty in here.");
		test.pass(a10);
		Assert.assertEquals(a12, "Refresh");
		test.pass(a12);
		Assert.assertEquals(a13, "Enter characters to search");
		test.pass(a13);
		test.log(Status.PASS,"ACTUAL RESULT::  It is refreshing the page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combination of search & refresh & Close
	@Test
	public void test64() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		String a13=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a14=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		String a15=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a16=driver.findElement(By.xpath("//div[@class='single-conversation-search-container hidden']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of search with valid data & Click on refresh & click on close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("Click on refresh icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should close the search page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a10);
		Assert.assertEquals(a12, "Refresh");
		test.pass(a12);
		Assert.assertEquals(a13, "Enter characters to search");
		test.pass(a13);
		Assert.assertEquals(a14, "Close");
		test.pass(a14);
		Assert.assertEquals(a15, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a15);
		Assert.assertEquals(a16, "single-conversation-search-container hidden");
		test.pass(a16);
		test.log(Status.PASS,"ACTUAL RESULT::  It is closing the search page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test65() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("aasda");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a12=driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-refresh-icon']")).click();
		Thread.sleep(1000);
		String a13=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a14=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		String a15=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a16=driver.findElement(By.xpath("//div[@class='single-conversation-search-container hidden']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of search with invalid data & Click on refresh & click on close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : sadaf");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("Click on refresh icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should close the search page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "Ouhh... It's empty in here.");
		test.pass(a10);
		Assert.assertEquals(a12, "Refresh");
		test.pass(a12);
		Assert.assertEquals(a13, "Enter characters to search");
		test.pass(a13);
		Assert.assertEquals(a14, "Close");
		test.pass(a14);
		Assert.assertEquals(a15, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a15);
		Assert.assertEquals(a16, "single-conversation-search-container hidden");
		test.pass(a16);
		test.log(Status.PASS,"ACTUAL RESULT::  It is refreshing the page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combination of search & Close
	@Test
	public void test66() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a14=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		String a15=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a16=driver.findElement(By.xpath("//div[@class='single-conversation-search-container hidden']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of search with valid data & click on close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : test");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should close the search page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "TODAY\n"
				+ "test\n"
				+ "14:22");
		test.pass(a10);
		Assert.assertEquals(a14, "Close");
		test.pass(a14);
		Assert.assertEquals(a15, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a15);
		Assert.assertEquals(a16, "single-conversation-search-container hidden");
		test.pass(a16);
		test.log(Status.PASS,"ACTUAL RESULT::  It is closing the search page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test67() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-name='group search']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='conversation-filter-search-icon']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='single-conversation-search-container']")).getAttribute("class");
		String a11=driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).getAttribute("placeholder");
		driver.findElement(By.xpath("//input[@id='singleConversationSearchInput']")).sendKeys("aasda");
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		driver.findElement(By.xpath("//span[@id='senderSelectedText']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='search-sender-users-wrapper']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@data-username='sharath']")).getAttribute("data-username");
		driver.findElement(By.xpath("//label[@for='searchSender-1-1']")).click();
		driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//span[@id='senderSelectedText']")).getText();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).getText();
		driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-active-text']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@class='single-conversation-cutom-date-filter-options-wrapper']")).getText();
		String a8=driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='single-conversation-cutom-date-filter-option'])[3]")).click();
		Thread.sleep(1000);
		String a9=driver.findElement(By.xpath("//div[@class='search-filter-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='search-filter-icon']")).click();
		Thread.sleep(1000);
		String a10=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		Thread.sleep(1000);
		String a14=driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='single-conversation-search-close-icon']")).click();
		Thread.sleep(1000);
		String a15=driver.findElement(By.xpath("//div[@id='messengerConversationMessage']")).getText();
		String a16=driver.findElement(By.xpath("//div[@class='single-conversation-search-container hidden']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of search with invalid data & click on close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on group");
		test.info("Click on search icon");
		test.info("Enter text : sadaf");
		test.info("Click on all users");
		test.info("Select the user");
		test.info("Click on all dates");
		test.info("Select last 7 days");
		test.info("Click on text filter icon");
		test.info("Click on close button");
		test.info("EXPECTED RESULT:: It should close the search page");
		Assert.assertEquals(a, "conversation-filter-search-icon");
		test.pass(a);
		Assert.assertEquals(a1, "single-conversation-search-container");
		test.pass(a1);
		Assert.assertEquals(a11, "Search");
		test.pass(a11);
		Assert.assertEquals(a2, "All Users");
		test.pass(a2);
		Assert.assertEquals(a3, "doo\n"
				+ "JO\n"
				+ "john\n"
				+ "MA\n"
				+ "maneesh\n"
				+ "Myself");
		test.pass(a3);
		Assert.assertEquals(a4, "sharath");
		test.pass(a4);
		Assert.assertEquals(a5, "Myself");
		test.pass(a5);
		Assert.assertEquals(a6, "All Dates");
		test.pass(a6);
		Assert.assertEquals(a7, "Today\n"
				+ "Yesterday\n"
				+ "Last 7 Days\n"
				+ "Last 30 Days\n"
				+ "This Month\n"
				+ "This Year\n"
				+ "Last Year\n"
				+ "All Dates\n"
				+ "Date Range");
		test.pass(a7);
		Assert.assertEquals(a8, "Last 7 Days");
		test.pass(a8);
		Assert.assertEquals(a9, "Text");
		test.pass(a9);
		Assert.assertEquals(a10, "Ouhh... It's empty in here.");
		test.pass(a10);
		Assert.assertEquals(a14, "Close");
		test.pass(a14);
		Assert.assertEquals(a15, "TODAY\n"
				+ "You created group\n"
				+ "test\n"
				+ "14:22\n"
				+ "Maneesh\n"
				+ "MA\n"
				+ "hiii\n"
				+ "14:22");
		test.pass(a15);
		Assert.assertEquals(a16, "single-conversation-search-container hidden");
		test.pass(a16);
		test.log(Status.PASS,"ACTUAL RESULT::  It is refreshing the page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
