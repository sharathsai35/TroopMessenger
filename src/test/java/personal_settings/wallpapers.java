package personal_settings;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class wallpapers {
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports Extent;
	
	
	@BeforeSuite
	  public void beforeSuite() {
	htmlreporter = new ExtentHtmlReporter("wallpapers.html");
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
		
		Thread.sleep(500);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	
	Thread.sleep(500);	
		
		ExtentTest test= Extent.createTest("Click on Wallpapers");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		
		test.info("EXPECTED RESULT:: It should display the wallpapers page");
		test.pass(a);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the wallpapers page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void test1() throws InterruptedException {
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
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Classic']")).getAttribute("value");
		Assert.assertEquals("Classic", b);
		
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//option[@value='Corporate']")).getAttribute("value");
	Assert.assertEquals("Corporate", c);
	
	Thread.sleep(300);
	
	String d = driver.findElement(By.xpath("//option[@value='Floral']")).getAttribute("value");
	Assert.assertEquals("Floral", d);
	
	Thread.sleep(300);
	
	String e = driver.findElement(By.xpath("//option[@value='Fun']")).getAttribute("value");
	Assert.assertEquals("Fun", e);
	
	Thread.sleep(300);
	
		ExtentTest test= Extent.createTest("Click on search category");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		
		test.info("EXPECTED RESULT:: It should display the search category options");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.pass(e);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the search category options");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void test2() throws InterruptedException {
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
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Classic']")).getAttribute("value");
		Assert.assertEquals("Classic", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Classic']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Gradient']")).getAttribute("data-name");
	Assert.assertEquals("Gradient", c);
	
	Thread.sleep(300);
	
	String d = driver.findElement(By.xpath("//div[@data-name='Purple Dots']")).getAttribute("data-name");
	Assert.assertEquals("Purple Dots", d);
	
	Thread.sleep(300);
	
	String e = driver.findElement(By.xpath("//div[@data-name='Sky']")).getAttribute("data-name");
	Assert.assertEquals("Sky", e);
	
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Classic");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Classic: Click on classic");
		
		test.info("EXPECTED RESULT:: It should display the classic related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.pass(e);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the classic related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  
  @Test
  public void test3() throws InterruptedException {
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
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Classic']")).getAttribute("value");
		Assert.assertEquals("Classic", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Classic']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Sky']")).getAttribute("data-name");
	Assert.assertEquals("Sky", c);
	
	Thread.sleep(800);
	
	WebElement aa= driver.findElement(By.xpath("//div[@data-name='Sky']"));
	Actions act = new Actions(driver);
	act.moveToElement(aa).perform();
	Thread.sleep(700);
	driver.findElement(By.xpath("(//span[@class='apply-wallpaper'])[17]")).click();
	
	Thread.sleep(300);
	
	String d = 	driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
	Assert.assertEquals("Applied Successfully!", d);
	Thread.sleep(300);
	
	String e = driver.findElement(By.xpath("//span[@class='wallpaper-name']")).getText();
	Assert.assertEquals("Sky", e);
	
	
	Thread.sleep(300);
	
		ExtentTest test= Extent.createTest("Click on search category & select Classic");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Classic: Click on classic");
		test.info("Wallpaper: Select wallpaper sky");
		test.info("Apply: Click on apply");
		
		test.info("EXPECTED RESULT:: It should display the toast msg wallpaper applied successfully");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.pass(e);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the toast msg wallpaper applied successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void test4() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Corporate']")).getAttribute("value");
		Assert.assertEquals("Corporate", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Corporate']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Building']")).getAttribute("data-name");
	Assert.assertEquals("Building", c);
	
	Thread.sleep(300);
	
	String d = driver.findElement(By.xpath("//div[@data-name='Reaching the Skies, Tallest Tower']")).getAttribute("data-name");
	Assert.assertEquals("Reaching the Skies, Tallest Tower", d);
	
	Thread.sleep(300);
	
		ExtentTest test= Extent.createTest("Click on search category & select Corporate");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Corporate: Click on corporate");
		
		test.info("EXPECTED RESULT:: It should display the corporate related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the corporate related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void test5() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Floral']")).getAttribute("value");
		Assert.assertEquals("Floral", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Floral']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Flowers']")).getAttribute("data-name");
	Assert.assertEquals("Flowers", c);
	
	Thread.sleep(300);
	
	String d = driver.findElement(By.xpath("//div[@data-name='Hearts Pattern']")).getAttribute("data-name");
	Assert.assertEquals("Hearts Pattern", d);
	
	Thread.sleep(300);
	
		ExtentTest test= Extent.createTest("Click on search category & select Floral");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Floral: Click on Floral");
		
		test.info("EXPECTED RESULT:: It should display the floral related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Floral related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void test6() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Fun']")).getAttribute("value");
		Assert.assertEquals("Fun", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Fun']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Evolution']")).getAttribute("data-name");
	Assert.assertEquals("Evolution", c);
	
	Thread.sleep(300);
	
	String d = driver.findElement(By.xpath("//div[@data-name='Three Cats']")).getAttribute("data-name");
	Assert.assertEquals("Three Cats", d);
	
	Thread.sleep(300);
	
	String e = driver.findElement(By.xpath("//div[@data-name='Fun']")).getAttribute("data-name");
	Assert.assertEquals("Fun", e);
	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Fun");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Fun: Click on Fun");
		
		test.info("EXPECTED RESULT:: It should display the fun related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.pass(e);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Fun related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  
  @Test
  public void test7() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Meeting']")).getAttribute("value");
		Assert.assertEquals("Meeting", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Meeting']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Coffee']")).getAttribute("data-name");
	Assert.assertEquals("Coffee", c);

	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Meeting");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Meeting: Click on Meeting");
		
		test.info("EXPECTED RESULT:: It should display the meeting related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the meeting related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void test8() throws InterruptedException {
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
			
			Thread.sleep(300);
			
			//click on wallpapers

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();
				
			Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(300);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Travel']")).getAttribute("value");
		Assert.assertEquals("Travel", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Travel']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Reaching Destination']")).getAttribute("data-name");
	Assert.assertEquals("Reaching Destination", c);

	Thread.sleep(300);

	String d = driver.findElement(By.xpath("//div[@data-name='Sailing on the Boat']")).getAttribute("data-name");
	Assert.assertEquals("Sailing on the Boat", d);

	Thread.sleep(300);

	String e = driver.findElement(By.xpath("//div[@data-name='White Mountains']")).getAttribute("data-name");
	Assert.assertEquals("White Mountains", e);

	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Travel");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Travel: Click on Travel");
		
		test.info("EXPECTED RESULT:: It should display the travel related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.pass(e);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the travel related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  
  @Test
  public void test9() throws InterruptedException {
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
			
			Thread.sleep(300);
			
			//click on wallpapers

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();
				
			Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Pet-Lovers']")).getAttribute("value");
		Assert.assertEquals("Pet-Lovers", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Pet-Lovers']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Dogs']")).getAttribute("data-name");
	Assert.assertEquals("Dogs", c);

	Thread.sleep(300);

		ExtentTest test= Extent.createTest("Click on search category & select Pet-Lovers");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Pet-Lovers: Click on Pet-Lovers");
		
		test.info("EXPECTED RESULT:: It should display the  Pet-Lovers related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Pet-Lovers related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  
  @Test
  public void testcase10() throws InterruptedException {
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
			
			Thread.sleep(300);
			
			//click on wallpapers

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();
				
			Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Serene Sea Side']")).getAttribute("value");
		Assert.assertEquals("Serene Sea Side", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Serene Sea Side']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Beach']")).getAttribute("data-name");
	Assert.assertEquals("Beach", c);

	Thread.sleep(300);

	String d = driver.findElement(By.xpath("//div[@data-name='Beach Homes']")).getAttribute("data-name");
	Assert.assertEquals("Beach Homes", d);
	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Serene Sea Side");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Serene Sea Side: Click on Serene Sea Side");
		
		test.info("EXPECTED RESULT:: It should display the Serene Sea Side related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Serene Sea Side related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  
  @Test
  public void testcase11() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Abstract']")).getAttribute("value");
		Assert.assertEquals("Abstract", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Abstract']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Snow House']")).getAttribute("data-name");
	Assert.assertEquals("Snow House", c);

	Thread.sleep(300);

	String d = driver.findElement(By.xpath("//div[@data-name='Sparkling Lights']")).getAttribute("data-name");
	Assert.assertEquals("Sparkling Lights", d);
	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Abstract");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Abstract: Click on Abstract");
		
		test.info("EXPECTED RESULT:: It should display the Serene Abstract related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Abstract related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  
  @Test
  public void testcase12() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Celebration']")).getAttribute("value");
		Assert.assertEquals("Celebration", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Celebration']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Christmas Gifts']")).getAttribute("data-name");
	Assert.assertEquals("Christmas Gifts", c);

	Thread.sleep(300);

	String d = driver.findElement(By.xpath("//div[@data-name='Christmas']")).getAttribute("data-name");
	Assert.assertEquals("Christmas", d);
	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Celebration");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Celebration: Click on celebration");
		
		test.info("EXPECTED RESULT:: It should display the celebration related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the celebration related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void testcase13() throws InterruptedException {
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
			
			Thread.sleep(300);
			
			//click on wallpapers

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();
				
			Thread.sleep(200);
		
	String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
	Assert.assertEquals("Wallpapers", a);

	//click on search categeory
	Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='category-wrapper']")).click();
		Thread.sleep(200);
	
	String b = driver.findElement(By.xpath("//option[@value='Music']")).getAttribute("value");
		Assert.assertEquals("Music", b);
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//option[@value='Music']")).click();	
	
	Thread.sleep(300);
	
	String c = driver.findElement(By.xpath("//div[@data-name='Headphones']")).getAttribute("data-name");
	Assert.assertEquals("Headphones", c);

	Thread.sleep(300);

	String d = driver.findElement(By.xpath("//div[@data-name='Talk your Way']")).getAttribute("data-name");
	Assert.assertEquals("Talk your Way", d);
	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Click on search category & select Music");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search category: Click on search category");
		test.info("Music: Click on music");
		
		test.info("EXPECTED RESULT:: It should display the music related wallpapers");
		test.pass(a);
		test.pass(b);
		test.pass(c);
		test.pass(d);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the music related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void testcase14() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	//click on search
		
		driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).sendKeys("fun");

	String a = driver.findElement(By.xpath("//div[@data-name='Fun']")).getAttribute("data-name");
	Assert.assertEquals("Fun", a);
	
	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Search with valid data");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search: Fun");
		
		test.info("EXPECTED RESULT:: It should display the Fun related wallpapers");
		test.pass(a);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the fun related wallpapers");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @Test
  public void testcase15() throws InterruptedException {
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
		
		Thread.sleep(300);
		
		//click on wallpapers

		driver.findElement(By.xpath("//div[@data-tab='5']")).click();
			
		Thread.sleep(200);
		
	//click on search
		
		driver.findElement(By.xpath("//input[@id='wallpaperSearchInput']")).sendKeys("Abcd");

	Thread.sleep(300);
	
	
		ExtentTest test= Extent.createTest("Search with invalid data");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Gmail: Maneesh@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Personal Settings: Click on personal settings");
		test.info("Wallpapers: Click on wallpapers");
		test.info("Search: Abcd");
		
		test.info("EXPECTED RESULT:: It should display Empty");
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying Empty");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();	 
  }
  
  @AfterSuite
  public void afterSuite() {
  Extent.flush();
  }

}
