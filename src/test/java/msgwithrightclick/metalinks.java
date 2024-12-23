package msgwithrightclick;

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

public class metalinks {
	WebDriver driver;
	ExtentHtmlReporter HtmlReporter;
	ExtentReports Extent;
	@BeforeSuite
	public void Starttest() {
		HtmlReporter = new ExtentHtmlReporter("metalinks.html");
		Extent = new ExtentReports();
		Extent.attachReporter(HtmlReporter);
	}
	@Test
	public void test00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='browser-link']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Send link to the user");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Enter link");
		test.info("Send the link");
		test.info("EXPECTED RESULT:: It should send the link");
		Assert.assertEquals(a, "https://www.google.com");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='reply']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='reply']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-reply-container']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='conversation-reply-message']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Send reply to the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on reply msg");
		test.info("Send the msg");
		test.info("EXPECTED RESULT:: It should send reply msg");
		Assert.assertEquals(a2, "reply");
		test.pass(a2);
		Assert.assertEquals(a, "Me\n"
				+ "https://www.google.com");
		test.pass(a);
		Assert.assertEquals(a1, "You\n"
				+ "https://www.google.com\n"
				+ "test\n"
				+ "12:02");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending reply msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test02() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.doubleClick(e).build().perform();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='global-copy-icon']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='global-copy-icon']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Copy the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Copy the link");
		test.info("EXPECTED RESULT:: It should copy the link");
		Assert.assertEquals(a1, "global-copy-icon");
		test.pass(a1);
		Assert.assertEquals(a, "Copied!");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is copying the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.quit();	
	}
	@Test
	public void test03() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='forward']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='forward']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='forwardMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='forwardUser_1418-2']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//div[@id='modalForwardSendMessageBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='A1B1C2']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='forward-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Forward the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click forward msg");
		test.info("Select any user/group");
		test.info("EXPECTED RESULT:: It should send forward msg");
		Assert.assertEquals(a2, "forward");
		test.pass(a2);
		Assert.assertEquals(a1, "modalForwardSendMessageBtn");
		test.pass(a1);
		Assert.assertEquals(a, "forward-conversation-label-icon");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending forward msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test04() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='flag']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='flag']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='flag-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Flag to the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on flag");
		test.info("EXPECTED RESULT:: It should display flag to the msg");
		Assert.assertEquals(a2, "flag");
		test.pass(a2);
		Assert.assertEquals(a, "flag-conversation-label-icon");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying flag to the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='flag']")).getText();
		driver.findElement(By.xpath("//a[@data-action='flag']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='flag-conversation-label-icon']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("UnFlag the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on unflag");
		test.info("EXPECTED RESULT:: It should not display flag to the msg");
		Assert.assertEquals(a2, "Unflag");
		test.pass(a2);
		Assert.assertEquals(a, "");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying flag to the msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test06() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
		driver.findElement(By.xpath("//a[@data-action='pin']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Pin the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on pin");
		test.info("EXPECTED RESULT:: It should display pin icon to the link");
		Assert.assertEquals(a2, "Pin");
		test.pass(a2);
		Assert.assertEquals(a, "pin-conversation-label-icon");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying pin icon to the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test07() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
		driver.findElement(By.xpath("//a[@data-action='pin']")).click();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("UnPin the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on unpin");
		test.info("EXPECTED RESULT:: It should not display pin icon to the link");
		Assert.assertEquals(a2, "Unpin");
		test.pass(a2);
		test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying pin icon to the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test08() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='maneesh']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='info']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='info']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='message-content-wrapper']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Click on Info to the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on info");
		test.info("EXPECTED RESULT:: It should display info to the link");
		Assert.assertEquals(a2, "info");
		test.pass(a2);
		Assert.assertEquals(a, "Android\n"
				+ "https://www.google.com\n"
				+ "11:59 am");
		test.pass(a);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying info to the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test09() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='Added By']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='edit']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='edit']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//div[@class='chat-edit-container']")).getText();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).clear();
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("http://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//span[@class='edited-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Edit the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on edit");
		test.info("Edit the msg");
		test.info("EXPECTED RESULT:: It should edit the link");
		Assert.assertEquals(a2, "edit");
		test.pass(a2);
		Assert.assertEquals(a, "Me\n"
				+ "https://www.google.com");
		test.pass(a);
		Assert.assertEquals(a1, "edited-conversation-label-icon");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is editing the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test10() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='A1B1C2']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='recall']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		String a1=driver.findElement(By.xpath("//div[@class='recall-conversation-text']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Recall the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on recall");
		test.info("Recall the link");
		test.info("EXPECTED RESULT:: It should recall the link");
		Assert.assertEquals(a2, "recall");
		test.pass(a2);
		Assert.assertEquals(a, "RECALL");
		test.pass(a);
		Assert.assertEquals(a3, "Message Recalled!");
		test.pass(a3);
		Assert.assertEquals(a1, "You recalled this message");
		test.pass(a1);
		test.log(Status.PASS,"ACTUAL RESULT:: It is recalling the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@Test
	public void test11() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-name='A1B1C2']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//span[@class='browser-link']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e).build().perform();
		Thread.sleep(1000);
		String a2=driver.findElement(By.xpath("//a[@data-action='delete']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='delete']")).click();
		Thread.sleep(1000);
		String a=driver.findElement(By.xpath("//span[@id='deleteMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='deleteMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='deleteConfirmationYesBtn']")).click();
		Thread.sleep(1000);
		String a3=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Delete the link");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email: android@tm.com");
		test.info("Password: 123456");
		test.info("Login: Click on login");
		test.info("Click on user");
		test.info("Select the link");
		test.info("Right click on it");
		test.info("Click on delete");
		test.info("delete the link");
		test.info("EXPECTED RESULT:: It should delete the link");
		Assert.assertEquals(a2, "delete");
		test.pass(a2);
		Assert.assertEquals(a, "DEL");
		test.pass(a);
		Assert.assertEquals(a3, "Message Deleted!");
		test.pass(a3);
		test.log(Status.PASS,"ACTUAL RESULT:: It is deleting the link");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();	
	}
	@AfterSuite
	public void endTest() {
		Extent.flush();
	}
}