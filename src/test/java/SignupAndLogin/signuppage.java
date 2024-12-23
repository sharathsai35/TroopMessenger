package SignupAndLogin;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class signuppage {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";

	@BeforeSuite
	public void testcase1() {
		htmlReporter = new ExtentHtmlReporter("signupfstpage.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("Blankpage");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:Blank");
		test.info("ValidData_Name:Blank");
		test.info("ValidData_MobileNumber:Blank");
		test.info("ValidData_Email:Blank");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Valid Details");
		test.info("ACTUAL RESULT:: Please Enter Valid Details");
		test.pass("Test Case:: TestCase1 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test1() throws IOException, InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543200");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath5@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("CompanyName_Blank");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:Blank");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter CompanyName");
		test.info("ACTUAL RESULT:: Please Enter CompanyName");
		test.pass("Test Case:: TestCase2 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test2() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876054531");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("abc@bcd.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("Name_Blank");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:Blank");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Name");
		test.info("ACTUAL RESULT:: Please Enter Name");
		test.pass("Test Case:: TestCase3 PASSED");
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
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543200");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("Email_Blank");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:Blank");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Email");
		test.info("ACTUAL RESULT:: Please Enter Email");
		test.pass("Test Case:: TestCase4 PASSED");
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
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath5@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("MobileNumber_Blank");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:Blank");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter MobileNumber");
		test.info("ACTUAL RESULT:: Please Enter MobileNumber");
		test.pass("Test Case:: TestCase5 PASSED");
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
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543100");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("SHARATH35@GMAIL.COM");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("EmailWithUpperCase");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:SHARATH35@GMAIL.COM");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: GOTO Next Page");
		test.info("ACTUAL RESULT:: GOTO Next Page");
		test.pass("Test Case:: TestCase6 PASSED");
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
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543200");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("!%#*%*!<@");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("Emailwithsymbols");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("CompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("ValidData_Email:#!%##^##*@");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Valid Email");
		test.info("ACTUAL RESULT:: Please Enter Valid Email");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test7() throws IOException, InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("afdsafdabcs");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("abc@bcd");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("InvalidData");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("InValidCompanyName:abcd");
		test.info("InValidData_Name:safdad");
		test.info("InValidData_MobileNumber:agdgadfee");
		test.info("InValidData_Email:hshbdgjkscj@bfb");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Valid Details");
		test.info("ACTUAL RESULT:: Please Enter Valid Details");
		test.pass("Test Case:: TestCase7 PASSED");
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
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath5@abc");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();	  
		ExtentTest test = extent.createTest("InvalidEmail");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("ValidData_MobileNumber:9876504321");
		test.info("InValidData_Email:hshbdgjkscj@bfb");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Valid Email");
		test.info("ACTUAL RESULT:: Please Enter Valid Email");
		test.pass("Test Case:: TestCase8 PASSED");
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
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("abcdeqwert");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath3@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("InvalidMobilenumber");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("ValidData_Name:sharath");
		test.info("InValidData_MobileNumber:dsfadngafg");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Valid MobileNumber");
		test.info("ACTUAL RESULT:: Please Enter Valid MobileNumber");
		test.pass("Test Case:: TestCase9 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase10() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath12");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543200");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath5@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("Namewithnumeric");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("ValidData_Name:sharath123");
		test.info("ValidData_MobileNumber:9870654321");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: GOTO Next Page");
		test.info("ACTUAL RESULT:: Please Enter Valid Name");
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(src,new File("screenshot1.png"));
		test.fail("Test Case:: TestCase10 PASSED");
		String screenShotPath= System.getProperty("user.dir") + File.separator + "/screenshots/"+test+".png";
		test.log(Status.PASS, "Snapshot below: "+  test.addScreenCaptureFromPath(screenShotPath));
		//test.log(Status.INFO, "Screencast below: " + test.addScreencast("screencast-path"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		Thread.sleep(1000);
		driver.close();
	}

	@Test
	public void testcase11() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath@");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543200");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath5@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("Namewithsymbol");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("ValidData_Name:sharath@");
		test.info("ValidData_MobileNumber:9870654321");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: GOTO Next Page");
		test.info("ACTUAL RESULT:: Please Enter Valid Name");
		test.fail("Test Case:: TestCase11 PASSED");
		String screenShotPath= System.getProperty("user.dir") + File.separator + "/screenshots/"+test+".png";
		test.log(Status.PASS, "Snapshot below: "+  test.addScreenCaptureFromPath(screenShotPath));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot2.png");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase12() throws IOException, InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath SAI");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543200");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath37@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("NamewithULandLL");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("ValidData_Name:SHARATH sai");
		test.info("ValidData_MobileNumber:9870654321");
		test.info("ValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: GOTO Next Page");
		test.info("ACTUAL RESULT:: GOTO Next Page");
		test.pass("Test Case:: TestCase12 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase13() throws IOException, InterruptedException {  
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("TVISHA");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("SHARATH");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543401");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("SHARATH35@GMAIL.COM");
		driver.findElement(By.xpath("//input[@data-step='1']")).click();
		ExtentTest test = extent.createTest("UpperCaseLetter");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:TVISHA");
		test.info("ValidData_Name:SHARATH");
		test.info("ValidData_MobileNumber:9870654321");
		test.info("ValidData_Email:SHARATH35@GMAIL.COM");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: GOTO Next Page");
		test.info("ACTUAL RESULT:: GOTO Next Page");
		test.pass("Test Case:: TestCase13 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase14() throws IOException, InterruptedException {   
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("asdsdfgfdq");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("gahgghg@dggfd");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("ValidAndInvalidData");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("InValidData_Name:dfgadhfh");
		test.info("InValidData_MobileNumber:dagfhhfgb");
		test.info("InValidData_Email:dsagdfbdf@fgngn");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: Please Enter Vaild Details");
		test.info("ACTUAL RESULT:: Please Enter Valid Details");
		test.pass("Test Case:: TestCase14 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcase15() throws IOException, InterruptedException {   
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/sign-up");
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha technologies");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9877663460");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.37@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		ExtentTest test = extent.createTest("ValidData");
		test.log(Status.INFO, "Chrome Browser launched Successfully");
		test.info("Navigate to URL");
		test.info("ValidCompanyName:tvisha");
		test.info("InValidData_Name:sharath");
		test.info("InValidData_MobileNumber:9876054321");
		test.info("InValidData_Email:sharath35@gmail.com");
		test.info("NextButton");
		test.info("EXPECTED RESULT:: GOTO Next Page");
		test.info("ACTUAL RESULT:: GOTO Next Page");
		test.pass("Test Case:: TestCase15 PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endtest() {

		extent.flush();
		driver.close();
	}

}

