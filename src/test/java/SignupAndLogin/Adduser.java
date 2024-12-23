package SignupAndLogin;

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

public class Adduser {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";

	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("AddUser.html");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		ExtentTest test = extent.createTest("Click AddUser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Add User:Click on AddUser");
		test.info("EXPECTED RESULT:: New AddUser Avaliable");
		test.log(Status.PASS,"ACTUAL RESULT:: New AddUser Available");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("Blank Page");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Add User:Click on AddUser");
		test.info("Name:Blank");
		test.info("Email:Blank");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Enter Valid Details");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please add at least one user");
		test.log(Status.PASS,"ACTUAL RESULT:: Please add at least one user");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();	
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("sai5324");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("sai.4633@gmail.com");
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("Add New AddUser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Add User:Click on AddUser");
		test.info("Name:sai50");
		test.info("Email:sai.60@gmail.com");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Add New AddUser");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Employee added successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: Employee added successfully");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("sai52");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("sai.3@gmail.com");
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("Add another in New AddUser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Add User:Click on AddUser");
		test.info("Name:sai12");
		test.info("Email:sai123@gmail.com");
		test.info("AddAnother:Click on add another");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: New user Added");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please add at least one user");
		test.log(Status.PASS,"ACTUAL RESULT:: Employee added successfully");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("gasf");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("dffd@");
		
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("InValid AddUser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Add User:Click on AddUser");
		test.info("Name:adgdfgfdg");
		test.info("Email:agdfgdfhb@");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Enter Valid Details");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please add at least one user");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter valid email");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("sai56");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("adadsag@");
		
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("InValidEmail and ValidName");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Add User:Click on AddUser");
		test.info("Name:sai");
		test.info("Email:agdfgdfhb@");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Enter Valid Details");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please add at least one user");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter valid email");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("sai2556");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("adfvcdfbag");
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("Remove AddUser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AddUser:Click on AddUser");
		test.info("Name:sai");
		test.info("Email:agdfgdfhb@gmail.com");
		test.info("Add another:Click on add another");
		test.info("RemoveAddUser:Removing Add user");
		test.info("EXPECTED RESULT:: Remove add user");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please add at least one user");
		test.log(Status.PASS,"ACTUAL RESULT:: Removed new user successfully");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("adfdzxag@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		
		ExtentTest test = extent.createTest("Checking with only email");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AddUser:Click on AddUser");
		test.info("Name:Blank");
		test.info("Email:agdfgdfhb@");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Please enter name");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please add at least one user");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter name");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("sai55");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("");
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		
		ExtentTest test = extent.createTest("Checking with only Name");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AddUser:Click on AddUser");
		test.info("Name:sai");
		test.info("Email:Blank");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Please enter email");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please enter email");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter email");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("sai5adsf");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("adshdsgfd@gmail.com");
		driver.findElement(By.xpath("(//input[@class='form-control new-user-name'])[2]")).sendKeys("sieq3");
		driver.findElement(By.xpath("(//input[@class='form-control new-user-email'])[2]")).sendKeys("adefagag");
		
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//div[@id='closeAddNewUsersModal']")).click();
		ExtentTest test = extent.createTest("Valid and InValid AddUser");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AddUser:Click on AddUser");
		test.info("Name:sai");
		test.info("Email:agdfgdfhb@");
		test.info("Name2:sai35");
		test.info("Email2:sai54@gmail.com");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Please enter valid email");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please enter email");
		test.log(Status.PASS,"ACTUAL RESULT:: Please enter valid email");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("adfdag");
		
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//div[@id='closeAddNewUsersModal']")).click();
		ExtentTest test = extent.createTest("Checking with close button");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AddUser:Click on AddUser");
		test.info("Name:sai");
		test.info("Email:agdfgdfhb@");
		test.info("Close:Click on close button");
		test.info("EXPECTED RESULT:: New adduser should close");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Please enter email");
		test.log(Status.PASS,"ACTUAL RESULT:: Closed new add user");
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
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn']")).click();
		driver.findElement(By.xpath("//input[@class='form-control new-user-name']")).sendKeys("gadfdfaf");
		driver.findElement(By.xpath("//input[@class='form-control new-user-email']")).sendKeys("dsad@gmail.com");
		
		driver.findElement(By.xpath("(//input[@class='form-control new-user-name'])[2]")).sendKeys("gadds");
		driver.findElement(By.xpath("(//input[@class='form-control new-user-email'])[2]")).sendKeys("dfdf@gmail.com");
		
		driver.findElement(By.xpath("(//input[@class='form-control new-user-name'])[3]")).sendKeys("gadfd");
		driver.findElement(By.xpath("(//input[@class='form-control new-user-email'])[3]")).sendKeys("dsdf@gmail.com");
		driver.findElement(By.xpath("//div[@class='add-another-user-btn']")).click();
		driver.findElement(By.xpath("//span[@class='new-user-remove']")).click();
		driver.findElement(By.xpath("//input[@id='addNewUserBtn']")).click();
		ExtentTest test = extent.createTest("Multiple users");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharathy.60@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("AddUser:Click on AddUser");
		test.info("Name1:sai");
		test.info("Email1:sai@gmail.com");
		test.info("Name2:sai1");
		test.info("Email2:sai1@gmail.com");
		test.info("Name3:sai12");
		test.info("Email3:sai12@gmail.com");
		test.info("Add:Click on Add");
		test.info("EXPECTED RESULT:: Add multiple user");
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@class='feedback-section']")).getText(),  "Employee added successfully");
		test.log(Status.PASS,"ACTUAL RESULT:: Employee added successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void EndTest() {
		extent.flush();
	}
}
