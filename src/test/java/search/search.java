package search;

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

public class search {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("search.html");
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
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		ExtentTest test = extent.createTest("Find the message");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("EXPECTED RESULT:: System should highlight the given input message");		
		test.log(Status.PASS,"ACTUAL RESULT::  Given input message was highlighted");
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
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		ExtentTest test = extent.createTest("Select AllUsers");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		test.log(Status.PASS,"ACTUAL RESULT::  Given input message was highlighted");
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
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		ExtentTest test = extent.createTest("Select AllDays");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on All days");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		test.log(Status.PASS,"ACTUAL RESULT::  Given input message was highlighted");
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
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[2]")).click();
		ExtentTest test = extent.createTest("Select Today");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on Today");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='snackbar']")).getText(), "No results Found!");
		test.log(Status.PASS,"ACTUAL RESULT::  No results Found!");
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
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[1]")).click();
		ExtentTest test = extent.createTest("Select Yesterday");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on Yesterday");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='snackbar']")).getText(), "No results Found!");
		test.log(Status.PASS,"ACTUAL RESULT::  No results Found!");
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
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[3]")).click();
		ExtentTest test = extent.createTest("Select Last 7days");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on Last 7days");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='snackbar']")).getText(), "No results Found!");
		test.log(Status.PASS,"ACTUAL RESULT::  No results Found!");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[4]")).click();
		ExtentTest test = extent.createTest("Select Last 30days");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on Last 30days");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		test.log(Status.PASS,"ACTUAL RESULT::   Given input message was highlighted");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[5]")).click();
		ExtentTest test = extent.createTest("Select This month");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on This month");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		test.log(Status.PASS,"ACTUAL RESULT::  Given input message was highlighted");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[6]")).click();
		ExtentTest test = extent.createTest("Select This year");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on This year");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		test.log(Status.PASS,"ACTUAL RESULT::  Given input message was highlighted");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test9() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[7]")).click();
		ExtentTest test = extent.createTest("Select Last year");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on Last year");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='snackbar']")).getText(), "No results Found!");
		test.log(Status.PASS,"ACTUAL RESULT::  No results Found!");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase10() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("vcx");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div[9]/span"));
		driver.findElement(By.xpath("//*[@id=\"singleConversationCustomDateRangeFilterFrom\"]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationCustomDateRangeFilterTo\"]")).click();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/tbody/tr[4]/td[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationCustomDateRangeFilterApply\"]")).click();
		ExtentTest test = extent.createTest("Select Date Range");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any user");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUser:Select the user");
		test.info("AllDates:click on DateRange");
		test.info("From:15-10-2021");
		test.info("To:19-10-2021");
		test.info("click on Apply");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='snackbar']")).getText(), "No results Found!");
		test.log(Status.PASS,"ACTUAL RESULT::  No results Found!");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase11() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-name='testing']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[7]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"singleConversationSearchInput\"]")).sendKeys("hi");
		driver.findElement(By.xpath("//*[@id=\"senderSelectedText\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[3]/div[1]/label")).click();
		ExtentTest test = extent.createTest("Find the message in group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Click on any Group");
		test.info("Search:Click on search");
		test.info("Search bar:Type the message");
		test.info("AllUsers:Select multiple users");
		test.info("AllDates:Select AllDays");
		test.info("EXPECTED RESULT:: System should highlight the given input message");
		test.log(Status.PASS,"ACTUAL RESULT::  Given input message was highlighted");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}

}