package controls;

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

public class status {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("status.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saimsm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orangeMemberstatusEnable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='toolbar-user-status-selected-text-wrapper']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("By clicking on can't chat in Enable radiobutton");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:saimsm@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on status");
		test.info("click on Enable button");
		test.info("select can't chat");
		test.info("click on apply");
		test.info("GoTo chat");
		test.info("Click on dropdown in status");
		test.info("EXPECTED RESULT ::  System should display the can't chat status");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saimsm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orangeMemberstatusEnable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/div[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='toolbar-user-status-selected-text-wrapper']")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/span[2]")).click();
		Thread.sleep(500);
		ExtentTest test=extent.createTest("By clicking on InMeeting in Enable radiobutton");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:saimsm@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on status");
		test.info("click on Enable button");
		test.info("select InMeeting");
		test.info("click on apply");
		test.info("GoTo chat");
		test.info("Click on dropdown in status");
		test.info("EXPECTED RESULT ::  System should display the InMeeting status");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saimsm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orangeMemberstatusEnable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[4]/div[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='toolbar-user-status-selected-text-wrapper']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("By clicking on Away in Enable radiobutton");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:saimsm@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on status");
		test.info("click on Enable button");
		test.info("select Away");
		test.info("click on apply");
		test.info("GoTo chat");
		test.info("Click on dropdown in status");
		test.info("EXPECTED RESULT ::  System should display the Away status");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saimsm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orangeMemberstatusEnable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/div[3]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/div[4]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/div[4]/input")).sendKeys("leave");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/div[4]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/input")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Editing InMeeting in Enable radiobutton");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:saimsm@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on status");
		test.info("click on Enable button");
		test.info("select InMeeting");
		test.info("Click on Edit");
		test.info("Input:InMeeting we replaced as Leave ");
		test.info("click on apply");
		test.info("GoTo chat");
		test.info("Click on dropdown in status");
		test.info("EXPECTED RESULT ::  System should display the Leave status");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saimsm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orangeMemberstatusEnable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[3]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div[4]/div[4]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='toolbar-user-status-selected-text-wrapper']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("By clicking all checkbox in Enable radiobutton");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:saimsm@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on status");
		test.info("click on Enable button");
		test.info("select All checkboxes");
		test.info("click on apply");
		test.info("GoTo chat");
		test.info("Click on dropdown in status");
		test.info("EXPECTED RESULT ::  System should display all the status");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saimsm@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"orangeMemberstatusDisable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[2]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@class='toolbar-user-status-selected-text-wrapper']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("By clicking on Disable radiobutton");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:saimsm@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on status");
		test.info("click on disable button");
		test.info("click on apply");
		test.info("GoTo chat");
		test.info("Click on dropdown in status");
		test.info("EXPECTED RESULT ::  System should not display optional status");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void Endtest() {
		extent.flush();
	}

}
