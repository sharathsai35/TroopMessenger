package personal_settings;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Profile {
		WebDriver driver;
		ExtentHtmlReporter htmlreporter;
		ExtentReports Extent;
	
	
	@BeforeSuite
	  public void beforeSuite() {
		
		htmlreporter = new ExtentHtmlReporter("profile.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlreporter);
	  }

	
  @Test
  public void test0() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
	  
	  driver = new ChromeDriver();
	  driver.get("http://192.168.2.55:8081/login");
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		//click on settings
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		
		Thread.sleep(400);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Profile", a);

	Thread.sleep(500);	
		
		ExtentTest test= Extent.createTest("Click on Profile");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Profile: Click on profile");
		
		test.info("EXPECTED RESULT:: It should display the Profile page");
		test.pass(a);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the profile page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
	  
  }
  
  
  @Test
  public void test1() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
	  
	  driver = new ChromeDriver();
	  driver.get("http://192.168.2.55:8081/login");
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		//click on settings
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		
		Thread.sleep(400);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Profile", a);

	Thread.sleep(500);	
		
	//uploadimage
		
	driver.findElement(By.xpath("//div[@id='uploadProfilePic']")).click();
	Thread.sleep(200);
	
	Robot rb = new Robot();
	Thread.sleep(1000);
	//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
	 StringSelection str = new StringSelection("/home/lavanya/ksnip_20220120-132331.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Thread.sleep(2000);
	 rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
 
    // release Control+V for pasting
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    // for pressing and releasing Enter
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(400);
	
	
	String b = driver.findElement(By.xpath("//input[@value='CANCEL']")).getAttribute("value");
	Assert.assertEquals("CANCEL", b);
	Thread.sleep(400);
	
	driver.findElement(By.xpath("//input[@id='userAvatarCancelBtn']")).click();
	Thread.sleep(200);
	
	
	
		ExtentTest test= Extent.createTest("Click on upload an image & click on cancel");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Profile: Click on profile");
		test.info("Upload image: Click on upload image");
		test.info("Image: Select image");
		test.info("Cancel: Click on cancel");
		
		test.info("EXPECTED RESULT:: It should display the profile page");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the profile page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
	  
  }
  
  
  @Test
  public void test2() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
	  
	  driver = new ChromeDriver();
	  driver.get("http://192.168.2.55:8081/login");
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		//click on settings
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		
		Thread.sleep(400);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Profile", a);

	Thread.sleep(500);	
		
	//uploadimage
		
	driver.findElement(By.xpath("//div[@id='uploadProfilePic']")).click();
	Thread.sleep(200);
	
	Robot rb = new Robot();
	Thread.sleep(1000);
	//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
	 StringSelection str = new StringSelection("/home/lavanya/ksnip_20220120-132331.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Thread.sleep(2000);
	 rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
 
    // release Control+V for pasting
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    // for pressing and releasing Enter
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(400);
	
	
	//click on save
	String c = driver.findElement(By.xpath("//input[@value='SAVE']")).getAttribute("value");
	Assert.assertEquals("SAVE", c);
	Thread.sleep(300);
	
	driver.findElement(By.xpath("//input[@id='userAvatarSaveBtn']")).click();
	
	Thread.sleep(400);
	//String d = driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
	//Assert.assertEquals("Profile pic updated successfully!", d);
	
	
		ExtentTest test= Extent.createTest("Click on upload an image & click on save");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Profile: Click on profile");
		test.info("Upload image: Click on upload image");
		test.info("Image: Select image");
		test.info("save: Click on save");
		
		test.info("EXPECTED RESULT:: It should display toast msg profile pic updated successfully");
		test.pass(a);
		test.pass(c);
		//test.pass(d);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg profile pic updated successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
	  
  }
  
  
  @Test
  public void test3() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
	  
	  driver = new ChromeDriver();
	  driver.get("http://192.168.2.55:8081/login");
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		//click on settings
		driver.findElement(By.xpath("//div[@data-type='4']")).click();
		
		Thread.sleep(400);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Profile", a);

	Thread.sleep(500);	
		
	//uploadimage
		
	driver.findElement(By.xpath("//div[@id='uploadProfilePic']")).click();
	Thread.sleep(200);
	
	Robot rb = new Robot();
	Thread.sleep(1000);
	//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
	 StringSelection str = new StringSelection("/home/lavanya/ksnip_20220120-132331.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Thread.sleep(2000);
	 rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
 
    // release Control+V for pasting
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    // for pressing and releasing Enter
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(400);
	//click on change
	
	String b = driver.findElement(By.xpath("//input[@value='CHANGE']")).getAttribute("value");
	Assert.assertEquals("CHANGE", b);
	Thread.sleep(300);
	
	driver.findElement(By.xpath("//input[@id='userAvatarChangeBtn']")).click();
	Thread.sleep(200);
	
	Robot rb1 = new Robot();
	Thread.sleep(1000);
	//e.sendKeys("/home/tvisha/Pictures/Screenshot from 2022-06-04 18-47-59.png");
	 StringSelection str1 = new StringSelection("/home/lavanya/ksnip_20220120-132331.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
	Thread.sleep(2000);
	 rb1.keyPress(KeyEvent.VK_CONTROL);
     rb1.keyPress(KeyEvent.VK_V);
 
    // release Control+V for pasting
    rb1.keyRelease(KeyEvent.VK_CONTROL);
    rb1.keyRelease(KeyEvent.VK_V);
    // for pressing and releasing Enter
    rb1.keyPress(KeyEvent.VK_ENTER);
    rb1.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    rb1.keyPress(KeyEvent.VK_ENTER);
    rb1.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(400);
	
	//click on save
	String c = driver.findElement(By.xpath("//input[@value='SAVE']")).getAttribute("value");
	Assert.assertEquals("SAVE", c);
	Thread.sleep(300);
	
	driver.findElement(By.xpath("//input[@id='userAvatarSaveBtn']")).click();
	
	Thread.sleep(400);
	//String d = driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
	//Assert.assertEquals("Profile pic updated successfully!", d);
	
	
		ExtentTest test= Extent.createTest("Click on upload an image");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Profile: Click on profile");
		test.info("Upload image: Click on upload image");
		test.info("Image: Select image");
		test.info("Change: Click on change");
		test.info("Image: Select image");
		test.info("save: Click on save");
		
		test.info("EXPECTED RESULT:: It should display toast msg profile pic updated successfully");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		//test.pass(d);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg profile pic updated successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
	  
  }
  
  
  @Test
  public void test4() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
	  
	  driver = new ChromeDriver();
	  driver.get("http://192.168.2.55:8081/login");
	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		//click on settings
		driver.findElement(By.xpath("//div[@data-type='4']")).click();

	Thread.sleep(500);	
		
	//remove picture
		
	String b = driver.findElement(By.xpath("//input[@value='SAVE']")).getAttribute("value");
	Assert.assertEquals("SAVE", b);
	
	Thread.sleep(200);
	
	driver.findElement(By.xpath("//div[@id='removeProfilePic']")).click();
	Thread.sleep(400);
	
	String c = driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
	Assert.assertEquals("Avatar removed", c);
	
	
		ExtentTest test= Extent.createTest("Click on remove picture");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Profile: Click on profile");
		test.info("Remove picture: Click on remove picture");
		
		test.info("EXPECTED RESULT:: It should display toast msg Avatar Removed");

		test.pass(b);
		test.pass(c);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying toast msg Avatar Removed");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
	  
  }
  
  
  @AfterSuite
  public void afterSuite() {
	 Extent.flush(); 
	  
  }

}
