package Trumpet;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Trumpet {
	WebDriver driver;
	WebDriver driver1;
	ExtentHtmlReporter Htmlreporter;
	ExtentReports Extent;
	@BeforeTest
	public void beforeTest() {
		Htmlreporter = new ExtentHtmlReporter("Trumpet.html");
		Extent = new ExtentReports();
		Extent.attachReporter(Htmlreporter);
	}
	@Test
	public void testcas00() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinay");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinay']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinay']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinay@tm.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		Thread.sleep(1000);
		String c = driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String d = driver.findElement(By.xpath("//span[@class='trumpet-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		String e = driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]")).getText();
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='trumpet-message-box']")).getText();
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[2]")).getText();
		String a6=driver1.findElement(By.xpath("(//div[@class='conversation-reply-message'])[2]")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Click on trumpet & send text msg");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Open another chrome2");
		test.info("Navigate to URL");
		test.info("Email : Vinay@tm.com");
		test.info("Password: 123456");
		test.info("Login : Click on login");
		test.info("In 1st chrome : Search: vinay");
		Assert.assertEquals(a, "Vinay");
		test.pass(a);
		test.info("User:click on vinay");
		test.info("Trumpet:click on Trumpet");
		Assert.assertEquals(b, "input-trumpet-btn input-action-btn");
		test.pass(b);
		test.info("Text msg: hii");
		test.info("Send: Click on send");
		Assert.assertEquals(c, "sendMessageBtn");
		test.pass(c);
		Assert.assertEquals(d, "trumpet-conversation-label-icon");
		test.pass(d);
		Assert.assertEquals(e, "hii");
		test.pass(e);
		test.info("View the another chrome2");
		test.info("Send the msg in trumpet");
		test.info("EXPECTED RESULT:: It should display send reply msg to trumpet msg");
		Assert.assertEquals(a1, "hii");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a5, "You\n"
				+ "hii\n"
				+ "test\n"
				+ "12:37");
		test.pass(a5);
		Assert.assertEquals(a6, "Android\n"
				+ "hii\n"
				+ "test\n"
				+ "12:37");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying sending reply msg to trumpet msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}
	@Test
	public void testcas01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinay");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinay']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinay']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinay@tm.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		//Type the msg
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		Thread.sleep(1000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		Assert.assertEquals("input-trumpet-btn input-action-btn", b);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(500);
		// click on send
		String c = driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).getAttribute("id");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(500);
		String d = driver.findElement(By.xpath("//div[@class='trumpet-conversation-label']")).getAttribute("class");
		Thread.sleep(500);
		String e = driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]")).getText();
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='trumpet-message-box']")).getText();
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[2]")).getText();
		String a6=driver1.findElement(By.xpath("(//div[@class='conversation-reply-message'])[2]")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Type text msg and click on trumpet");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Open another chrome2");
		test.info("Navigate to URL");
		test.info("Email : Vinay@tm.com");
		test.info("Password: 123456");
		test.info("Login : Click on login");
		test.info("In 1st chrome : Search: vinay");
		Assert.assertEquals(a, "Vinay");
		test.pass(a);
		test.info("User:click on vinay");
		test.info("Text msg: hii");
		test.info("Trumpet:click on Trumpet");
		Assert.assertEquals(b, "input-trumpet-btn input-action-btn");
		test.pass(b);
		test.info("Send: Click on send");
		Assert.assertEquals(c, "sendMessageBtn");
		test.pass(c);
		Assert.assertEquals(d, "trumpet-conversation-label");
		test.pass(d);
		Assert.assertEquals(e, "hii");
		test.pass(e);
		test.info("View the another chrome2");
		test.info("Send the msg in trumpet");
		test.info("EXPECTED RESULT:: It should display send reply msg to trumpet msg");
		Assert.assertEquals(a1, "hii");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a5, "You\n"
				+ "hii\n"
				+ "test\n"
				+ "12:37");
		test.pass(a5);
		Assert.assertEquals(a6, "Android\n"
				+ "hii\n"
				+ "test\n"
				+ "12:37");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying sending reply msg to trumpet msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}
	@Test
	public void testcas02() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinay");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinay']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinay']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinay@tm.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(500);
		//click on attachment
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(500);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/1694607793477.jpg");
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
		Thread.sleep(4000);
		String c = driver.findElement(By.xpath("//div[@class='trumpet-conversation-label']")).getAttribute("class");
		Thread.sleep(500);
		String d =  driver.findElement(By.xpath("//span[@class='image-attachment-span']")).getAttribute("class"); 
		Assert.assertEquals("image-attachment-span",d);
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='attachment-image-wrapper']")).getAttribute("class");
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//div[@class='conversation-reply-message']")).getText();
		String a6=driver1.findElement(By.xpath("//div[@class='conversation-reply-message']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Click on trumpet & send image");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Open another chrome2");
		test.info("Navigate to URL");
		test.info("Email : Vinay@tm.com");
		test.info("Password: 123456");
		test.info("Login : Click on login");
		test.info("In 1st chrome : Search: vinay");
		Assert.assertEquals(a, "Vinay");
		test.pass(a);
		test.info("User:click on vinay");
		test.info("Trumpet:click on Trumpet");
		Assert.assertEquals("input-trumpet-btn input-action-btn", b);
		test.pass(b);
		test.info("Attachment: Click on attachment");
		test.info("Image: Select image");
		test.info("Send: Click on send");
		Assert.assertEquals(c, "trumpet-conversation-label");
		test.pass(c);
		test.pass(d);
		test.info("View the another chrome2");
		test.info("Send the msg in trumpet");
		test.info("EXPECTED RESULT:: It should send reply msg to trumpet image");
		Assert.assertEquals("trumpet-conversation-label", c);
		Assert.assertEquals(a1, "attachment-image-wrapper");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a5, "You\n"
				+ "test\n"
				+ "12:30");
		test.pass(a5);
		Assert.assertEquals(a6, "Android\n"
				+ "test\n"
				+ "12:30");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending reply msg to trumpet image");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}

	@Test
	public void testcas03() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vinay");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vinay']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vinay']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinay@tm.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		Assert.assertEquals("input-trumpet-btn input-action-btn", b);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(500);
		//click on attachment
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(500);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/20210827_180112.mp4");
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
		Thread.sleep(8000);
		String c = driver.findElement(By.xpath("//div[@class='trumpet-conversation-label']")).getAttribute("class");
		Assert.assertEquals("trumpet-conversation-label", c);
		Thread.sleep(3000);
		String d = driver.findElement(By.xpath("//div[@class='video-attachment-wrapper']")).getAttribute("class"); 
		Assert.assertEquals("video-attachment-wrapper", d);
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='attachment-video-wrapper']")).getAttribute("class");
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[3]")).getText();
		String a6=driver1.findElement(By.xpath("(//div[@class='conversation-reply-message'])[3]")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Click on trumpet & send video");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Open another chrome2");
		test.info("Navigate to URL");
		test.info("Email : Vinay@tm.com");
		test.info("Password: 123456");
		test.info("Login : Click on login");
		test.info("In 1st chrome : Search: vinay");
		Assert.assertEquals(a, "Vinay");
		test.pass(a);
		test.info("User:click on vinay");
		test.info("Trumpet:click on Trumpet");
		Assert.assertEquals("input-trumpet-btn input-action-btn", b);
		test.pass(b);
		test.info("Attachment: Click on attachment");
		test.info("Video: Select video");
		test.info("Send: Click on send");
		Assert.assertEquals(c, "trumpet-conversation-label");
		test.pass(c);
		test.pass(d);
		test.info("View the another chrome2");
		test.info("Send the msg in trumpet");
		test.info("EXPECTED RESULT:: It should send reply msg to trumpet video");
		Assert.assertEquals("trumpet-conversation-label", c);
		Assert.assertEquals(a1, "attachment-video-wrapper");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a5, "You\n"
				+ "20210827_180112.mp4\n"
				+ "test\n"
				+ "12:45");
		test.pass(a5);
		Assert.assertEquals(a6, "Android\n"
				+ "20210827_180112.mp4\n"
				+ "test\n"
				+ "12:45");
		test.pass(a6);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending reply msg to trumpet video");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}
	@Test
	public void testcas04() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
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
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vinu@gmail.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		Assert.assertEquals("input-trumpet-btn input-action-btn", b);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(500);
		//click on attachment
		driver.findElement(By.xpath("//div[@class='input-attachment-btn input-action-btn']")).click();
		Thread.sleep(500);
		Robot rb = new Robot();
		Thread.sleep(1000);
		StringSelection str = new StringSelection("/home/tvisha/Downloads/Aug_2021_Timesheet.xlsx");
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
		Thread.sleep(4000);
		// click on more
		String c1 = driver.findElement(By.xpath("//div[@class='messenger-attachment-drag-img']")).getAttribute("class");
		Assert.assertEquals("messenger-attachment-drag-img", c1);
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='messenger-attachment-drag-img']")).click();
		Thread.sleep(500);
		Thread.sleep(500);
		Robot rb1 = new Robot();
		Thread.sleep(1000);
		StringSelection str1 = new StringSelection("/home/tvisha/Downloads/1694607793477.jpg");
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
		Thread.sleep(2000);
		// add caption
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("image");
		Thread.sleep(500);
		// click on send
		String c = driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(8000);
		Thread.sleep(2000);
		Thread.sleep(2000);
		System.out.println("c");
		String d = driver.findElement(By.xpath("//div[@class='trumpet-conversation-label']")).getAttribute("class");
		Thread.sleep(1000);
		System.out.println("d");
		String e =  driver.findElement(By.xpath("//span[@class='messenger-attachment-link-name']")).getAttribute("class"); 
		Thread.sleep(1000);
		System.out.println("e");
		Thread.sleep(1000);
		String f= driver.findElement(By.xpath("//div[@class='trumpet-conversation-label']")).getAttribute("class");
		Thread.sleep(1000);
		System.out.println("f");
		String g =  driver.findElement(By.xpath("//span[@class='image-attachment-span']")).getAttribute("class"); 
		Assert.assertEquals("image-attachment-span",g);
		System.out.println("g");
		Thread.sleep(1000);
		String h =  driver.findElement(By.xpath("//span[@class='image-caption']")).getAttribute("class"); 
		Assert.assertEquals("image-caption",h);
		System.out.println("h");
		Thread.sleep(1000);
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='attachment-doc-name']")).getText();
		String a7=driver1.findElement(By.xpath("//div[@class='attachment-image-wrapper']")).getAttribute("class");
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a8=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a9=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a10=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[1]")).getText();
		String a6=driver1.findElement(By.xpath("(//div[@class='conversation-reply-message'])[1]")).getText();
		Thread.sleep(1000);
		String a11=driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[2]")).getText();
		String a12=driver1.findElement(By.xpath("(//div[@class='conversation-reply-message'])[2]")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Click on trumpet & send image & file with caption");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:maneesh@tends.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Search: asif");
		Assert.assertEquals(a, "Vinu");
		test.pass(a);
		test.info("User:click on vinu");
		test.info("Trumpet:click on Trumpet");
		test.pass(b);
		test.info("Attachment: Click on attachment");
		test.info("Image: Select image");
		test.pass(c1);
		test.info("Add: Click on Add more");
		test.info("Image: Select image");
		test.info("Caption: Add caption image");
		Assert.assertEquals(c, "sendMessageBtn");
		test.pass(c);
		Assert.assertEquals(d, "trumpet-conversation-label");
		test.pass(d);
		Assert.assertEquals("messenger-attachment-link-name",e);
		test.pass(e);
		test.pass(g);
		Assert.assertEquals(f, "trumpet-conversation-label");
		test.pass(f);
		test.pass(h);
		test.info("Send: Click on send");
		test.info("View the another chrome2");
		test.info("Send the msg in trumpet for doc & image");
		test.info("EXPECTED RESULT:: It should send reply msg to trumpet doc & image");
		Assert.assertEquals(a1, "Aug_2021_Timesheet.xlsx");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a7, "attachment-image-wrapper");
		test.pass(a7);
		Assert.assertEquals(a8, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a8);
		Assert.assertEquals(a9, "trumpet-message-input");
		test.pass(a9);
		Assert.assertEquals(a10, "trumpet-send-message-btn");
		test.pass(a10);
		Assert.assertEquals(a5, "You\n"
				+ "Aug_2021_Timesheet.xlsx\n"
				+ "test\n"
				+ "14:10");
		test.pass(a5);
		Assert.assertEquals(a6, "Android\n"
				+ "Aug_2021_Timesheet.xlsx\n"
				+ "test\n"
				+ "14:10");
		test.pass(a6);
		Assert.assertEquals(a11, "You\n"
				+ "test\n"
				+ "14:10");
		test.pass(a11);
		Assert.assertEquals(a12, "Android\n"
				+ "test\n"
				+ "14:10");
		test.pass(a12);
		test.log(Status.PASS,"ACTUAL RESULT:: It is sending reply msg to trumpet doc & image");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}
	@Test
	public void testcas05() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vishwa");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vishwa']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vishwa']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vishwa@tm.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		Thread.sleep(1000);
		String c = driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String d = driver.findElement(By.xpath("//span[@class='trumpet-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		String e = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='trumpet-message-box']")).getText();
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("//span[@class='received-message-text']"));
		Actions ac=new Actions(driver);
		ac.contextClick(e1).build().perform();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//a[@data-action='recall']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='recall']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='recallMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='recallConfirmationYesBtn']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("//div[@class='recall-conversation-text']")).getText();
		Thread.sleep(1000);
		String a9=driver1.findElement(By.xpath("//div[@class='recall-conversation-text']")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Recall the trumpet msg");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Open another chrome2");
		test.info("Navigate to URL");
		test.info("Email : Vinay@tm.com");
		test.info("Password: 123456");
		test.info("Login : Click on login");
		test.info("In 1st chrome : Search: vinay");
		Assert.assertEquals(a, "Vishwa");
		test.pass(a);
		test.info("User:click on vinay");
		test.info("Trumpet:click on Trumpet");
		Assert.assertEquals(b, "input-trumpet-btn input-action-btn");
		test.pass(b);
		test.info("Text msg: hii");
		test.info("Send: Click on send");
		Assert.assertEquals(c, "sendMessageBtn");
		test.pass(c);
		Assert.assertEquals(d, "trumpet-conversation-label-icon");
		test.pass(d);
		Assert.assertEquals(e, "hii");
		test.pass(e);
		test.info("View the another chrome2");
		test.info("From chrome1 : Recall the trumpet msg");
		test.info("EXPECTED RESULT:: It should recall the trumpet msg");
		Assert.assertEquals(a1, "hii");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a5, "recall");
		test.pass(a5);
		Assert.assertEquals(a6, "RECALL");
		test.pass(a6);
		Assert.assertEquals(a7, "Message Recalled!");
		test.pass(a7);
		Assert.assertEquals(a8, "You recalled this message");
		test.pass(a8);
		Assert.assertEquals(a9, "This message was recalled");
		test.pass(a9);
		test.log(Status.PASS,"ACTUAL RESULT:: It is recalling the trumpet msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}
	@Test
	public void testcas06() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("android@tm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		Thread.sleep(300);
		driver.manage().window().maximize(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// search user vinay
		driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("vishwa");
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//div[@data-name='vishwa']")).getText();
		driver.findElement(By.xpath("//div[@data-name='vishwa']")).click();
		Thread.sleep(1000);
		driver1 = new ChromeDriver();
		driver1.get("http://192.168.2.55:8081/login");
		driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("vishwa@tm.com");
		driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver1.manage().window().maximize(); 
		Thread.sleep(500);
		driver1.findElement(By.xpath("//div[@class='submit-wrap']")).click();
		Thread.sleep(3000);
		// click on trumpet
		String b = driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).getAttribute("class");
		driver.findElement(By.xpath("//div[@class='input-trumpet-btn input-action-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='message-input']")).sendKeys("hii");
		Thread.sleep(1000);
		String c = driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).getAttribute("id");
		driver.findElement(By.xpath("//span[@id='sendMessageBtn']")).click();
		Thread.sleep(1000);
		String d = driver.findElement(By.xpath("//span[@class='trumpet-conversation-label-icon']")).getAttribute("class");
		Thread.sleep(1000);
		String e = driver.findElement(By.xpath("//span[@class='received-message-text']")).getText();
		Thread.sleep(1000);
		String a1=driver1.findElement(By.xpath("//div[@class='trumpet-message-box']")).getText();
		String a2=driver1.findElement(By.xpath("//div[@class='quick-response-container']")).getText();
		String a3=driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).getAttribute("class");
		String a4=driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).getAttribute("class");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("(//span[@class='received-message-text'])[3]"));
		Actions ac=new Actions(driver);
		ac.contextClick(e1).build().perform();
		Thread.sleep(1000);
		String a5=driver.findElement(By.xpath("//a[@data-action='delete']")).getAttribute("data-action");
		driver.findElement(By.xpath("//a[@data-action='delete']")).click();
		Thread.sleep(1000);
		String a6=driver.findElement(By.xpath("//span[@id='deleteMessageSendBtn']")).getText();
		driver.findElement(By.xpath("//span[@id='deleteMessageSendBtn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='deleteConfirmationYesBtn']")).click();
		Thread.sleep(1000);
		String a7=driver.findElement(By.xpath("//div[@id='snackbar']")).getText();
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//div[@class='trumpet-message-input']")).sendKeys("test");
		driver1.findElement(By.xpath("//div[@class='trumpet-send-message-btn']")).click();
		Thread.sleep(1000);
		String a8=driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[1]")).getText();
		String a9=driver1.findElement(By.xpath("(//div[@class='conversation-reply-message'])[1]")).getText();
		Thread.sleep(1000);
		ExtentTest test= Extent.createTest("Delete the trumpet msg");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:android@tm.com");
		test.info("Password:123456");
		test.info("Login:Click on Login");
		test.info("Open another chrome2");
		test.info("Navigate to URL");
		test.info("Email : Vinay@tm.com");
		test.info("Password: 123456");
		test.info("Login : Click on login");
		test.info("In 1st chrome : Search: vinay");
		Assert.assertEquals(a, "Vishwa");
		test.pass(a);
		test.info("User:click on vinay");
		test.info("Trumpet:click on Trumpet");
		Assert.assertEquals(b, "input-trumpet-btn input-action-btn");
		test.pass(b);
		test.info("Text msg: hii");
		test.info("Send: Click on send");
		Assert.assertEquals(c, "sendMessageBtn");
		test.pass(c);
		Assert.assertEquals(d, "trumpet-conversation-label-icon");
		test.pass(d);
		Assert.assertEquals(e, "hii");
		test.pass(e);
		test.info("Delete the trumpet msg");
		test.info("View the another chrome2");
		test.info("Send the msg in trumpet");
		test.info("EXPECTED RESULT:: It should display send reply msg to trumpet msg");
		Assert.assertEquals(a1, "hii");
		test.pass(a1);
		Assert.assertEquals(a2, "👍NotedRoger thatThankstest🙂👏 👌hi");
		test.pass(a2);
		Assert.assertEquals(a3, "trumpet-message-input");
		test.pass(a3);
		Assert.assertEquals(a4, "trumpet-send-message-btn");
		test.pass(a4);
		Assert.assertEquals(a5, "delete");
		test.pass(a5);
		Assert.assertEquals(a6, "DEL");
		test.pass(a6);
		Assert.assertEquals(a7, "Message Deleted!");
		test.pass(a7);
		Assert.assertEquals(a8, "You\n"
				+ "You deleted this message\n"
				+ "test\n"
				+ "15:28");
		test.pass(a8);
		Assert.assertEquals(a9, "Android\n"
				+ "hii\n"
				+ "test\n"
				+ "15:28");
		test.pass(a9);
		test.log(Status.PASS,"ACTUAL RESULT:: It is displaying sending reply msg to trumpet msg");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(500);
		driver.close();
		driver1.close();
	}
	@AfterTest
	public void afterTest() {
		Extent.flush();
	}

}
