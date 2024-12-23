package controls;

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

public class Miscellaneouschat {
	WebDriver driver;
	ExtentHtmlReporter HtmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void Starttest() {
		HtmlReporter = new ExtentHtmlReporter("Miscellaneouschat.html");
		extent = new ExtentReports();
		extent.attachReporter(HtmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Miscellaneous']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[1]/div[2]/div[1]/div/div[1]/span[2]")).getText();
		Assert.assertEquals(a, "1:1 Chat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='permissionMiscellaneousChatRadioDisable']")).click();
		String a1=driver.findElement(By.xpath("//input[@id='permissionMiscellaneousChatRadioDisable']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[2]/input")).click();
		Thread.sleep(2000);
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='usersListWrapper']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with disable");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on miscellaneous");
		test.info("Click on radio button of disable");
		test.info("click on save button");
		test.info("GoTo chat");
		test.info("Click on recent chat search");
		test.info("Click on all members & groups icon");
		test.info("Select All members");
		test.info("EXPECTED RESULT ::  It should not display users");
		test.pass(a);
		Assert.assertEquals(a1, "permissionMiscellaneousChatRadioDisable");
		test.pass(a1);
		Assert.assertEquals(actual, "Tm-Admin updated chat permissions.Reloading Browser..!");
		test.pass(actual);
		Assert.assertEquals(a2, "Members");
		test.pass(a2);
		Assert.assertEquals(a3, "MY\n"
				+ "Myself");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying users");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@class='recent-users-search-filter-text hidden']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with disable & View the deactivated");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on recent chat search");
		test.info("Click on all members & groups icon");
		test.info("EXPECTED RESULT ::  It should not display deactivated filter");
		Assert.assertEquals(a2, "recent-users-search-filter-text hidden");
		test.pass(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying deactivated filter");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(500);
		String a=driver.findElement(By.xpath("//div[@class='add-group-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='groupAllUsers']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with disable & Click on add group");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("EXPECTED RESULT ::  It should display users in add group");
		Assert.assertEquals(a, "add-group-btn");
		test.pass(a);
		Assert.assertEquals(a2, "SA\n"
				+ "saiteja\n"
				+ "TE\n"
				+ "teja");
		test.pass(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying users in add group");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='add-user-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='add-user-btn']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).sendKeys("madhan");
		driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("madhan3@psn.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberSubmitBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='usersListWrapper']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with disable & Click on add user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on add button");
		test.info("Click on add user");
		test.info("Add the user");
		test.info("View the recent chat page");
		test.info("EXPECTED RESULT ::  It should not display added user in recent chat page");
		Assert.assertEquals(a, "add-user-btn");
		test.pass(a);
		Assert.assertEquals(a1, "Employee added successfully");
		test.pass(a1);
		Assert.assertEquals(a2, "Members");
		test.pass(a2);
		Assert.assertEquals(a3, "MY\n"
				+ "Myself");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not displaying added user in recent chat page");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test04() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfss']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-username='teja']")).getAttribute("data-username");
		WebElement e=driver.findElement(By.xpath("//div[@id='groupMember_2-5']"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='group-member-options'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).build().perform();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[3]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[3]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with disable & Click on group & View the user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on group");
		test.info("Click on profile");
		test.info("Select the user");
		test.info("Click on 3 dots");
		test.info("Click on view");
		test.info("EXPECTED RESULT ::  It should not have permission to view the profile");
		Assert.assertEquals(a, "teja");
		test.pass(a);
		Assert.assertEquals(a4, "View");
		test.pass(a4);
		Assert.assertEquals(a3, "You dont have permissions to see user profile");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not having the permission to view the profile");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfss']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-username='teja']")).getAttribute("data-username");
		WebElement e=driver.findElement(By.xpath("//div[@id='groupMember_2-5']"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='group-member-options'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).build().perform();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[4]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[4]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with disable & Click on group & Click on message for user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on group");
		test.info("Click on profile");
		test.info("Select the user");
		test.info("Click on 3 dots");
		test.info("Click on message");
		test.info("EXPECTED RESULT ::  It should not have permission to message to the user");
		Assert.assertEquals(a, "teja");
		test.pass(a);
		Assert.assertEquals(a4, "Message");
		test.pass(a4);
		Assert.assertEquals(a3, "You dont have permissions to chat with user");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is not having the permission to message to the user");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test06() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-value='Miscellaneous']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[1]/div[2]/div[1]/div/div[1]/span[2]")).getText();
		Assert.assertEquals(a, "1:1 Chat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='permissionMiscellaneousChatRadioEnable']")).click();
		String a1=driver.findElement(By.xpath("//input[@id='permissionMiscellaneousChatRadioEnable']")).getAttribute("id");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[25]/div[2]/div[2]/input")).click();
		Thread.sleep(2000);
		String actual=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='usersListWrapper']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with enable");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on miscellaneous");
		test.info("Click on radio button of enable");
		test.info("click on save button");
		test.info("GoTo chat");
		test.info("Click on recent chat search");
		test.info("Click on all members & groups icon");
		test.info("Select All members");
		test.info("EXPECTED RESULT ::  It should display users");
		test.pass(a);
		Assert.assertEquals(a1, "permissionMiscellaneousChatRadioEnable");
		test.pass(a1);
		Assert.assertEquals(actual, "Tm-Admin updated chat permissions.Reloading Browser..!");
		test.pass(actual);
		Assert.assertEquals(a2, "Members");
		test.pass(a2);
		Assert.assertEquals(a3, "MA\n"
				+ "Madhan\n"
				+ "SA\n"
				+ "Saiteja\n"
				+ "MY\n"
				+ "Myself\n"
				+ "TE\n"
				+ "Teja");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying users");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test07() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[5]")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with enable & View the deactivated");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on recent chat search");
		test.info("Click on all members & groups icon");
		test.info("EXPECTED RESULT ::  It should display deactivated filter");
		Assert.assertEquals(a2, "De-Activated Users");
		test.pass(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying deactivated filter");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test08() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(500);
		String a=driver.findElement(By.xpath("//div[@class='add-group-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='add-group-btn']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//div[@id='groupAllUsers']")).getText();
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with enable & Click on add group");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on add button");
		test.info("Click on add group");
		test.info("EXPECTED RESULT ::  It should display users in add group");
		Assert.assertEquals(a, "add-group-btn");
		test.pass(a);
		Assert.assertEquals(a2, "MA\n"
				+ "madhan\n"
				+ "SA\n"
				+ "saiteja\n"
				+ "TE\n"
				+ "teja");
		test.pass(a2);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying users in add group");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test09() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='add-btn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='add-user-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='add-user-btn']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='addMemberNameInput']")).sendKeys("maddy");
		driver.findElement(By.xpath("//input[@id='addMemberEmailInput']")).sendKeys("maddy3@psn.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='addMemberSubmitBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='feedbackSection']")).getText();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='recent-users-search-filter-container active']")).click();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div/div[2]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='usersListWrapper']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with enable & Click on add user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on add button");
		test.info("Click on add user");
		test.info("Add the user");
		test.info("View the recent chat page");
		test.info("EXPECTED RESULT ::  It should display added user in recent chat page");
		Assert.assertEquals(a, "add-user-btn");
		test.pass(a);
		Assert.assertEquals(a1, "Employee added successfully");
		test.pass(a1);
		Assert.assertEquals(a2, "Members");
		test.pass(a2);
		Assert.assertEquals(a3, "MA\n"
				+ "Maddy\n"
				+ "MA\n"
				+ "Madhan\n"
				+ "SA\n"
				+ "Saiteja\n"
				+ "MY\n"
				+ "Myself\n"
				+ "TE\n"
				+ "Teja");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is displaying added user in recent chat page");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test10() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfss']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-username='teja']")).getAttribute("data-username");
		WebElement e=driver.findElement(By.xpath("//div[@id='groupMember_2-5']"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='group-member-options'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).build().perform();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[3]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[3]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@class='user-profile-tabs-container']")).getAttribute("class");
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with enable & Click on group & View the user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on group");
		test.info("Click on profile");
		test.info("Select the user");
		test.info("Click on 3 dots");
		test.info("Click on view");
		test.info("EXPECTED RESULT ::  It should have permission to view the profile");
		Assert.assertEquals(a, "teja");
		test.pass(a);
		Assert.assertEquals(a4, "View");
		test.pass(a4);
		Assert.assertEquals(a3, "user-profile-tabs-container");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is having the permission to view the profile");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test11() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@psn.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='dfss']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@data-username='teja']")).getAttribute("data-username");
		WebElement e=driver.findElement(By.xpath("//div[@id='groupMember_2-5']"));
		WebElement e1=driver.findElement(By.xpath("(//span[@class='group-member-options'])[2]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(e).click(e1).build().perform();
		Thread.sleep(1000);
		String a4=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[4]")).getText();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div/span[4]")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//span[@id='chatUserName']")).getText();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test=extent.createTest("Click on miscellaneous 1-1 chat with enable & Click on group & Click on message for user");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@email.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on group");
		test.info("Click on profile");
		test.info("Select the user");
		test.info("Click on 3 dots");
		test.info("Click on message");
		test.info("EXPECTED RESULT ::  It should have permission to message to the user");
		Assert.assertEquals(a, "teja");
		test.pass(a);
		Assert.assertEquals(a4, "Message");
		test.pass(a4);
		Assert.assertEquals(a3, "Teja");
		test.pass(a3);
		test.log(Status.PASS ,"ACTUAL RESULT ::  It is having the permission to message to the user");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
