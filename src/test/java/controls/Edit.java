package controls;


import java.io.IOException;

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

public class Edit {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("Edit1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioTime1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[1]/option[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[2]/option[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='sharath']")).click();
		Thread.sleep(1000);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test123");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Edit with hrs and min");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 1hr 10min");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : sharath");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should add hrs and min & edit the msg");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals(a1, "edited-conversation-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding hrs & min & editing the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioTime1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[1]/option[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[2]/option[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='Upendra']")).click();
		Thread.sleep(1000);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test123");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Edit with min");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 1hr 10min");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : Upendra");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should add only min & edit the msg");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals(a1, "edited-conversation-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding min & editing the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioTime2\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[2]/select/option[2]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[2]/option[10]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test123");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Edit with days");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add 2 days");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : sharath");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should add 2 days & edit the msg");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals(a1, "edited-conversation-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding 2 days & editing the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"permissionEditRadioTime3\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[2]/select/option[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[2]/option[10]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test123");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Edit with anytime");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add anytime");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : abc sai");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should add any time & edit the msg");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals(a1, "edited-conversation-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding any time & editing the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"permissionEditRadioTime3\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[3]/div[2]/div/div[1]/label")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[2]/option[10]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test123");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Deselect the user checkbox");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add anytime");
		test.info("De-Select the user checkbox");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : abc sai");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should add any time & It should edit the msgs for TM-admin user");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals(a1, "edited-conversation-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding any time & It is editing the msg for TM-admin users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"permissionEditRadioTime3\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[3]/div[2]/div/div[1]/label")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[3]/div[2]/div/div[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Deselect the TM-admin checkbox");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add anytime");
		test.info("De-Select the admin checkbox");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : abc sai");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("EXPECTED RESULT:: It should add any time & It should not edit the msg only for TM-admin users");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Assert.assertEquals(a1, "TM-Admin disabled this feature");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding any time & It is not editing the msg only for TM-admin users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test6() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"permissionEditRadioTime3\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[3]/div[2]/div/div[1]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[3]/div[2]/div/div[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test123");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Edit with both users & TM-admin checkbox");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add anytime");
		test.info("Select the TM-admin checkbox");
		test.info("Select the user checkbox");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : abc sai");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should add any time & It should edit the msg");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-icon']")).getAttribute("class");
		Assert.assertEquals(a1, "edited-conversation-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding any time & It is editing the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test7() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioEnable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"permissionEditRadioTime3\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[2]/select/option[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[2]/div[2]/div[1]/select[2]/option[10]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).clear();
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Edit with anytime & Clear the msg & send it");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Enable");
		test.info("Timeslot:Add anytime");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : abc sai");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("Clear the msg");
		test.info("EXPECTED RESULT:: It should add any time & edit the msg");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Assert.assertEquals(a1, "Message cannot be empty!");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding any time & editing the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test8() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@trends.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[14]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionEditRadioDisable\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[15]/div[2]/div[4]/input")).click();
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='0']")).click();
		driver.findElement(By.xpath("//div[@data-name='abc sai']")).click();
		Thread.sleep(500);
		WebElement s = driver.findElement(By.xpath("//div[@class='conversation-message']"));
		Actions a=new Actions(driver);
		a.moveToElement(s).contextClick().perform();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//a[@data-action='edit']"));
		Actions ac=new Actions(driver);
		ac.click(e).perform();
		Thread.sleep(1000);
		Thread.sleep(1000);
		ExtentTest test = extent.createTest("Click on Disable");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:sharath@trends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("AdminDashboard:Click on AdminDashboard");
		test.info("Control:Click on controls");
		test.info("Edit:click on Edit");
		test.info("Enable:Click on Disable");
		test.info("Click on save button");
		test.info("Refresh the page");
		test.info("Click on user : abc sai");
		test.info("Select the msg & Right click on it");
		test.info("Click on edit");
		test.info("EXPECTED RESULT:: It should add any time & It should not edit the msg by both TM-admin & users");
		Assert.assertEquals(actual, "Permissions applied");
		test.pass(actual);
		String a1=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Assert.assertEquals(a1, "TM-Admin disabled this feature");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is adding any time & It is not editing the msg by both TM-admin & users");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	} 
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}
