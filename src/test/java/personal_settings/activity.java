package personal_settings;

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

public class activity {
	
	WebDriver driver;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	@BeforeSuite
	  public void beforeSuite() {
		
		Htmlreporter = new ExtentHtmlReporter("Activity.html");
		Extent = new ExtentReports();
		Extent.attachReporter(Htmlreporter);
	  }
	
  @Test
  public void test() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		
		//activity
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[3]/span")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//*[@id=\"settingsLogoutAllDevices\"]")).getText();
		Assert.assertEquals("logout from all devices", a);
		

		ExtentTest test= Extent.createTest("Click on personal settings & activity");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Activity: Click on activity");
		
		

		test.info("EXPECTED RESULT:: It should display the active devices & usage");
		test.pass(a);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the active devices & usage");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  
  
  @Test
  public void test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		
		//activity
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[3]/span")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//*[@id=\"settingsLogoutAllDevices\"]")).getText();
		Assert.assertEquals("logout from all devices", a);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]")).click();
	

		ExtentTest test= Extent.createTest("Click on logout from selected browser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Activity: Click on activity");
		test.info("Logout: Click on logout from browser");
		
		

		test.info("EXPECTED RESULT:: It should display the user should be logout from browser");
		test.pass(a);
		
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the user is logout from browser");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  
  @Test
  public void test2() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		
		//activity
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[3]/span")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//*[@id=\"settingsLogoutAllDevices\"]")).getText();
		Assert.assertEquals("logout from all devices", a);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"settingsLogoutAllDevices\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		
		String b = driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).getText();
		Assert.assertEquals("LOGIN", b);
		
		

		ExtentTest test= Extent.createTest("Click on logout from all devices");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Activity: Click on activity");
		test.info("Logout: Click on logout from all devices");
		
		

		test.info("EXPECTED RESULT:: It should display the user should be logout from all devices");
		test.pass(a);
		test.pass(b);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the user is logout from all devices");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  

  @AfterSuite
  public void afterSuite() {
	  Extent.flush();
  }

}
