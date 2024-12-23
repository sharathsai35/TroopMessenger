package controls;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Orangemember {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Orangemember.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("test5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select the checkbox of Can't be added into groups");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("Select Can't be added into groups");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("click on add button");
		test.info("Click on Add Group");
		test.info("Enter Group name");
		test.info("Select any user");
		test.info("Click on Create");
		Assert.assertEquals(a2, "You dont have permission to create group. Please contact your company admin.");
		test.pass(a2);
		test.info("EXPECTED RESULT ::  It should not create the Group in Orange User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  You dont have permission to create group. Please contact your company admin.");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("test5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("De-Select the checkbox of Can't be added into groups");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("De-Select Can't be added into groups");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("click on add button");
		test.info("Click on Add Group");
		test.info("Enter Group name");
		test.info("Select any user");
		test.info("Click on Create");
		Assert.assertEquals(a2, "Group created successfully");
		test.pass(a2);
		test.info("EXPECTED RESULT ::  It should create the Group in Orange User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is creating the group for Orange user");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/ul[1]/li[5]/a\n")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select the checkbox of Can't see message info of other users");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("Select Can't see message info of other users");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Select any user");
		test.info("Select message");
		test.info("Click on info");
		Assert.assertEquals(a1, "You don't have permission to see message info of other users.");
		test.pass(a1);
		test.info("EXPECTED RESULT ::  It should not display the info of received msgs in Orange User");
		test.log(Status.PASS ,"ACTUAL RESULT ::  You don't have permission to see message info of other users.");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).perform();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/ul[1]/li[5]/a\n")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='message-info-wrapper']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("De-Select the checkbox of Can't see message info of other users");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("De-Select Can't see message info of other users");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Select any user");
		test.info("Select message");
		test.info("Click on info");
		test.info("EXPECTED RESULT ::  It should display the info of of received msgs");
		Assert.assertEquals(a1, "message-info-wrapper");
		test.pass(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying the info of received msgs");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test04() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[4]/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select the checkbox of Can't see profile info of other users");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("Select Can't see Profile info of other users");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Select any user");
		test.info("Click on Profile");
		test.info("EXPECTED RESULT ::  It should not display the info of user profile in Orange User");
		Assert.assertEquals(a1, "You dont have permission to see other user profile");
		test.pass(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  You dont have permission to see other user profile");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[4]/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='profile-tabs-container']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("De-Select the checkbox of Can't see profile info of other users");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("De-Select Can't see Profile info of other users");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Select any user");
		test.info("Click on Profile");
		test.info("EXPECTED RESULT ::  It should display the info of user profile in Orange User");
		Assert.assertEquals(a1, "profile-tabs-container");
		test.pass(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying profile info of users");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test06() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='orangeMemberPermissionCantCallCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@class='audio-call-header-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='audio-call-header-btn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select the checkbox of Can't Make 1:1 calls");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("Select Can't Make 1:1 calls");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Select any user");
		test.info("Click on audio call");
		Assert.assertEquals(a2, "Audio Call");
		test.pass(a2);
		test.info("EXPECTED RESULT ::  It should not call to user in orange member");
		Assert.assertEquals(a1, "You don't have permission to make this call");
		test.pass(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  You don't have permission to make this call");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test07() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("chrome://flags");
		ChromeOptions options = new ChromeOptions()
			    .addArguments("--unsafely-treat-insecure-origin-as-secure=http://192.168.2.55:8081");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		Map<String, Object> prefs = new HashMap<String, Object>();
  		//Put this into prefs map to switch off browser notification
  		prefs.put("profile.default_content_setting_values.notifications", 1);
  		options.setExperimentalOption("prefs", prefs);
  		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='orangeMemberPermissionCantCallCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@class='audio-call-header-btn']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='audio-call-header-btn']")).click();
		Thread.sleep(5000);
		prefs.put("profile.default_content_setting_values.notifications", 1);
  		options.setExperimentalOption("prefs", prefs);
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='calling-text']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("De-Select the checkbox of Can't Make 1:1 calls");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("Click on controls");
		test.info("Click on Orange member");
		test.info("De-Select Can't Make 1:1 calls");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Select any user");
		test.info("Click on audio call");
		Assert.assertEquals(a2, "Audio Call");
		test.pass(a2);
		test.info("EXPECTED RESULT ::  It should call to user in orange member");
		Assert.assertEquals(a1, "calling-text");
		test.pass(a1);
		test.log(Status.PASS ,"ACTUAL RESULT ::  You don't have permission to make this call");
		test.pass("Test Case:: TestCase PASSED");
		driver.quit();
	}
	@Test
	public void test08() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='orangeMemberPermissionOrangeDotCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		String a1=driver.findElement(By.xpath("//input[@id='recentUserSearch']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@style='color:#a0435b']")).getAttribute("style");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select the checkbox of Replace Orange Dot with Light Orange");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Orange member");
		test.info("Select Replace Orange Dot with Light Orange");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Click on search");
		Assert.assertEquals(a1, "recentUserSearch");
		test.pass(a1);
		test.info("Click on all member & groups drop down");
		test.info("Click on orange members");
		Assert.assertEquals(a2, "Orange Member");
		test.pass(a2);
		test.info("EXPECTED RESULT ::  It should display Orange Dot with Light Orange in Orange User");
		Assert.assertEquals(a3, "color: rgb(160, 67, 91);");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying Light Orange Dot");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void test09() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='orangeMemberPermissionOrangeDotCheckbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='btn btn-default submit-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[6]/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("divi@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(3000);
		String a1=driver.findElement(By.xpath("//input[@id='recentUserSearch']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).getText();
		driver.findElement(By.xpath("(//div[@class='recent-users-search-filter-text'])[3]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@style='color:#693874']")).getAttribute("style");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Select the checkbox of Replace Orange Dot with Light Orange");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on Orange member");
		test.info("Select Replace Orange Dot with Light Orange");
		test.info("Click on apply");
		Assert.assertEquals(a, "Conditions applied");
		test.pass(a);
		test.info("Click on Refresh");
		test.info("Click on Logout");
		test.info("Login into Orange user");
		test.info("Click on search");
		Assert.assertEquals(a1, "recentUserSearch");
		test.pass(a1);
		test.info("Click on all member & groups drop down");
		test.info("Click on orange members");
		Assert.assertEquals(a2, "Orange Member");
		test.pass(a2);
		test.info("EXPECTED RESULT ::  It should display Orange Dot with dark in Orange User");
		Assert.assertEquals(a3, "color:#693874");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying dark Orange Dot");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(3000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
