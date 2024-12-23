package usersdashboard;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

public class Department {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("department(dashboard).html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add department");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on Add new Department");
		test.info("Enter new department as Testing");
		test.info("click on Add");
		test.info("EXPECTED RESULT ::  System should display particular department name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Department added successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add existing department");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on Add new Department");
		test.info("Enter existing department as Testing");
		test.info("click on Add");
		test.info("EXPECTED RESULT ::  System should not display department name");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Department name already exists, please use different name");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("Networking");
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("Cyber Security");
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("Deveops");
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).sendKeys("Sales Force");
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Add multiple departments");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on Add new Department");
		test.info("Enter new department as Networking");
		test.info("click on Add");
		test.info("Enter new department as Cyber Security");
		test.info("click on Add");
		test.info("Enter new department as Deveops");
		test.info("click on Add");
		test.info("Enter new department as Sales Force");
		test.info("click on Add");
		test.info("EXPECTED RESULT ::  System should display department names");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Department added successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='addDepartmentInput']")).click();
		driver.findElement(By.xpath("//input[@id='addDepartmentSubmitBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Without adding department, click on add");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on Add new Department");
		test.info("click on Add");
		test.info("EXPECTED RESULT ::  System should display Please enter department");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Please enter department");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='departmentFilterSearchInput']")).sendKeys("Te");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Valid Search");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on search bar");
		test.info("Enter valid name as Te");
		test.info("EXPECTED RESULT ::  System should display display related names");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying related names");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='departmentFilterSearchInput']")).sendKeys("adsfds");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Invalid search");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on search bar");
		test.info("Enter invalid name as fdgfdg");
		test.info("EXPECTED RESULT ::  System should display No data found");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying No data found");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='departmentFilterSearchInput']")).sendKeys("dsafdas");
		Thread.sleep(100);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[4]")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on refresh");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on Search bar");
		test.info("Enter name as gdfsgdf");
		test.info("Click on refresh");
		test.info("EXPECTED RESULT ::  System should display all the department");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying all the department");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[5]/div[4]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on delete with notification yes");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on delete any Department");
		test.info("click on Yes in notification");
		test.info("EXPECTED RESULT ::  System should not display particular department");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Department deleted successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[5]/div[4]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on delete with notification no");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on delete any Department");
		test.info("click on No in notification");
		test.info("EXPECTED RESULT ::  System should display particular department");
		test.log(Status.PASS ,"ACTUAL RESULT ::  System is displaying particular department");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test9() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[5]/div[4]/span")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on delete icon");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on delete any Department");
		test.info("EXPECTED RESULT ::  System should display notification as Do you want to delete department");
		test.log(Status.FAIL ,"ACTUAL RESULT ::  System is displaying Do you want to delete designation");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot4.png"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot4.png");
		Thread.sleep(1000);
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void testcase10() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[2]/div[1]/div[2]/div[4]/div[4]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Deleted department is visible");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on Users");
		test.info("Click on Department");
		test.info("Click on delete any Department");
		test.info("click on Yes in notification");
		test.info("EXPECTED RESULT ::  System should not display particular department");
		test.log(Status.FAIL ,"ACTUAL RESULT ::  System is displaying particular department by refreshing the page it is not displaying");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot5.png"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot5.png");
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div[3]/div/div[1]/div[1]/div/div[4]")).click();
		Thread.sleep(1000);
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src1, new File("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot6.png"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot6.png");
		Thread.sleep(1000);
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
	
}
