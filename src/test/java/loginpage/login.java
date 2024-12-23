package loginpage;

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

public class login {
	WebDriver driver;
	ExtentHtmlReporter HtmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void Starttest() {
		HtmlReporter = new ExtentHtmlReporter("loginpage.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on login without data");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: ");
		test.info("Password: ");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should display toast as Username is requried ");
		String a=driver.findElement(By.xpath("/html/body/div[6]/div[2]")).getText();
		Assert.assertEquals("Username is required!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Username is required! ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("login");
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on login with only email");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: sharath@trends.com");
		test.info("Password: ");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should display toast as Password is requried ");
		String a=driver.findElement(By.xpath("/html/body/div[6]/div[2]")).getText();
		Assert.assertEquals("Password is required!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Password is required! ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("1");
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on login with only password");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: ");
		test.info("Password: 123456");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should display toast as Username is requried ");
		String a=driver.findElement(By.xpath("/html/body/div[6]/div[2]")).getText();
		Assert.assertEquals("Username is required!", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Username is required! ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("2");
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("agfdgfd");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sdfaf");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on login with invalid details");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: fdsadsa");
		test.info("Password: sdfaf");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should not login with user ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Invalid Credentials", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("3");
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("agfdgfd");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on login with invalid email & valid password ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: fdsadsa");
		test.info("Password: 123456");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should not login with the user ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Invalid Credentials", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("4");
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asdfdf");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Click on login with valid email & invalid password ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: sharath@trends.com");
		test.info("Password: sdafds");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should not login with the user ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Invalid Credentials", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("5");
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on login with username & password ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: sharath");
		test.info("Password: 123456");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should not login with the user ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Invalid Credentials", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  Invalid Credentials ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("6");
	}
	@Test
	public void test7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on login with valid email & password ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email: sharath@trends.com");
		test.info("Password: 123456");
		test.info("Login:click on login");
		test.info("EXPECTED RESULT ::  It should login with the user ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is logining with the user ");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("7");
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
