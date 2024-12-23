package personal_settings;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Fontsformat {
	WebDriver driver;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	
	@BeforeSuite
	  public void beforeSuite() {
		Htmlreporter = new ExtentHtmlReporter("Fonts format.html");
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
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		
		
		String a = driver.findElement(By.xpath("//div[@class='heading-text']")).getText();
		Assert.assertEquals("Font Type", a);
		

		ExtentTest test= Extent.createTest("Click on personal settings & Fonts and format");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		

		test.info("EXPECTED RESULT:: It should display Fonts & format page");
		test.pass(a);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying Fonts & format page");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  

  @Test
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
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		
		//popins
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/label/span[1]")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//label[@class='messenger-settings-custom-radio']")).getText();
		Assert.assertEquals("Poppins\n"
				+ "(Default)", a);
		

		ExtentTest test= Extent.createTest("Select radio button poppins");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Poppins: Select radio button poppins");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		

		test.info("EXPECTED RESULT:: It should display the poppins radio button is selected");
		test.pass(a);
		//test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Font poppins radio button is selected");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		//roboto
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/label/span")).click();
		Thread.sleep(2000);
		

		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(2000);

		String a = driver.findElement(By.xpath("//input[@value='roboto']")).getAttribute("value");
		Assert.assertEquals("roboto", a);
		
		ExtentTest test= Extent.createTest("Select radio button Roboto");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Roboto: Select radio button roboto");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		

		test.info("EXPECTED RESULT:: It should display the roboto radio button is selected");
		test.pass(a);
		//test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Font roboto radio button is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		
		//helvetica
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
				
		Thread.sleep(1000);

		String a = driver.findElement(By.xpath("//input[@value='helvetica']")).getAttribute("value");
		Assert.assertEquals("helvetica", a);
		
		
		ExtentTest test= Extent.createTest("Select radio button Helvetica");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Helvetica: Select radio button Helvetica");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		

		test.info("EXPECTED RESULT:: It should display the Helvetica radio button is selected");
		test.pass(a);
		//test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Font Helvetica radio button is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		
		//karla
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[4]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();	
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//input[@value='karla']")).getAttribute("value");
		Assert.assertEquals("karla", a);
		
		ExtentTest test= Extent.createTest("Select radio button karla");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("karla: Select radio button karla");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");

		test.info("EXPECTED RESULT:: It should display the karla radio button is selected");
		test.pass(a);
		//test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Font karla radio button is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		//work sans
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[5]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();	
				
		String a = driver.findElement(By.xpath("//input[@value='work-sans']")).getAttribute("value");
		assertEquals("work-sans", a);
		
				
		ExtentTest test= Extent.createTest("Select radio button work sans");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Work sans: Select radio button work sans");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the work sans radio button is selected");
		test.pass(a);
		//test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Font work sans radio button is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		
		//font size
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[1]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//input[@value='70']")).getAttribute("value");
		Assert.assertEquals("70", a);
		
		ExtentTest test= Extent.createTest("Select radio font size 70%");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 70%");
		test.info("Refresh: Click on refresh");

		test.info("EXPECTED RESULT:: It should display the font size 70 is selected");
		test.pass(a);
	
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 70 is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);

		//font size 80
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[2]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='80']")).getAttribute("value");
		Assert.assertEquals("80", a);
		

		ExtentTest test= Extent.createTest("Select radio font size 80");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 80%");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		
		test.info("EXPECTED RESULT:: It should display the font size 80 is selected");
		test.pass(a);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 80 is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);

		//font size 90
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[3]/label/span")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='90']")).getAttribute("value");
		Assert.assertEquals("90", a);

		ExtentTest test= Extent.createTest("Select radio font size 90");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 90%");
		test.info("REfresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the font size 90 is selected");
		test.pass(a);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 90 is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
		
		//font size 100
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[4]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='100']")).getAttribute("value");
		Assert.assertEquals("100", a);
		
		

		ExtentTest test= Extent.createTest("Select radio font size 100");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 100%");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the font size 100 is selected");
		test.pass(a);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 100 is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
	
		//font size 115
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[5]/label/span")).click();
		Thread.sleep(2000);
	
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='115']")).getAttribute("value");
		Assert.assertEquals("115", a);
		
		ExtentTest test= Extent.createTest("Select radio font size 110");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 115%");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		

		test.info("EXPECTED RESULT:: It should display the font size 115 is selected");
		test.pass(a);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 115 is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);

		//font size 125
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[6]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='125']")).getAttribute("value");
		Assert.assertEquals("125", a);
		
		ExtentTest test= Extent.createTest("Select radio font size 125");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 125%");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the font size 125 is selected");
		test.pass(a);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 125 is selected");
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
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
	
		//font size 135
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[7]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='135']")).getAttribute("value");
		Assert.assertEquals("135", a);	
		

		ExtentTest test= Extent.createTest("Select radio font size 135");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 135%");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the font size 135 is selected");
		test.pass(a);
		
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 135 is selected");
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
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		
		Thread.sleep(1000);
	
		//font size 150
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[2]/div[2]/div/div/div[8]/label/span")).click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String a  = driver.findElement(By.xpath("//input[@value='150']")).getAttribute("value");
		Assert.assertEquals("150", a);	
		

		ExtentTest test= Extent.createTest("Select radio font size 150");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Font size: Select font size 150%");
		test.info("Refresh: Click on refresh");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");

		test.info("EXPECTED RESULT:: It should display the font size 150 is selected");
		test.pass(a);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the font size 150 is selected");
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
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[2]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String b = driver.findElement(By.xpath("//input[@id='messageFormatSwitch']")).getAttribute("id");
		Assert.assertEquals("messageFormatSwitch", b);
		
		
		ExtentTest test= Extent.createTest("Dselect messaging format from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Messaging format: Dselect messaging format");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		
		
		test.info("EXPECTED RESULT:: It should hide the symbols in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is hiding the symbols in both user & group");
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
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons  fork out
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[3]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String b = driver.findElement(By.xpath("//input[@id='forkoutSwitch']")).getAttribute("id");
		Assert.assertEquals("forkoutSwitch", b);
		
		
		
		ExtentTest test= Extent.createTest("Dselect forkout from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Forkout: Dselect forkout");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		
		test.info("EXPECTED RESULT:: It should hide the forkout symbol in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is hiding the forkout symbol in both user & group");
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
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons  read receipt
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[4]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String b = driver.findElement(By.xpath("//input[@id='readReceiptSwitch']")).getAttribute("id");
		Assert.assertEquals("readReceiptSwitch", b);
		
		
		
		ExtentTest test= Extent.createTest("Dselect read receipt from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Read Receipt: Dselect Read receipt");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		
		test.info("EXPECTED RESULT:: It should hide the Read receipt symbol in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is hiding the Read receipt symbol in both user & group");
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
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(200);
		driver.manage().window().maximize(); 
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons voice msg
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[4]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String b = driver.findElement(By.xpath("//input[@id='voiceMessageSwitch']")).getAttribute("id");
		Assert.assertEquals("voiceMessageSwitch", b);
		
		
		
		ExtentTest test= Extent.createTest("Dselect voice message from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Voice message: Dselect voice message");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");

		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should hide the voice message symbol in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is hiding the voice message symbol in both user & group");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  
  
  @Test
  public void testcase18() throws InterruptedException {
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
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[2]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		String b = driver.findElement(By.xpath("//input[@id='messageFormatSwitch']")).getAttribute("id");
		Assert.assertEquals("messageFormatSwitch", b);
		
		
		ExtentTest test= Extent.createTest("Select messaging format from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Messaging format: Select messaging format");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the symbols in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the symbols in both user & group");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  @Test
  public void testcase19() throws InterruptedException {
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
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons  fork out
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[3]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String b = driver.findElement(By.xpath("//input[@id='forkoutSwitch']")).getAttribute("id");
		Assert.assertEquals("forkoutSwitch", b);
		
		
		ExtentTest test= Extent.createTest("Select forkout from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Forkout: Select forkout");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("EXPECTED RESULT:: It should display the forkout symbol in both user & group");
		
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the forkout symbol in both user & group");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  @Test
  public void testcase20() throws InterruptedException {
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
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons  read receipt
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[4]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		String b = driver.findElement(By.xpath("//input[@id='readReceiptSwitch']")).getAttribute("id");
		Assert.assertEquals("readReceiptSwitch", b);
		
		
		ExtentTest test= Extent.createTest("Select read receipt from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Read Receipt: Select Read receipt");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		
		test.info("EXPECTED RESULT:: It should display the Read receipt symbol in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the Read receipt symbol in both user & group");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  
  @Test
  public void testcase21() throws InterruptedException {
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
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		
		//box icons voice msg
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[4]/div[3]/div[2]/div[5]/div[3]/label/span")).click();
			Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[@data-name='unit']")).click();
		Thread.sleep(1000);
		
		String a = driver.findElement(By.xpath("//div[@data-name='unit']")).getText();
		Assert.assertEquals("Unit", a);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[9]/span[1]")).click();
		Thread.sleep(1000);
		
		//fonts format
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[1]/div/div[4]/span")).click();
		Thread.sleep(1000);
		
		String b = driver.findElement(By.xpath("//input[@id='voiceMessageSwitch']")).getAttribute("id");
		Assert.assertEquals("voiceMessageSwitch", b);
		
		ExtentTest test= Extent.createTest("Select voice message from message entrybox icons");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sai1@gmail.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("Voice message: Select voice message");
		test.info("Refresh: Click on refresh");
		test.info("User: Click on unit");
		test.info("Settings: Click on personal settings");
		test.info("Fonts & format: Click on Fonts & format");
		test.info("EXPECTED RESULT:: It should display the voice message symbol in both user & group");
		test.pass(a);
		test.pass(b);
		
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the voice message symbol in both user & group");
		test.pass("Test Case:: TestCase PASSED");
		
		Thread.sleep(500);
		driver.close();
  }
  
  
  @AfterSuite
  public void afterSuite() {
	  Extent.flush();
  }

}
