package DashboardGroups;

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

public class groups {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Dashboardgroups.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupsFilterSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='group-options-button']")).click();
		driver.findElement(By.xpath("//div[@data-type='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='content-close-btn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select any group view the profile");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Groups");
		test.info("Search test");
		test.info("Select any group");
		test.info("Click on view");
		test.info("Click on close button");
		test.info("EXPECTED RESULT ::  System should display the Group profile");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying the groups profile");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//input[@id='groupsFilterSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='group-options-button']")).click();
		driver.findElement(By.xpath("//div[@data-type='3']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[6]/div/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='test']")).click();
		ExtentTest test=extent.createTest("Select any group Delete all msg and Files");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Groups");
		test.info("Search test");
		test.info("Select any group");
		test.info("Click on Delete all msg & files");
		test.info("Click on refresh");
		test.info("Click on logout");
		test.info("Login with Group user");
		test.info("Click on Group");
		test.info("EXPECTED RESULT ::  System should display the Deleted All Msg & files in particular Group");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Data deleted successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//input[@id='groupsFilterSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='group-options-button']")).click();
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[6]/div/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='test']")).click();
		ExtentTest test=extent.createTest("Select any group Delete all msg");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Groups");
		test.info("Search test");
		test.info("Select any group");
		test.info("Click on Delete all msg");
		test.info("Click on refresh");
		test.info("Click on logout");
		test.info("Login with Group user");
		test.info("Click on Group");
		test.info("EXPECTED RESULT ::  System should display the Deleted All Msg in particular Group");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Data deleted successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupsFilterSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='group-options-button']")).click();
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[6]/div/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='test']")).click();
		ExtentTest test=extent.createTest("Select any group Delete all Files");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Groups");
		test.info("Search test");
		test.info("Select any group");
		test.info("Click on Delete all files");
		test.info("Click on refresh");
		test.info("Click on logout");
		test.info("Login with Group user");
		test.info("Click on Group");
		test.info("EXPECTED RESULT ::  System should display the Deleted All files in particular Group");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Data deleted successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//input[@id='groupsFilterSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='group-options-button'])[2]")).click();
		driver.findElement(By.xpath("(//div[@data-type='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[6]/div/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select any group, Delete Group ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Groups");
		test.info("Search test");
		test.info("Select any group");
		test.info("Click on Delete Group");
		test.info("Click on refresh");
		test.info("Click on logout");
		test.info("Login with Group user");
		test.info("EXPECTED RESULT ::  System should not display the particular Group");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Group deleted successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
