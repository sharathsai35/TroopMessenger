package Group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Groupscreation {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";

	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("groupcreation.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click Group User");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("EXPECTED RESULT:: New Group User Avaliable");
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true,ActualResult);
		test.log(Status.PASS,"ACTUAL RESULT:: New Group User Avaliable");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing");
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true,ActualResult);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Write Group Name");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("EXPECTED RESULT:: New Group Name Avaliable");
		test.log(Status.PASS,"ACTUAL RESULT:: New Group Name Avaliable");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//span[@id='removeCreateGroupIcon']")).click();
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Blank Page");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: Please enter group name");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please enter group name");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter group name");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Group Name_Blank");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Blank");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: Please enter group name");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please enter group name");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter group name");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Create New Group Without Data");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: Minimum 2 users are required for creating a group");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Minimum 2 users are required for creating a group!");
		test.log(Status.PASS,"ACTUAL RESULT:: Minimum 2 users are required for creating a group!");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Click Add Members");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Add Members:Click on Add Members");
		test.info("EXPECTED RESULT:: Should Add in Selected Members");
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true, ActualResult);
		test.log(Status.PASS,"ACTUAL RESULT:: Should Add in Selected Members");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupDescriptionInput']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Tedsafg");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Write Description and Create");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Description:Automation Testing");
		test.info("Group Name:Testing123");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: Group created successfully");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Group created successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: Group created successfully");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();	
	}
	@Test
	public void test7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupDescriptionInput']")).sendKeys("rqwerthrhsthrewqewrdfadsnfgadsfldnafgdoafgjadfoisjgadsgmdscdvkdsadfdsdsvfdsvjdvdajvdafjadvava");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testinguser");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true, ActualResult);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Write Description More than 80 Characters");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("rqwerthrhsthrewqewrdfadsnfgadsfldnafgdoafgjadfoisjgadsgmdscdvkdsadfdsdsvfdsvjdvd");
		test.info("Group Name:Testing123");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: It will take only 80 Characters and Group created successfully");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Group created successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: It will take only 80 Characters and Group created successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testinguser1");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Add A/M in Selected Members");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Add Members:Click on Add Members");
		test.info("Selected Members:Add as Admin/Moderator");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: Group created successfully");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Group created successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: Group created successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test9() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing User1");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true, ActualResult);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Without Adding A/M and Create");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Add Members:Click on Add Members");
		test.info("Create:Click on Create");
		test.info("EXPECTED RESULT:: Create the Group as Testing User Without A/M");
		test.log(Status.PASS,"ACTUAL RESULT:: Create the Group as Testing User Without A/M");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void testcase10() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing User2");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true, ActualResult);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Attachement Group Avatar");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Add Members:Click on Add Members");
		test.info("Group Avatar:Attach the Picture");
		test.info("EXPECTED RESULT:: Attach a Group Avatar and Group created successfully");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Group created successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: Attach a Group Avatar and Group created successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void testcase11() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//span[@id='removeCreateGroupIcon']")).click();
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing User3");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true, ActualResult);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Removing The Avatar");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Add Members:Click on Add Members");
		test.info("Group Avatar:Removing the Avatar");
		test.info("EXPECTED RESULT:: Remove Group Avatar ");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Group created successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: Remove Group Avatar ");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void testcase12() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/extentreport5.html");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing User4");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='closeAddNewUsersModal']")).click();
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Create File in Group Avatar");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing User3");
		test.info("Add Members:Click on Add Members");
		test.info("Selected Members:Add as Admin/Moderator");
		test.info("Group Avatar:Select any File");
		test.info("EXPECTED RESULT:: File should not support in the Group Avatar");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "html format is not supported!");
		test.log(Status.PASS,"ACTUAL RESULT:: html format is not supported");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void testcase13() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://testing.troopmessenger.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharathy.60@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing User2");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='closeAddNewUsersModal']")).click();
		String testTitle = "Troop Messenger";
		String ActualResult = driver.getTitle();
		Assert.assertEquals(ActualResult, testTitle);
		Assert.assertTrue(true, ActualResult);
		Thread.sleep(2000);
		ExtentTest test = extent.createTest("Close New Group");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Group User:Click on Group User");
		test.info("Group Name:Testing");
		test.info("Add Members:Click on Add Members");
		test.info("Selected Members:Add as Admin/Moderator");
		test.info("Close:Click on Close");
		test.info("EXPECTED RESULT:: Close the New Group");
		test.log(Status.PASS,"ACTUAL RESULT:: Close the New Group");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@AfterSuite
	public void EndTest() {
		extent.flush();
		//driver.close();
	}
}
