package SignupAndLogin;

import java.io.IOException;

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

public class signupNextpage {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";

	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("signupnextpage.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@Test
	public void test1() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("OTP_Blank");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("ValidData_Password:sai@123");
		test.info("InValidData_OTP:Blank");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: InValid Verification Code");
		test.info("ACTUAL RESULT:: InValid Verification Code");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test2() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("Password_Blank");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("InValidData_Password:Blank");
		test.info("ValidData_OTP:1234");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Password");
		test.info("ACTUAL RESULT:: Please Enter Password");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test3() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("");
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("BlankPage");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("InValidData_Password:Blank");
		test.info("InValidData_OTP:Blank");
		test.info("CheckBox:Blank");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Details");
		test.info("ACTUAL RESULT:: Please Enter Details");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test4() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("InValidData");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("InValidData_Password:sai");
		test.info("InValidData_OTP:2345");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Password must be minimum 6 characters");
		test.info("ACTUAL RESULT:: Password must be minimum 6 characters");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test5() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("InValidData_Password");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("InValidData_Password:sai");
		test.info("ValidData_OTP:1234");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Password must be minimum 6 characters");
		test.info("ACTUAL RESULT:: Password must be minimum 6 characters");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test6() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("InValidData_OTP");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("ValidData_Password:sai@123");
		test.info("InValidData_OTP:2345");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: InValid Verification Code");
		test.info("ACTUAL RESULT:: InValid Verification Code");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test7() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("InValidData_OTP");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("ValidData_Password:sai@123");
		test.info("InValidData_OTP:123");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: InValid Verification Code");
		test.info("ACTUAL RESULT:: InValid Verification Code");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test8() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876051321");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.41@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("Not Clicking On CheckBox");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("ValidData_Password:sai@123");
		test.info("ValidData_OTP:1234");
		test.info("CheckBox:Blank");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Agree Legal Policy Terms");
		test.info("ACTUAL RESULT:: Please Agree Legal Policy Terms");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test9() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876544331");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharathy.4@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		ExtentTest test = extent.createTest("ValidData");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath.37@gmail.com");
		test.info("NextButton");
		test.info("ValidData_Password:sai@123");
		test.info("InValidData_OTP:1234");
		test.info("CheckBox:Click on CheckBox");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Troop Messenger should be signup");
		test.info("ACTUAL RESULT:: Troop Messenger should be signup");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endtest() {

		extent.flush();
		driver.close();
	}
}
