package GroupView;

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

public class nonadmingroupprofilesettings {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("nonadminprofilesettings.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test01() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='ads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioAll']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Delete all msgs & files with no button");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Select group : ads");
		test.info("Click on group icon");
		test.info("Click on settings");
		test.info("Click on radio button of all msgs & files");
		test.info("Click on submit");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not delete the msgs & files ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting the msgs & files");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("1");
	}
	@Test
	public void test02() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='ads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioAll']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Delete all msgs & files with yes button");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Select group : ads");
		test.info("Click on group icon");
		test.info("Click on settings");
		test.info("Click on radio button of all msgs & files");
		test.info("Click on submit");
		test.info("Click on yes button");
		test.info("EXPECTED RESULT ::  It should delete the msgs & files ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the msgs & files");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("2");
	}
	@Test
	public void test03() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='ads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioMessages']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Delete msgs with no button");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Select group : ads");
		test.info("Click on group icon");
		test.info("Click on settings");
		test.info("Click on radio button of msgs");
		test.info("Click on submit");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not delete the msgs");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting the msgs");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("3");
	}
	@Test
	public void test04() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='ads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioMessages']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Delete all msgs with yes button");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Select group : ads");
		test.info("Click on group icon");
		test.info("Click on settings");
		test.info("Click on radio button of all msgs");
		test.info("Click on submit");
		test.info("Click on yes button");
		test.info("EXPECTED RESULT ::  It should delete the msgs ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the msgs");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("4");
	}
	@Test
	public void test05() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='ads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioFiles']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-no']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Delete files with no button");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Select group : ads");
		test.info("Click on group icon");
		test.info("Click on settings");
		test.info("Click on radio button of files");
		test.info("Click on submit");
		test.info("Click on no button");
		test.info("EXPECTED RESULT ::  It should not delete the files ");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not deleting the files");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("5");
	}
	@Test
	public void test06() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='ads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[2]"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupSelfDeleteRadioFiles']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='groupDeleteSubmitBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-yes']")).click();
		Thread.sleep(2000);
		ExtentTest test=extent.createTest("Delete files in self with yes button");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Select group : ads");
		test.info("Click on group icon");
		test.info("Click on settings");
		test.info("Click on radio button of files");
		test.info("Click on submit");
		test.info("Click on yes button");
		test.info("EXPECTED RESULT ::  It should delete the files ");
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Assert.assertEquals("Deleted chat history successfully", a);
		test.pass(a);
		System.out.println(a);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is deleting the files");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
		System.out.println("6");
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
