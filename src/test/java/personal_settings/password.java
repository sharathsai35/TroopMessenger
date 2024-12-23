package personal_settings;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class password {
	
	WebDriver driver;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	
	@BeforeSuite
	  public void beforeSuite() {
		Htmlreporter = new ExtentHtmlReporter("Change password.html");
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
			
			String a = driver.findElement(By.xpath("//span[@class='user-name']")).getText();
			Assert.assertEquals("Sai", a);
			
	
			ExtentTest test= Extent.createTest("Click on personal settings");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			

			test.info("EXPECTED RESULT:: It should display personal settings page");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying personal settings page");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
			driver.close();
	} 
  
	
	//@Test
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
			Thread.sleep(300);
			//upload image
			
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[1]/div/div[2]/div[1]/div[2]/div[1]/span")).click();
			Thread.sleep(300);
			
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(250);
			act.sendKeys(Keys.ENTER).build().perform();
			
			
			
			//String a = driver.findElement(By.xpath("//span[@class='user-name']")).getText();
			//Assert.assertEquals("Sai", a);
			
	
			ExtentTest test= Extent.createTest("Click on personal settings");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			

			test.info("EXPECTED RESULT:: It should display personal settings page");
			//test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying personal settings page");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		//	driver.close();
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
			
			
			Thread.sleep(1000);
			String a = driver.findElement(By.xpath("//span[@class='password-label']")).getText();
			Assert.assertEquals("old password", a);
			
	
			ExtentTest test= Extent.createTest("Click on password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on personal settings");
			test.info("Password: Click on password");
			

			test.info("EXPECTED RESULT:: It should display password change page");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying password change page");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
			driver.close();
	}
	  
	  
	  
	  @Test
	  public void test3() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
			Thread.sleep(300);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Enter new password", a);
			
	
			ExtentTest test= Extent.createTest("Enter only old password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Password: Click on old password");
			test.info("Data: Enter data 123456");
			test.info("save: Click on save");

			test.info("EXPECTED RESULT:: It should display toast msg enter new password");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg enter new password");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
			driver.close();
	}
	  @Test
	  public void test4() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
			Thread.sleep(300);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			
			Thread.sleep(1000);
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Enter old password", a);
			
	
			ExtentTest test= Extent.createTest("Enter only new password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Password: Click on new password");
			test.info("Data: Enter data 123456");
			test.info("save: Click on save");

			
			test.info("EXPECTED RESULT:: It should display toast msg enter old password");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg enter old password");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
			driver.close();
	}
	  
	  @Test
	  public void test5() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
			Thread.sleep(300);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Enter old password", a);
			
	
			ExtentTest test= Extent.createTest("Enter only confirm password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Password: Click on confirm password");
			test.info("Data: Enter data 123456");
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg enter old password");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg enter old password");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
			driver.close();
	}  
	  
	  @Test
	  public void test6() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Enter old password", a);
			
	
			ExtentTest test= Extent.createTest("Click on save without enter any password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
		
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg enter old password");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg enter old password");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
			driver.close();
	} 
	  
	  @Test
	  public void test7() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Passwords doesn't match", a);
			
			
			ExtentTest test= Extent.createTest("Enter old & new password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("old Password: Click on old password");
			test.info("Data: Enter 123456");
			test.info("New Password: Click on new password");
			test.info("Data: Enter 123456");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password's doesn't match");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password's doesn't match");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	}  
	  
	  
	  @Test
	  public void test8() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("123456");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Enter new password", a);
			
			
			ExtentTest test= Extent.createTest("Enter old & confirm password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("old Password: Click on old password");
			test.info("Data: Enter 123456");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 123456");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg Enter new password");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg Enter new password");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	}  
	  
	  @Test
	  public void test9() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Enter old password", a);
			
			
			ExtentTest test= Extent.createTest("Enter New & confirm password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("New Password: Click on new password");
			test.info("Data: Enter 123456");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 123456");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg Enter old password");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg Enter old password");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  
	  @Test
	  public void testcase10() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Nothing to update", a);
			
			
			ExtentTest test= Extent.createTest("Enter old, new & confirm password same");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter 123456");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter 123456");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 123456");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg Password nothing to update");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg nothing to update");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	}
	  
	  @Test
	  public void testcase11() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("1234567");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Passwords doesn't match", a);
			
			
			ExtentTest test= Extent.createTest("Enter invalid password");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter 123456");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter 123456");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 1234567");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg passwords doesn't match");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg passwords doesn't match");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  @Test
	  public void testcase12() throws InterruptedException {
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
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("abcdef");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("abcdef");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Password Changed Successfully", a);
			
			
			ExtentTest test= Extent.createTest("Enter password with Lower alphabets");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter 123456");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter abcdef");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter abcdef");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password changed successfully");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password changed successfully");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  
	  @Test
	  public void testcase13() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcdef");
			Thread.sleep(200);
			driver.manage().window().maximize(); 
			Thread.sleep(200);
			driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
			Thread.sleep(300);
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("abcdef");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("abc@#d");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("abc@#d");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Password Changed Successfully", a);
			
			
			ExtentTest test= Extent.createTest("Enter password with alphabets & characters");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:123456");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter abcdef");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter abc@#d");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter abc@#d");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password changed successfully");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password changed successfully");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  
	  @Test
	  public void testcase14() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@#d");
			Thread.sleep(200);
			driver.manage().window().maximize(); 
			Thread.sleep(200);
			driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
			Thread.sleep(300);
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("abc@#d");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("abc@#I");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("abc@#I");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Password Changed Successfully", a);
			
			
			ExtentTest test= Extent.createTest("Enter password with alphabets, characters & romans");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:abc@#d");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter abcdef");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter abc@#I");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter abc@#I");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password changed successfully");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password changed successfully");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  
	  @Test
	  public void testcase15() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@#I");
			Thread.sleep(200);
			driver.manage().window().maximize(); 
			Thread.sleep(200);
			driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
			Thread.sleep(300);
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("abc@#I");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("12abc@#I");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("12abc@#I");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Password Changed Successfully", a);
			
			
			ExtentTest test= Extent.createTest("Enter password with numbers, characters & romans");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password: abc@#I");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter abc@#I");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter 12abc@#I");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 12abc@#I");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password changed successfully");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password changed successfully");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  
	  @Test
	  public void testcase16() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12abc@#I");
			Thread.sleep(200);
			driver.manage().window().maximize(); 
			Thread.sleep(200);
			driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
			Thread.sleep(300);
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("12abc@#I");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("1234iv");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("1234iv");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Password Changed Successfully", a);
			
			
			ExtentTest test= Extent.createTest("Enter password with numbers & Lower romans");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password: 12abc@#I");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter 12abc@#I");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter 1234iv");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 1234iv");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password changed successfully");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password changed successfully");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	} 
	  
	  
	  
	  @Test
	  public void testcase17() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai1@google.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234iv");
			Thread.sleep(200);
			driver.manage().window().maximize(); 
			Thread.sleep(200);
			driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
			Thread.sleep(300);
			
			//click on settings
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
			Thread.sleep(300);
			
			//password
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[2]/span")).click();
		
			
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsOldPasswordInput\"]")).sendKeys("1234iv");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsNewPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"settingsConfirmPasswordInput\"]")).sendKeys("123456");
			
			Thread.sleep(1000);		

			driver.findElement(By.xpath("//*[@id=\"savePasswordButton\"]")).click();
			
			Thread.sleep(1000);
			
			String a = driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
			Assert.assertEquals("Password Changed Successfully", a);
			
			
			ExtentTest test= Extent.createTest("Enter password with numbers");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Email:sai1@gmail.com");
			test.info("Password:1234iv");
			test.info("Login:Click on Login");
			test.info("Settings: Click on profile settings");
			test.info("Password: Click on password");
			test.info("Old Password: Click on old password");
			test.info("Data: Enter 123456");
			
			test.info("New Password: Click on new password");
			test.info("Data: Enter 123456");
			test.info("Confirm Password: Click on confirm password");
			test.info("Data: Enter 1234567");
			
			test.info("save: Click on save");
			

			test.info("EXPECTED RESULT:: It should display toast msg password changed successfully");
			test.pass(a);
			
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg password changed successfully");
			test.pass("Test Case:: TestCase PASSED");
			
			Thread.sleep(500);
		driver.close();
	}
	  
	  
  @AfterSuite
  public void afterSuite() {
	  Extent.flush();
  }

}
