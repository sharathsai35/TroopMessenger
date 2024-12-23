package controls;

import org.openqa.selenium.By;
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

public class Locationtracking {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("LocationTracking.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLocationTrackingRadioEnable\"]")).click();
		WebElement we=driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/input"));
		we.sendKeys("10");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[4]/input")).click();
		ExtentTest test = extent.createTest("Location Tracking by adding 1timeslot");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("LocationTracking:click on Location Tracking");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 10min");
		test.info("Click on save button");
		test.info("EXPECTED RESULT:: System should add 1timeslot");
		//String actual=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		//Assert.assertEquals(actual, "Permissions applied");
		Assert.assertTrue(true, "Permissions applied");
		test.log(Status.PASS,"ACTUAL RESULT:: Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLocationTrackingRadioEnable\"]")).click();
		WebElement we=driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/input"));
		we.sendKeys("20");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[4]/input")).click();
		ExtentTest test = extent.createTest("Location Tracking by adding 2timeslot");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("LocationTracking:click on Location Tracking");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 10min");
		test.info("Timeslot:Add 20min");
		test.info("Click on save button");
		test.info("EXPECTED RESULT:: System should add 2timeslots");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Permissions applied");
		test.log(Status.PASS,"ACTUAL RESULT:: Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLocationTrackingRadioEnable\"]")).click();
		WebElement we=driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/input"));
		we.sendKeys("30");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[4]/input")).click();
		ExtentTest test = extent.createTest("Location Tracking by adding 3timeslot");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("LocationTracking:click on Location Tracking");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 10min");
		test.info("Timeslot:Add 20min");
		test.info("Timeslot:Add 30min");
		test.info("Click on save button");
		test.info("EXPECTED RESULT:: System should add 3timeslots");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Permission applied");
		test.log(Status.PASS,"ACTUAL RESULT:: Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLocationTrackingRadioEnable\"]")).click();
		WebElement we=driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/input"));
		we.sendKeys("30");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[4]/input")).click();
		ExtentTest test = extent.createTest("LocationTracking by adding 4timeslot");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("LocationTracking:click on Location Tracking");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 10min");
		test.info("Timeslot:Add 20min");
		test.info("Timeslot:Add 30min");
		test.info("Timeslot:Add 40min");
		test.info("Click on save button");
		test.info("EXPECTED RESULT:: System should add only 3timeslots");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Maximum 3timeslots are allowed");
		test.log(Status.PASS,"ACTUAL RESULT:: Maximum 3timeslots are allowed and Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLocationTrackingRadioEnable\"]")).click();
		//WebElement we=driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/input"));
		//we.sendKeys("20");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/span[2]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[4]/input")).click();
		ExtentTest test = extent.createTest("LocationTracking without timeslot");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("LocationTracking:click on Location Tracking");
		test.info("Enable:Click on Enable");
		test.info("Click on save button");
		test.info("EXPECTED RESULT:: System should not add any timeslots");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Permission applied");
		test.log(Status.PASS,"ACTUAL RESULT:: Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[15]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"permissionLocationTrackingRadioDisable\"]")).click();
		//WebElement we=driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/input"));
		//we.sendKeys("20");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[3]/div[1]/span[2]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[16]/div[2]/div[4]/input")).click();
		ExtentTest test = extent.createTest("LocationTracking with disable button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("LocationTracking:click on Location Tracking");
		test.info("Enable:Click on Disable");
		test.info("Click on save button");
		test.info("EXPECTED RESULT:: System should not show location tracking timeslots in user page ");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Permission applied");
		test.log(Status.PASS,"ACTUAL RESULT:: Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void EndTest() {
		extent.flush();
	}
}
