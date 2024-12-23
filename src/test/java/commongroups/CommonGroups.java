package commongroups;

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

public class CommonGroups {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports Extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("common groups.html");
		Extent = new ExtentReports();
		Extent.attachReporter(htmlReporter);
	}
	@Test
	public void testcs() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='user-profile-tab']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='user-profile-tab']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@id='commonGroupsList']")).getText();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Common groups in user1");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Click on user profile");
		test.info("Click on common groups");
		Assert.assertEquals(a1, "Common Groups");
		test.pass(a1);
		test.info("EXPECTED RESULT:: It should display common groups");
		Assert.assertEquals(a2, "commonGroupsSearchInput");
		test.pass(a2);
		Assert.assertEquals(a3, "tc\n"
				+ "test create search\n"
				+ "87 Members");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying common groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcs01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("a14");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='a14']")).getText();
		driver.findElement(By.xpath("//div[@data-name='a14']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='user-profile-tab']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='user-profile-tab']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).getAttribute("id");
		String a3=driver.findElement(By.xpath("//div[@id='commonGroupsList']")).getText();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("No Common groups in user1");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "A14");
		test.pass(a);
		test.info("Click on user profile");
		test.info("Click on common groups");
		Assert.assertEquals(a1, "Common Groups");
		test.pass(a1);
		test.info("EXPECTED RESULT:: It should not display common groups");
		Assert.assertEquals(a2, "commonGroupsSearchInput");
		test.pass(a2);
		Assert.assertEquals(a3, "No Groups in common!");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying common groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcs02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='user-profile-tab']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='user-profile-tab']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).sendKeys("test");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='commonGroupsList']")).getText();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Search the valid group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Click on user profile");
		test.info("Click on common groups");
		Assert.assertEquals(a1, "Common Groups");
		test.pass(a1);
		test.info("Click on search");
		test.info("Search with valid group");
		test.info("EXPECTED RESULT:: It should display groups");
		Assert.assertEquals(a2, "commonGroupsSearchInput");
		test.pass(a2);
		Assert.assertEquals(a3, "tc\n"
				+ "test create search\n"
				+ "87 Members");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcs03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='user-profile-tab']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='user-profile-tab']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).sendKeys("gdfs");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='no-results-found']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Search with invalid group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Click on user profile");
		test.info("Click on common groups");
		Assert.assertEquals(a1, "Common Groups");
		test.pass(a1);
		test.info("Click on search");
		test.info("Search with invalid group");
		test.info("EXPECTED RESULT:: It should not display groups");
		Assert.assertEquals(a2, "commonGroupsSearchInput");
		test.pass(a2);
		Assert.assertEquals(a3, "no-results-found");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcs04() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='user-profile-tab']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='user-profile-tab']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).sendKeys("create");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='commonGroupsList']")).getText();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Search with middle name of the group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Click on user profile");
		test.info("Click on common groups");
		Assert.assertEquals(a1, "Common Groups");
		test.pass(a1);
		test.info("Click on search");
		test.info("Search with group name : create");
		test.info("EXPECTED RESULT:: It should display groups");
		Assert.assertEquals(a2, "commonGroupsSearchInput");
		test.pass(a2);
		Assert.assertEquals(a3, "tc\n"
				+ "test create search\n"
				+ "87 Members");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying groups");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void testcs05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinu");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinu']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='user-profile-tab']")).getAttribute("title");
		driver.findElement(By.xpath("//div[@class='user-profile-tab']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).getAttribute("id");
		driver.findElement(By.xpath("//input[@id='commonGroupsSearchInput']")).sendKeys("create");
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='commonGroupsList']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='group-wrapper']")).click();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("//div[@id='chatUserImage']")).getText();
		String a5=driver.findElement(By.xpath("//span[@id='chatUserName']")).getText();
		Thread.sleep(1000);
		ExtentTest test = Extent.createTest("Click on group in common group tab");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Click on vinu");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("Click on user profile");
		test.info("Click on common groups");
		Assert.assertEquals(a1, "Common Groups");
		test.pass(a1);
		test.info("Click on search");
		test.info("Search with group name : create");
		Assert.assertEquals(a2, "commonGroupsSearchInput");
		test.pass(a2);
		Assert.assertEquals(a3, "tc\n"
				+ "test create search\n"
				+ "87 Members");
		test.pass(a3);
		test.info("EXPECTED RESULT:: It should display group in chat page");
		Assert.assertEquals(a4, "TC");
		test.pass(a4);
		Assert.assertEquals(a5, "Test Create Search");
		test.pass(a5);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying group in chat page");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		Extent.flush();
	}
}
