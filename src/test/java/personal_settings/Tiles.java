package personal_settings;

import java.awt.AWTException;

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

public class Tiles {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Tiles.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void test00() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Tiles");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("EXPECTED RESULT:: It should display tiles page");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying tiles page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='tile-wrapper']")).getText();
		String a4=driver.findElement(By.xpath("//label[@class='switch disabled']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on Tiles");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("View the switch button in chat");
		test.info("EXPECTED RESULT:: It should display switch disable of chat & It should not switch the button");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Chat");
		test.pass(a3);
		Assert.assertEquals(a4, "switch disabled");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying switch disable & It is not switching the button");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//cattle call
	@Test
	public void test02() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[9]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[9]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Hide the cattle call icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Switch button of cattle call");
		test.info("EXPECTED RESULT:: It should switch the button of cattle call");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Cattle Call");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "messenger-app-wrapper hide-tile");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of cattle call");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[9]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[9]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-app='conference']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Remove from hide(Cattle call icon)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Again switch button of cattle call");
		test.info("EXPECTED RESULT:: It should switch the button of cattle call");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Cattle Call");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "conference");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of cattle call");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//contact
	@Test
	public void test04() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[2]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[10]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[10]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Hide the contact icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Switch button of contact");
		test.info("EXPECTED RESULT:: It should switch the button of contact");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Contacts");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "messenger-app-wrapper hide-tile");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of contact");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[2]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[10]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[10]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-app='troop-apps']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Remove from hide(Contacts)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Again switch button of Contacts");
		test.info("EXPECTED RESULT:: It should switch the button of Contacts");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Contacts");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "troop-apps");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of Contacts");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Admin dashboard
	@Test
	public void test06() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[3]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[11]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[11]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Hide the admin dashboard icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Switch button of admin dashboard");
		test.info("EXPECTED RESULT:: It should switch the button of admin dashboard");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Admin Dashboard");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "messenger-app-wrapper hide-tile");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of admin dashboard");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test07() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[3]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[11]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[11]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-app='dashboard']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Remove from hide(Admin dashboard icon)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Again switch button of Admin dashboard");
		test.info("EXPECTED RESULT:: It should switch the button of Admin dashboard");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Admin Dashboard");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "dashboard");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of Admin dashboard");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Tm Monitor
	@Test
	public void test08() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[4]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[12]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[12]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Hide the Tm Monitor icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Switch button of Tm Monitor");
		test.info("EXPECTED RESULT:: It should switch the button of Tm Monitor");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Tm Monitor");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "messenger-app-wrapper hide-tile");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of Tm Monitor");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test09() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[4]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[12]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[12]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-app='tm-monitor']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Remove from hide(Tm Monitor icon)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Again switch button of Tm Monitor");
		test.info("EXPECTED RESULT:: It should switch the button of Tm Monitor");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Tm Monitor");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "tm-monitor");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of Tm Monitor");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//help
	@Test
	public void test10() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper'])[2]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[13]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[13]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Hide the Help icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Switch button of Help");
		test.info("EXPECTED RESULT:: It should switch the button of Help");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Help");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "messenger-app-wrapper hide-tile");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of Help");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test11() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper'])[2]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[13]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[13]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-app='support']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Remove from hide(Help icon)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Again switch button of Help");
		test.info("EXPECTED RESULT:: It should switch the button of Help");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Help");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a5, "support");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is switching the button of help");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Personal settings
	@Test
	public void test12() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper border-none'])")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch disabled'])[2]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch disabled'])[2]")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-app='settings']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Remove from hide(Personal Settings icon)");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Again switch button of Personal Settings");
		test.info("EXPECTED RESULT:: It should not switch the button of Personal Settings");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Personal Settings");
		test.pass(a3);
		Assert.assertEquals(a4, "switch disabled");
		test.pass(a4);
		Assert.assertEquals(a5, "settings");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not switching the button of Personal Settings");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Move the icons
	@Test
	public void test13() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])")).getText();
		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[8]/div/div[2]/div[3]/div[2]/div[4]/span")).getAttribute("class");
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[8]/div/div[2]/div[3]/div[2]/div[4]/span"));
		WebElement e1=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[8]/div/div[2]/div[3]/div[3]/div[4]/span"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).clickAndHold(e).moveToElement(e1).release(e).perform();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Move the cattle call icon near to contacts icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Move the cattle call near to contact icon");
		test.info("EXPECTED RESULT:: It should move the cattle call near to contacts icon");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Cattle Call");
		test.pass(a3);
		Assert.assertEquals(a4, "tile-move-icon");
		test.pass(a4);
		Assert.assertEquals(a5, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is moving the cattle call near to contacts icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test14() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])")).getText();
		String a4=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]")).getAttribute("class");
		WebElement e=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[5]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).clickAndHold(e).moveToElement(e1).release(e).perform();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Move the contacts near to Tm Monitor icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Move the contacts icon near to Tm Monitor icon");
		test.info("EXPECTED RESULT:: It should move the contacts icon near to Tm Monitor icon");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Contacts");
		test.pass(a3);
		Assert.assertEquals(a4, "tile-move-icon");
		test.pass(a4);
		Assert.assertEquals(a5, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Contacts\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT::  It is moving the contacts icon near to Tm Monitor icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test15() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[9]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[9]")).click();
		String a7=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]")).getAttribute("class");
		WebElement e=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[5]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).clickAndHold(e).moveToElement(e1).release(e).perform();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Hide the cattle call icon & Move the cattle call icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Hide the cattle call");
		test.info("Move the cattle call icon near to contacts icon");
		test.info("EXPECTED RESULT:: It should not display cattle call icon & It should move the cattle call icon near to contacts icon");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Cattle Call\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Contacts\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Cattle Call");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a7, "messenger-app-wrapper hide-tile");
		test.pass(a7);
		Assert.assertEquals(a5, "tile-move-icon");
		test.pass(a5);
		Assert.assertEquals(a6, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not display cattle call icon & It is moving the cattle call icon near to contacts icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test16() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[4]")).getText();
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[12]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[12]")).click();
		String a7=driver.findElement(By.xpath("//div[@data-app='conference']")).getAttribute("data-app");
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[3]")).getAttribute("class");
		WebElement e=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[3]"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[5]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).clickAndHold(e);
		Thread.sleep(1000);
		ac.moveToElement(e1).release(e).perform();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Switch the cattle call icon & Move the icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Click on switch button from hide(cattle call icon)");
		test.info("Move the cattle call icon near to Tm monitor icon");
		test.info("EXPECTED RESULT::  It should display cattle call icon & It should move the cattle call icon near to Tm monitor icon");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Admin Dashboard\n"
				+ "Tm Monitor\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Cattle Call");
		test.pass(a3);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a7, "conference");
		test.pass(a7);
		Assert.assertEquals(a5, "tile-move-icon");
		test.pass(a5);
		Assert.assertEquals(a6, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Admin Dashboard\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is display cattle call icon & It is moving the cattle call icon near to Tm monitor icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test17() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])")).getText();
		String a5=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]")).getAttribute("class");
		WebElement e=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[3]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).clickAndHold(e).moveToElement(e1).release(e).perform();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[10]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[10]")).click();
		String a7=driver.findElement(By.xpath("//div[@class='messenger-app-wrapper hide-tile']")).getAttribute("class");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Move the admin dashboard icon & Hide the admin dashboard icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Move the admin dashboard icon near to contacts icon");
		test.info("Hide the admin dashboard");
		test.info("EXPECTED RESULT:: It should move the admin dashboard icon near to contacts icon & It should not display admin dashboard icon");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Admin Dashboard\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Admin Dashboard");
		test.pass(a3);
		Assert.assertEquals(a5, "tile-move-icon");
		test.pass(a5);
		Assert.assertEquals(a6, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Cattle Call\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a6);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a7, "messenger-app-wrapper hide-tile");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is moving the admin dashboard icon near to contacts icon & It is not display admin dashboard icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test18() throws InterruptedException, AWTException {
		start();
		driver.findElement(By.xpath("//div[@data-app='settings']")).click();
		String a=driver.findElement(By.xpath("//div[@data-app='settings']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-tab='8']")).click();
		String a1=driver.findElement(By.xpath("//div[@data-tab='8']")).getText();
		String a2=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("(//div[@class='tile-wrapper ui-sortable-handle'])[2]")).getText();
		String a5=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]")).getAttribute("class");
		WebElement e=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[2]"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='tile-move-icon'])[3]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).clickAndHold(e).moveToElement(e1).release(e).perform();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//div[@data-content='8']")).getText();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("(//label[@class='switch'])[9]")).getAttribute("class");
		driver.findElement(By.xpath("(//label[@class='switch'])[9]")).click();
		String a7=driver.findElement(By.xpath("//div[@data-app='dashboard']")).getAttribute("data-app");
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Switch the admin dashboard icon & Move the icon");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on personal settings");
		test.info("Click on tiles");
		test.info("Move the admin dashboard icon near to cattle call icon");
		test.info("Click on switch button from hide(admin dashboard icon)");
		test.info("EXPECTED RESULT:: It should move the admin dashboard icon near to Tm monitor icon & It should display admin dashboard icon");
		Assert.assertEquals(a, "Personal Settings");
		test.pass(a);
		Assert.assertEquals(a1, "Tiles");
		test.pass(a1);
		Assert.assertEquals(a2, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Contacts\n"
				+ "Admin Dashboard\n"
				+ "Cattle Call\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a2);
		Assert.assertEquals(a3, "Admin Dashboard");
		test.pass(a3);
		Assert.assertEquals(a5, "tile-move-icon");
		test.pass(a5);
		Assert.assertEquals(a6, "Tiles Display\n"
				+ "Move\n"
				+ "Hide/Show\n"
				+ "Chat\n"
				+ "Admin Dashboard\n"
				+ "Contacts\n"
				+ "Cattle Call\n"
				+ "Tm Monitor\n"
				+ "Help\n"
				+ "Personal Settings");
		test.pass(a6);
		Assert.assertEquals(a4, "switch");
		test.pass(a4);
		Assert.assertEquals(a7, "dashboard");
		test.pass(a7);
		test.log(Status.PASS,"ACTUAL RESULT::  It is moving the admin dashboard icon near to Tm monitor icon & It is display admin dashboard icon");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
