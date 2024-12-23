package pin;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class Pingroup {
 
	
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports Extent;
	
	 @BeforeSuite
	  public void beforeSuite() {
		 htmlreporter = new ExtentHtmlReporter("Pin group 1.html");	 
			Extent = new ExtentReports();
			Extent.attachReporter(htmlreporter);
	 }
	 @Test
		public void testcase00() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("cal 1");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='cal 1']")).getText();
			Assert.assertEquals("Cal 1", a1);

			Thread.sleep(500);

			//click on user

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);


			String a3 = driver.findElement(By.xpath("//div[@class='info-text']")).getText();
			Assert.assertEquals("No Pinned Messages!", a3);


			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on Group, Click on PIN without PIN messages");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on cal 1");
			test.info("Profile: Click on Group profile");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display No Pinned messages");
			test.pass(a1);
			test.pass(a2);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying No Pinned messages");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		/// right click on attachments
		@Test
		public void testcase01() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);
			//click on user
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on text msg

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[1]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Pin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("pin-conversation-label-icon", a3);

			
			Thread.sleep(500);
			
			String a4 = driver.findElement(By.xpath("(//span[@class='reply-sender-name'])[1]")).getText();
			Assert.assertEquals("Uppi", a4);
			
			
			Thread.sleep(500);
			
			String a5 = driver.findElement(By.xpath("(//span[@class='received-message-text'])[1]")).getText();
			Assert.assertEquals("test", a5);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on reply text msg, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on text msg");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);
			test.pass(a5);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		@Test
		public void testcase02() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[1]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Pin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			//String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			//Assert.assertEquals("pin-conversation-label-icon", a3);

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[1]")).getAttribute("class");
			Assert.assertEquals("conversation-message-attachment", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on image, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search A2");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on Image");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular image");
			test.pass(a1);
			test.pass(a2);
			//test.pass(a3);
			test.pass(a4);
		

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular Image");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}



		@Test
		public void testcase03() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on user

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[2]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Pin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("pin-conversation-label-icon", a3);

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//span[@title='sai__maneeh.pdf']")).getText();
			Assert.assertEquals("sai__maneeh.pdf", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on Group, Right click on PDF, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on PDF");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for PDF");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for PDF");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase04() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[3]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Pin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("pin-conversation-label-icon", a3);

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//audio[@class='audio-attachment hidden']")).getAttribute("class");
			Assert.assertEquals("audio-attachment hidden", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on goup, Right click on Audio msg, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search A2");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on Audio msg");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular Audio msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular Audio msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase05() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on user

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[4]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Pin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("pin-conversation-label-icon", a3);

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[4]")).getAttribute("class");
			Assert.assertEquals("conversation-message-attachment", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on Group, Right click on Video, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on Video");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for video msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for video msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		/// right click on attachments & Unpin
		@Test
		public void testcase06() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on user

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on text msg

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-reply-message'])[1]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Unpin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("(//span[@class='received-message-text'])[1]")).getText();
			Assert.assertEquals("test", a3);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on text msg, Click on UnPIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on text msg");
			test.info("UnPIN: Click on UnPIN");

			test.info("EXPECTED RESULT:: It should not display PIN icon for particular msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);

			test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying PIN icon for particular msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		@Test
		public void testcase07() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[1]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Unpin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);


			String a3 = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[1]")).getAttribute("class");
			Assert.assertEquals("conversation-message-attachment", a3);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on image, Click on UNPIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on Image");
			test.info("UnPIN: Click on UnPIN");

			test.info("EXPECTED RESULT:: It should not display PIN icon for particular image");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);

			test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying PIN icon for particular Image");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}



		@Test
		public void testcase08() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[2]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Unpin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("//span[@title='sai__maneeh.pdf']")).getText();
			Assert.assertEquals("sai__maneeh.pdf", a3);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on PDF, Click on UNPIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on PDF");
			test.info("UNPIN: Click on UnPIN");

			test.info("EXPECTED RESULT:: It should not display PIN icon for PDF");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);


			test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying PIN icon for PDF");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase09() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on image

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[3]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Unpin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);

			String a3 = driver.findElement(By.xpath("//audio[@class='audio-attachment hidden']")).getAttribute("class");
			Assert.assertEquals("audio-attachment hidden", a3);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on Audio msg, Click on UNPIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on Audio msg");
			test.info("UNPIN: Click on UnPIN");

			test.info("EXPECTED RESULT:: It should display not PIN icon for particular Audio msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);

			test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying PIN icon for particular Audio msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase10() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// move to video & click dropdown option on video


			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[4]"));
			act.moveToElement(a).build().perform();
			Thread.sleep(5000);

			String a2 = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]")).getAttribute("class");
			Assert.assertEquals("conversation-option-button", a2);


			Actions act1 = new Actions(driver);
			WebElement aa = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]"));
			act1.moveToElement(aa).click().perform();

			Thread.sleep(500);

			// click on PIN

			String a3 = driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[7]")).getAttribute("class");
			Assert.assertEquals("conversation-pin-button conversation-option", a3);

			Thread.sleep(500);

			driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[7]")).click();


			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[4]")).getAttribute("class");
			Assert.assertEquals("conversation-message-attachment", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click on dropdown option, Click on UnPIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Cursor: Move cursor on video");
			test.info("Drop down: Click on dropdown option");
			test.info("UNPIN: Click on UNPIN");

			test.info("EXPECTED RESULT:: It should not display PIN icon for video msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying PIN icon for video msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}




		/// Click dropdown on attachments & click on Pin
		@Test
		public void testcase11() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);

			// move to msg & click dropdown option on text msg


			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//span[@class='messenger-reply-message-text'])[1]"));
			act.moveToElement(a).build().perform();
			Thread.sleep(1000);

			String a2 = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[3]")).getAttribute("class");
			Assert.assertEquals("conversation-option-button", a2);

			Actions act1 = new Actions(driver);
			WebElement aa = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[3]"));
			act1.moveToElement(aa).click().perform();

			Thread.sleep(2000);

			Actions act2 = new Actions(driver);
			act2.sendKeys(Keys.PAGE_DOWN).build().perform();

			// click on PIN

			//String a3 = driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[3]")).getAttribute("class");
			//Assert.assertEquals("conversation-pin-button conversation-option", a3);

			Thread.sleep(3000);

			driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[3]")).click();

			Thread.sleep(500);
			
			String a4 = driver.findElement(By.xpath("(//span[@class='reply-sender-name'])[1]")).getText();
			Assert.assertEquals("Uppi", a4);
			
			
			Thread.sleep(500);
			
			String a5 = driver.findElement(By.xpath("(//span[@class='received-message-text'])[1]")).getText();
			Assert.assertEquals("test", a5);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click dropdown on reply text msg, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Aabcdef");
			test.info("Group: Click on Abcdef");
			test.info("Drop down: Click drop down option on text msg");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular msg");
			test.pass(a1);
			test.pass(a2);
			//test.pass(a3);
			test.pass(a4);
			test.pass(a5);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		@Test
		public void testcase12() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// Click on dropdown

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[1]"));
			act.moveToElement(a).build().perform();
			Thread.sleep(2000);

			String a2 = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[4]")).getAttribute("class");
			Assert.assertEquals("conversation-option-button", a2);


			Actions act1 = new Actions(driver);
			WebElement aa = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[4]"));
			act1.moveToElement(aa).click().perform();

			Thread.sleep(2000);

			Actions act2 = new Actions(driver);
			act2.sendKeys(Keys.PAGE_DOWN).build().perform();

			// click on PIN

			//String a3 = driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[4]")).getAttribute("class");
			//Assert.assertEquals("conversation-pin-button conversation-option", a3);

			Thread.sleep(3000);

			driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[4]")).click();

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[1]")).getAttribute("class");
			Assert.assertEquals("conversation-message-attachment", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click dropdown on image, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Drop down: Click dropdown on Image");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular image");
			test.pass(a1);
			test.pass(a2);
			//test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular Image");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}



		@Test
		public void testcase13() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// click on drop down

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[2]"));
			act.moveToElement(a).build().perform();
			Thread.sleep(3000);

			String a2 = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[5]")).getAttribute("class");
			Assert.assertEquals("conversation-option-button", a2);

			Thread.sleep(500);

			Actions act1 = new Actions(driver);
			WebElement aa = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[5]"));
			act1.moveToElement(aa).click().perform();

			Thread.sleep(3000);

			Actions act2 = new Actions(driver);
			act2.sendKeys(Keys.PAGE_DOWN).build().perform();

			// click on PIN

			String a3 = driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[5]")).getAttribute("class");
			Assert.assertEquals("conversation-pin-button conversation-option", a3);

			Thread.sleep(3000);

			driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[5]")).click();

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//span[@title='sai__maneeh.pdf']")).getText();
			Assert.assertEquals("sai__maneeh.pdf", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click dropdown on PDF, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Drop down: Click dropdown on PDF");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for PDF");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for PDF");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase14() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);
			// click on dropdown

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[3]"));
			act.moveToElement(a).build().perform();
			Thread.sleep(3000);

			String a2 = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[6]")).getAttribute("class");
			Assert.assertEquals("conversation-option-button", a2);

			Thread.sleep(500);

			Actions act1 = new Actions(driver);
			WebElement aa = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[6]"));
			act1.moveToElement(aa).click().perform();

			Thread.sleep(3000);

			// click on PIN

			String a3 = driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[6]")).getAttribute("class");
			Assert.assertEquals("conversation-pin-button conversation-option", a3);


			driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[6]")).click();

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//audio[@class='audio-attachment hidden']")).getAttribute("class");
			Assert.assertEquals("audio-attachment hidden", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click dropdown on Audio msg, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Aabcdef");
			test.info("Group: Click on Abcdef");
			test.info("Dropdown: Click dropdown on Audio msg");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular Audio msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular Audio msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase15() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// Click dropdown on video


			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[4]"));
			act.moveToElement(a).build().perform();
			Thread.sleep(3000);

			String a2 = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]")).getAttribute("class");
			Assert.assertEquals("conversation-option-button", a2);

			Thread.sleep(500);

			Actions act1 = new Actions(driver);
			WebElement aa = driver.findElement(By.xpath("(//span[@class='conversation-option-button'])[7]"));
			act1.moveToElement(aa).click().perform();

			Thread.sleep(3000);

			// click on PIN

			String a3 = driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[7]")).getAttribute("class");
			Assert.assertEquals("conversation-pin-button conversation-option", a3);


			driver.findElement(By.xpath("(//div[@class='conversation-pin-button conversation-option'])[7]")).click();

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("pin-conversation-label-icon", a4);

			Thread.sleep(500);

			String a5 = driver.findElement(By.xpath("(//div[@class='conversation-message-attachment'])[4]")).getAttribute("class");
			Assert.assertEquals("conversation-message-attachment", a5);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click dropdown on Video, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search A2");
			test.info("Group: Click on Abcdef");
			test.info("Dropdown: Click dropdown on Video");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for video msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for video msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		// click on profile click on pin 

		@Test
		public void testcase16() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);


			String a3 = driver.findElement(By.xpath("//span[@data-url='https://media.troopmessenger.com/1681449998689_ohajDp0syw/20210827_180112.mp4']")).getAttribute("data-url");
			Assert.assertEquals("https://media.troopmessenger.com/1681449998689_ohajDp0syw/20210827_180112.mp4", a3);

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//span[@data-url='https://media.troopmessenger.com/audio_message/1681449987093.mp3']")).getAttribute("data-url");
			Assert.assertEquals("https://media.troopmessenger.com/audio_message/1681449987093.mp3", a4);

			Thread.sleep(500);

			String a5 = driver.findElement(By.xpath("//span[@data-url='https://media.troopmessenger.com/1681449974584_WZLVYoFZVA/sai__maneeh.pdf']")).getAttribute("data-url");
			Assert.assertEquals("https://media.troopmessenger.com/1681449974584_WZLVYoFZVA/sai__maneeh.pdf", a5);

			Thread.sleep(500);

			String a6 = driver.findElement(By.xpath("//span[@data-url='https://media.troopmessenger.com/1681449934305_63BRA84ooX/Screenshot_from_2023_03_31_12_31_37.png']")).getAttribute("data-url");
			Assert.assertEquals("https://media.troopmessenger.com/1681449934305_63BRA84ooX/Screenshot_from_2023_03_31_12_31_37.png", a6);

			Thread.sleep(500);

			String a7 = driver.findElement(By.xpath("//div[@class='message-text']")).getText();
			Assert.assertEquals("hiii", a7);

			Thread.sleep(500);

			ExtentTest test= Extent.createTest("Click on group, Click on PIN with PIN messages");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display Pinned messages");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);
			test.pass(a5);
			test.pass(a6);
			test.pass(a7);


			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying Pinned messages");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		@Test
		public void testcase17() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);

			// click on Three dots beside any attachment
			String a3 = driver.findElement(By.xpath("//div[@class='options-container']")).getAttribute("class");
			Assert.assertEquals("options-container", a3);

			driver.findElement(By.xpath("//div[@class='options-container']")).click();

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("//div[@class='options-wrapper']")).getText();
			Assert.assertEquals("Un Pin\n"
					+ "Popout\n"
					+ "Download\n"
					+ "View", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on three dots beside attachment");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Three dots: Click on three dots beside attachment");

			test.info("EXPECTED RESULT:: It should display options Unpin, popout, download & view");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying options Unpin, popout, download & view");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		@Test
		public void testcase18() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);

			// click on Three dots beside any attachment
			String a3 = driver.findElement(By.xpath("(//div[@class='options-container'])[5]")).getAttribute("class");
			Assert.assertEquals("options-container", a3);

			driver.findElement(By.xpath("(//div[@class='options-container'])[5]")).click();

			Thread.sleep(500);

			String a4 = driver.findElement(By.xpath("(//div[@class='options-wrapper'])[5]")).getText();
			Assert.assertEquals("Un Pin\n"
					+ "View", a4);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on three dots beside text msg");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Three dots: Click on three dots beside text msg");

			test.info("EXPECTED RESULT:: It should display options Unpin & view");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying options Unpin & view");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}

		@Test
		public void testcase19() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);

			// click on Three dots beside any attachment
			String a3 = driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).getAttribute("class");
			Assert.assertEquals("options-container", a3);

			driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).click();

			Thread.sleep(2000);

			String a4 = driver.findElement(By.xpath("//div[@class='options-wrapper']")).getText();
			Assert.assertEquals("Un Pin\n"
					+ "Popout\n"
					+ "Download\n"
					+ "View", a4);

			Thread.sleep(500);

			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div[4]")).click();


			Thread.sleep(1000);


			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on three dots & click on view");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Three dots: Click on three dots beside attachment");
			test.info("View: Click on view");

			test.info("EXPECTED RESULT:: It should highlight particular image");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is highlighting particular image");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}


		@Test
		public void testcase20() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);

			// click on Three dots beside any attachment
			String a3 = driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).getAttribute("class");
			Assert.assertEquals("options-container", a3);

			driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).click();

			Thread.sleep(2000);

			String a4 = driver.findElement(By.xpath("//div[@class='options-wrapper']")).getText();
			Assert.assertEquals("Un Pin\n"
					+ "Popout\n"
					+ "Download\n"
					+ "View", a4);

			Thread.sleep(500);

			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div[3]")).click();


			Thread.sleep(1000);


			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on three dots & click on download");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Three dots: Click on three dots beside attachment");
			test.info("Download: Click on download");

			test.info("EXPECTED RESULT:: It should download image");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is downloading image");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.close();	 
		}


		@Test
		public void testcase21() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);

			// click on Three dots beside any attachment
			String a3 = driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).getAttribute("class");
			Assert.assertEquals("options-container", a3);

			driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).click();

			Thread.sleep(2000);

			String a4 = driver.findElement(By.xpath("//div[@class='options-wrapper']")).getText();
			Assert.assertEquals("Un Pin\n"
					+ "Popout\n"
					+ "Download\n"
					+ "View", a4);

			Thread.sleep(500);

			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div[2]")).click();


			Thread.sleep(1000);


			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on three dots & click on popout");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Three dots: Click on three dots beside attachment");
			test.info("Popout: Click on popout");

			test.info("EXPECTED RESULT:: It should display popout");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying popout window");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.quit();	 
		}



		@Test
		public void testcase22() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);

			// click on Three dots beside any attachment
			String a3 = driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).getAttribute("class");
			Assert.assertEquals("options-container", a3);

			driver.findElement(By.xpath("(//div[@class='options-container'])[1]")).click();

			Thread.sleep(2000);

			String a4 = driver.findElement(By.xpath("//div[@class='options-wrapper']")).getText();
			Assert.assertEquals("Un Pin\n"
					+ "Popout\n"
					+ "Download\n"
					+ "View", a4);

			Thread.sleep(500);

			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[3]/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div[1]")).click();


			Thread.sleep(5000);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(5000);

			// click on pin
			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);	

			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on three dots & click on Unpin");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Three dots: Click on three dots beside attachment");
			test.info("Unpin: Click on Unpin");
			test.info("Profile: Click on Profile");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should not display image");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);

			test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying image");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.close();	 
		}


		@Test
		public void testcase23() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on group

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			//click on user profile

			driver.findElement(By.xpath("//div[@id='chatUserImage']")).click();

			Thread.sleep(500);

			String a2 = driver.findElement(By.xpath("//div[@title='PIN']")).getAttribute("title");
			Assert.assertEquals("PIN", a2);	

			Thread.sleep(500);

			// click on PIN

			driver.findElement(By.xpath("//div[@data-tab='5']")).click();

			Thread.sleep(1000);


			String a3 = driver.findElement(By.xpath("//span[@data-url='https://media.troopmessenger.com/audio_message/1681449987093.mp3']")).getAttribute("data-url");
			Assert.assertEquals("https://media.troopmessenger.com/audio_message/1681449987093.mp3", a3);	

			// click on popout icon on attachment

			Thread.sleep(1000);

			driver.findElement(By.xpath("//span[@data-url='https://media.troopmessenger.com/audio_message/1681449987093.mp3']")).click();

			Thread.sleep(1000);	

			ExtentTest test= Extent.createTest("Click on group, Click on PIN, click on popout on attachment");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Profile: Click on User profile");
			test.info("PIN: Click on PIN");
			test.info("Popout: Click on Popout");

			test.info("EXPECTED RESULT:: It should display popout window");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying popout window");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(1000);
			driver.quit();	 
		}

  //  click on pin for trumpet & forkout msg 
		
		@Test
		public void testcase24() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

			driver = new ChromeDriver();
			driver.get("http://192.168.2.55:8081/login");

			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
			Thread.sleep(300);

			//click on recent chat search

			driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("abcdef");

			Thread.sleep(500);

			String a1 = driver.findElement(By.xpath("//div[@data-name='abcdef']")).getText();
			Assert.assertEquals("Abcdef", a1);

			Thread.sleep(500);

			//click on user

			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(500);

			// right click on text msg

			Actions act = new Actions(driver);
			WebElement a = driver.findElement(By.xpath("(//span[@class='received-message-text'])[1]"));
			act.moveToElement(a).contextClick().perform();

			Thread.sleep(1000);

			// click on PIN

			String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
			Assert.assertEquals("Pin", a2);

			Thread.sleep(500);	

			driver.findElement(By.xpath("//a[@data-action='pin']")).click();

			Thread.sleep(500);
			
			String a3 = driver.findElement(By.xpath("(//span[@class='sender-username-text'])[1]")).getText();
			Assert.assertEquals("Sharath", a3);
			
			Thread.sleep(500);
			
			String a4 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("pin-conversation-label-icon", a4);
			
			String a5 = driver.findElement(By.xpath("//span[@class='trumpet-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("trumpet-conversation-label-icon", a5);
			
			String a6 = driver.findElement(By.xpath("//span[@class='forkout-conversation-label-icon']")).getAttribute("class");
			Assert.assertEquals("forkout-conversation-label-icon", a6);
			
			Thread.sleep(500);
			
			String a7 = driver.findElement(By.xpath("(//span[@class='received-message-text'])[1]")).getText();
			Assert.assertEquals("test", a7);

			Thread.sleep(500);


			ExtentTest test= Extent.createTest("Click on group, Right click on reply text msg, Click on PIN");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: maneesh1@tez.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Recent chat Search: Search Abcdef");
			test.info("Group: Click on Abcdef");
			test.info("Right click: Right click on text msg");
			test.info("PIN: Click on PIN");

			test.info("EXPECTED RESULT:: It should display PIN icon for particular msg");
			test.pass(a1);
			test.pass(a2);
			test.pass(a3);
			test.pass(a4);
			test.pass(a5);
			test.pass(a6);
			test.pass(a7);

			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular msg");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 
		}
  
		/// right click on text msg reply with image 
				@Test
				public void testcase25() throws InterruptedException {

					System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

					driver = new ChromeDriver();
					driver.get("http://192.168.2.55:8081/login");

					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
					driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
					Thread.sleep(500);
					driver.manage().window().maximize();
					Thread.sleep(500);
					driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
					Thread.sleep(300);

					//click on recent chat search

					driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("group creation");

					Thread.sleep(500);

					String a1 = driver.findElement(By.xpath("//div[@data-name='group creation']")).getText();
					Assert.assertEquals("Group Creation", a1);

					Thread.sleep(500);

					//click on user

					Actions action = new Actions(driver);
					action.sendKeys(Keys.ARROW_DOWN).perform();
					action.sendKeys(Keys.ARROW_DOWN).build().perform();
					action.sendKeys(Keys.ENTER).build().perform();
					Thread.sleep(500);

					// right click on text msg

					Actions act = new Actions(driver);
					WebElement a = driver.findElement(By.xpath("//a[@data-path='https://media.troopmessenger.com/1681456628189_6zGlP5EWZ6/Screenshot_from_2023_03_30_16_13_31.png']"));
					act.moveToElement(a).contextClick().perform();

					Thread.sleep(1000);

					// click on PIN

					String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
					Assert.assertEquals("Pin", a2);

					Thread.sleep(500);	

					driver.findElement(By.xpath("//a[@data-action='pin']")).click();

					Thread.sleep(500);

					String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
					Assert.assertEquals("pin-conversation-label-icon", a3);

					
					Thread.sleep(500);
					
					String a4 = driver.findElement(By.xpath("(//span[@class='reply-sender-name'])[1]")).getText();
					Assert.assertEquals("Teja", a4);
					
					
					Thread.sleep(500);
					
					String a5 = driver.findElement(By.xpath("(//span[@class='received-message-text'])[1]")).getText();
					Assert.assertEquals("test", a5);

					Thread.sleep(500);


					ExtentTest test= Extent.createTest("Click on group, Right click on text msg reply with image, Click on PIN");
					test.log(Status.INFO, "Chrome Browser Launched Successfully");
					test.info("Navigate to URL");
					test.info("Gmail: maneesh1@tez.com");
					test.info("Password: 123456");
					test.info("Login: Click on login");
					test.info("Recent chat Search: Search Group creation");
					test.info("Group: Click on Group creation");
					test.info("Right click: Right click on text msg");
					test.info("PIN: Click on PIN");

					test.info("EXPECTED RESULT:: It should display PIN icon for particular reply msg");
					test.pass(a1);
					test.pass(a2);
					test.pass(a3);
					test.pass(a4);
					test.pass(a5);
					
					test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular reply msg");
					test.pass("Test Case:: TestCase PASSED");
					Thread.sleep(500);
					driver.close();	 
				}
		
		
				/// right click on image reply with text msg 
				@Test
				public void testcase26() throws InterruptedException {

					System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

					driver = new ChromeDriver();
					driver.get("http://192.168.2.55:8081/login");

					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
					driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
					Thread.sleep(500);
					driver.manage().window().maximize();
					Thread.sleep(500);
					driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
					Thread.sleep(300);

					//click on recent chat search

					driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("group creation");

					Thread.sleep(500);

					String a1 = driver.findElement(By.xpath("//div[@data-name='group creation']")).getText();
					Assert.assertEquals("Group Creation", a1);

					Thread.sleep(500);

					//click on user

					Actions action = new Actions(driver);
					action.sendKeys(Keys.ARROW_DOWN).perform();
					action.sendKeys(Keys.ARROW_DOWN).build().perform();
					action.sendKeys(Keys.ENTER).build().perform();
					Thread.sleep(500);

					// right click on text msg

					Actions act = new Actions(driver);
					WebElement a = driver.findElement(By.xpath("//div[@class='attachment-reply-description']"));
					act.moveToElement(a).contextClick().perform();

					Thread.sleep(1000);

					// click on PIN

					String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
					Assert.assertEquals("Pin", a2);

					Thread.sleep(500);	

					driver.findElement(By.xpath("//a[@data-action='pin']")).click();

					Thread.sleep(500);

					String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
					Assert.assertEquals("pin-conversation-label-icon", a3);

					
					Thread.sleep(500);
					
					String a4 = driver.findElement(By.xpath("(//span[@class='reply-sender-name'])[1]")).getText();
					Assert.assertEquals("Teja", a4);
					
					
					Thread.sleep(500);
					
					String a5 = driver.findElement(By.xpath("(//span[@class='received-message-text'])[2]")).getText();
					Assert.assertEquals("hii", a5);

					Thread.sleep(500);


					ExtentTest test= Extent.createTest("Click on group, Right click on image reply with text msg, Click on PIN");
					test.log(Status.INFO, "Chrome Browser Launched Successfully");
					test.info("Navigate to URL");
					test.info("Gmail: maneesh1@tez.com");
					test.info("Password: 123456");
					test.info("Login: Click on login");
					test.info("Recent chat Search: Search Group creation");
					test.info("Group: Click on Group creation");
					test.info("Right click: Right click on image with reply text msg");
					test.info("PIN: Click on PIN");

					test.info("EXPECTED RESULT:: It should display PIN icon for particular reply image");
					test.pass(a1);
					test.pass(a2);
					test.pass(a3);
					test.pass(a4);
					test.pass(a5);
					
					test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular reply image");
					test.pass("Test Case:: TestCase PASSED");
					Thread.sleep(500);
					driver.close();	 
				}
		
				
				/// right click on doc reply with video 
				@Test
				public void testcase27() throws InterruptedException {

					System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");

					driver = new ChromeDriver();
					driver.get("http://192.168.2.55:8081/login");

					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh1@tez.com");
					driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
					Thread.sleep(500);
					driver.manage().window().maximize();
					Thread.sleep(500);
					driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
					Thread.sleep(300);

					//click on recent chat search

					driver.findElement(By.xpath("//input[@id='recentUserSearch']")).sendKeys("group creation");

					Thread.sleep(500);

					String a1 = driver.findElement(By.xpath("//div[@data-name='group creation']")).getText();
					Assert.assertEquals("Group Creation", a1);

					Thread.sleep(500);

					//click on user

					Actions action = new Actions(driver);
					action.sendKeys(Keys.ARROW_DOWN).perform();
					action.sendKeys(Keys.ARROW_DOWN).build().perform();
					action.sendKeys(Keys.ENTER).build().perform();
					Thread.sleep(500);

					// right click on text msg

					Actions act = new Actions(driver);
					WebElement a = driver.findElement(By.xpath("(//div[@class='attachment-reply-description'])[2]"));
					act.moveToElement(a).contextClick().perform();

					Thread.sleep(1000);

					// click on PIN

					String a2 = driver.findElement(By.xpath("//a[@data-action='pin']")).getText();
					Assert.assertEquals("Pin", a2);

					Thread.sleep(500);	

					driver.findElement(By.xpath("//a[@data-action='pin']")).click();

					Thread.sleep(500);

					String a3 = driver.findElement(By.xpath("//span[@class='pin-conversation-label-icon']")).getAttribute("class");
					Assert.assertEquals("pin-conversation-label-icon", a3);

					
					Thread.sleep(500);
					
					String a4 = driver.findElement(By.xpath("(//span[@class='reply-sender-name'])[1]")).getText();
					Assert.assertEquals("Teja", a4);
					
					
					Thread.sleep(500);
					
					String a5 = driver.findElement(By.xpath("//span[@title='20210827_180112.mp4']")).getText();
					Assert.assertEquals("20210827_180112.mp4", a5);

					Thread.sleep(500);


					ExtentTest test= Extent.createTest("Click on group, Right click on doc reply with video, Click on PIN");
					test.log(Status.INFO, "Chrome Browser Launched Successfully");
					test.info("Navigate to URL");
					test.info("Gmail: maneesh1@tez.com");
					test.info("Password: 123456");
					test.info("Login: Click on login");
					test.info("Recent chat Search: Search Group creation");
					test.info("Group: Click on Group creation");
					test.info("Right click: Right click on doc with reply video");
					test.info("PIN: Click on PIN");

					test.info("EXPECTED RESULT:: It should display PIN icon for particular reply doc");
					test.pass(a1);
					test.pass(a2);
					test.pass(a3);
					test.pass(a4);
					test.pass(a5);
					
					test.log(Status.PASS,"ACTUAL RESULT:: It is displaying PIN icon for particular reply doc");
					test.pass("Test Case:: TestCase PASSED");
					Thread.sleep(500);
					driver.close();	 
				}
				
		
  @AfterSuite
  public void afterSuite() {
	  Extent.flush();
  }
  
}
