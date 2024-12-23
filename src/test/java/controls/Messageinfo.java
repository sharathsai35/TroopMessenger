package controls;

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

public class Messageinfo {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Messageinfo.html");
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
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoDisable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on message info with disable for User");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on disable radio button");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display toast msg");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "You don't have permission to see message info.");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying toast msg");
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
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoDisable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='1234']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on message info with disable for group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on disable radio button");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on group");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display toast msg");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "You don't have permission to see message info.");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying toast msg");
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
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='abcdef']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on message info with enable for group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on group");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "4:09 pm");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on message info with enable for user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test04() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='user-read-heading-wrapper clearfix-height']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click on message info with enable for user with read time");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read time");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read time");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read time");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect read time & Select delivered time");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect the button of read time");
		test.info("select the button of delivered time");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with delivered time");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with delivered time");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test06() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect read & delivered time & Select device info");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect the button of read & delivered time");
		test.info("select the button of device info");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with device info");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with device info");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test07() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect read & delivered time & device info & Select location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect the button of read & delivered time & device info");
		test.info("select the button of Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "");
		test.pass(a2);
		Assert.assertEquals(a3, "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test08() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='abcdef']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a5=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a6=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect all in permission & Select the checkbox of Can see message info of other users in Group chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect all in permission");
		test.info("Select the checkbox of Can see message info of other users in Group chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "4:09 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "UnDelivered\n"
				+ "3 undelivered\n"
				+ "Sai Teja\n"
				+ "AB\n"
				+ "Abc\n"
				+ "MA\n"
				+ "Maneesh");
		test.pass(a2);
		Assert.assertEquals(a3, "");
		test.pass(a3);
		Assert.assertEquals(a4, "uppi\n"
				+ "test\n"
				+ "4:12 pm");
		test.pass(a4);
		Assert.assertEquals(a5, "UnDelivered\n"
				+"3 undelivered\n"
				+"Sai Teja\n"
				+"AB\n"
				+"Abc\n"
				+"MA\n"
				+ "Maneesh");
		test.pass(a5);
		Assert.assertEquals(a6, "");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test09() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='abcdef']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect the checkbox of Can see message info of other users in Group chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect all in permission");
		test.info("Deselect the checkbox of Can see message info of other users in Group chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on group");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should not display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "4:09 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "UnDelivered\n"
				+ "3 undelivered\n"
				+ "Sai Teja\n"
				+ "AB\n"
				+ "Abc\n"
				+ "MA\n"
				+ "Maneesh");
		test.pass(a2);
		Assert.assertEquals(a3, "");
		test.pass(a3);
		Assert.assertEquals(a4, "You don't have permission to see message info of other users.");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test10() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		//driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='messageInfoUserControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a5=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a6=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Select the checkbox of Can see message info of other users in User chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect all in permission");
		test.info("Select the checkbox of Can see message info of other users in User chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "");
		test.pass(a2);
		Assert.assertEquals(a3, "");
		test.pass(a3);
		Assert.assertEquals(a4, "uppi\n"
				+ "test\n"
				+ "4:18 pm");
		test.pass(a4);
		Assert.assertEquals(a5, "");
		test.pass(a5);
		Assert.assertEquals(a6, "");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test11() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		//driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='messageInfoUserControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect the checkbox of Can see message info of other users in User chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Deselect all in permission");
		test.info("Deselect the checkbox of Can see message info of other users in User chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should not display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "");
		test.pass(a2);
		Assert.assertEquals(a3, "");
		test.pass(a3);
		Assert.assertEquals(a4, "You don't have permission to see message info of other users.");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combinations
	//Read & Delivered
	@Test
	public void test12() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read & Delivered time");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read & delivered time");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read & delivered time");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm\n"
				+ "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read & delivered time");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Read & Delivered & Device info
	@Test
	public void test13() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read & Delivered time & Device info");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read & delivered time");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read & delivered time & device info");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm\n"
				+ "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read & delivered time & device info");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Read & Device info
	@Test
	public void test14() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read time & Device info");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read time & device info");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read time & device info");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read time & device info");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Delivered & Device info
	@Test
	public void test15() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of delivered time & Device info");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of delivered time & device info");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with delivered time & device info");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with delivered time & device info");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Read & delivered & device & location
	@Test
	public void test16() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read & delivered time & Device info & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read & delivered time & device info & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read & delivered time & device info & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm\n"
				+ "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read & delivered time & device info & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Read & delivered & location
	@Test
	public void test17() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read & delivered time & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read & delivered time & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read & delivered time & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm\n"
				+ "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read & delivered time & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Read & device info & Location
	@Test
	public void test18() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read time & Device info & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read time & device info & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read time & device info & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read time & device info & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Read & Location
	@Test
	public void test19() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of read time & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of read time & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with read time & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with read time & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Delivered & Location
	@Test
	public void test20() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of delivered time & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of delivered time & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with delivered time & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with delivered time & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Device & location
	@Test
	public void test21() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of device info & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of device info & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with device info & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with device info & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Delivered , Device & location
	@Test
	public void test22() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[2]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Combination of Delivered,device info & Location");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Switch the button of Delivered,device info & Location");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info page with Delivered,device info & Location");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info page with Delivered,device info & Location");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	//Combination with read,delivered time & Device info & Location with checkbox of group chat info
	@Test
	public void test23() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[@class='switch'])[1]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='abcdef']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a5=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a6=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Select all the permission & Select the checkbox of Can see message info of other users in Group chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Select all the permission");
		test.info("Select the checkbox of Can see message info of other users in Group chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "4:09 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "1 read\n"
				+ "Uppi\n"
				+ "Read\n"
				+ "4:12 pm\n"
				+ "Delivered\n"
				+ "4:12 pm\n"
				+ "UnDelivered\n"
				+ "3 undelivered\n"
				+ "Sai Teja\n"
				+ "AB\n"
				+ "Abc\n"
				+ "MA\n"
				+ "Maneesh");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		Assert.assertEquals(a4, "uppi\n"
				+ "test\n"
				+ "4:12 pm");
		test.pass(a4);
		Assert.assertEquals(a5, "Read\n"
				+ "1 read\n"
				+ "Sharath\n"
				+ "Read\n"
				+ "4:12 pm\n"
				+ "Delivered\n"
				+ "4:12 pm\n"
				+ "UnDelivered\n"
				+ "3 undelivered\n"
				+ "Sai Teja\n"
				+ "AB\n"
				+ "Abc\n"
				+ "MA\n"
				+ "Maneesh");
		test.pass(a5);
		Assert.assertEquals(a6, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test24() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='abcdef']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect the checkbox of Can see message info of other users in Group chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Select all the permission");
		test.info("Deselect the checkbox of Can see message info of other users in Group chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on group");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should not display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "4:09 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "1 read\n"
				+ "Uppi\n"
				+ "Read\n"
				+ "4:12 pm\n"
				+ "Delivered\n"
				+ "4:12 pm\n"
				+ "UnDelivered\n"
				+ "3 undelivered\n"
				+ "Sai Teja\n"
				+ "AB\n"
				+ "Abc\n"
				+ "MA\n"
				+ "Maneesh");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		Assert.assertEquals(a4, "You don't have permission to see message info of other users.");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test25() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='messageInfoUserControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a5=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a6=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Select the checkbox of Can see message info of other users in User chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Select all the permission");
		test.info("Select the checkbox of Can see message info of other users in User chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm\n"
				+ "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		Assert.assertEquals(a4, "uppi\n"
				+ "test\n"
				+ "4:18 pm");
		test.pass(a4);
		Assert.assertEquals(a5, "Read\n"
				+"4:18 pm\n"
				+"Delivered\n"
				+"4:18 pm");
		test.pass(a5);
		Assert.assertEquals(a6, "Browser\n"
				+"Hyderabad, IN (183.82.114.127)");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT::  It is displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test26() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@tez.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Message Info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='permissionMessageInfoEnable']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='switch']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[4]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//label[@class='switch'])[3]")).click();
		//driver.findElement(By.xpath("//label[@for='messageInfoGroupControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='messageInfoUserControlCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[20]/div[2]/div[6]/input")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='uppi']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		String a2=driver.findElement(By.xpath("//div[@class='message-user-info-wrapper']")).getText();
		String a3=driver.findElement(By.xpath("//div[@class='message-info-device-wrapper']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='messageInfoModalCloseBtn']")).click();
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		ac.contextClick(e1).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Deselect the checkbox of Can see message info of other users in User chat");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Username : sharath@tez.com");
		test.info("Password: 123456");
		test.info("Login:Click on Login");
		test.info("Click on dashboard");
		test.info("Click on controls");
		test.info("Click on message info");
		test.info("Click on enable radio button");
		test.info("Select all the permission");
		test.info("Deselect the checkbox of Can see message info of other users in User chat");
		test.info("Click on save button");
		test.info("Goto chat");
		test.info("Click on user");
		test.info("Select any msg & Right click on it");
		test.info("Click on info");
		test.info("Click on close button to info");
		test.info("Click on other user msg & Click on info");
		test.info("EXPECTED RESULT:: It should not display info of other users");
		Assert.assertEquals(a, "Permissions applied");
		test.pass(a);
		Assert.assertEquals(a1, "sharath\n"
				+ "test\n"
				+ "3:55 pm");
		test.pass(a1);
		Assert.assertEquals(a2, "Read\n"
				+ "4:18 pm\n"
				+ "Delivered\n"
				+ "4:12 pm");
		test.pass(a2);
		Assert.assertEquals(a3, "Browser\n"
				+ "Hyderabad, IN (183.82.114.127)");
		test.pass(a3);
		Assert.assertEquals(a4, "You don't have permission to see message info of other users.");
		test.pass(a4);
		test.log(Status.PASS,"ACTUAL RESULT::  It is not displaying info of other users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
