package personal_settings;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class ibuzr {
  WebDriver driver;
  ExtentHtmlReporter htmlreporter;
  ExtentReports Extent;
	
	
	@BeforeSuite
	  public void beforeSuite() {
	htmlreporter = new ExtentHtmlReporter("ibuzr.html");
	Extent = new ExtentReports();
	Extent.attachReporter(htmlreporter);
	}
	
	
	@Test
  public void test0() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
		  
		  driver = new ChromeDriver();
		  driver.get("http://192.168.2.55:8081/login");
		  
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
			Thread.sleep(500);
			driver.manage().window().maximize();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
			Thread.sleep(300);
			
			//click on settings
		
			driver.findElement(By.xpath("//div[@data-type='4']")).click();
			
			Thread.sleep(500);
			
			//click on wallpapers

			driver.findElement(By.xpath("//div[@data-tab='6']")).click();
				
			Thread.sleep(200);
			
		String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
		Assert.assertEquals("iBUZR (QRP)", a);

		
		Thread.sleep(500);	
			
			ExtentTest test= Extent.createTest("Click on ibuzr");
			test.log(Status.INFO, "Chrome Browser Launched Successfully");
			test.info("Navigate to URL");
			test.info("Gmail: Maneesh@tm.com");
			test.info("Password: 123456");
			test.info("Login: Click on login");
			test.info("Personal Settings: Click on personal settings");
			test.info("ibuzr: Click on ibuzr");
			
			test.info("EXPECTED RESULT:: It should display the ibuzr page");
			test.pass(a);
			
			test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the ibuzr page");
			test.pass("Test Case:: TestCase PASSED");
			Thread.sleep(500);
			driver.close();	 	
		
  }
	
	@Test
	  public void test1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			  driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
			
	//disable radio
			
			//driver.findElement(By.xpath("(//span[@class='slider round'])[5]")).click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div[6]/div/div/div/div[2]/div[2]/div/div[1]/div/div[2]/label/span")).click();
			
			Thread.sleep(300);
			driver.navigate().refresh();
			
			Thread.sleep(300);
			
			//click on user
			
			String b = driver.findElement(By.xpath("//div[@data-name='saier']")).getAttribute("data-name");
			Assert.assertEquals("saier", b);
			Thread.sleep(300);
			
			driver.findElement(By.xpath("//div[@data-name='saier']")).click();
			Thread.sleep(300);
			String c = driver.findElement(By.xpath("//div[@class='ibuzr-messages-list-wrapper']")).getText();
			Assert.assertEquals("", c);
			
			Thread.sleep(500);	
				
				ExtentTest test= Extent.createTest("Click on ibuzr & disable the radio button");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Radio button: Disable the radio button");
				test.info("Refresh: Refresh the page");
				test.info("User: Click on Saier");
				
				test.info("EXPECTED RESULT:: It should not display the ibuzr msgs list");
				test.pass(a);
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying the the ibuzr msgs list");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
				driver.close();	 	
			
	  }
	
	
	@Test
	
	  public void test2() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			  driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
		
			//add text in response list
			driver.findElement(By.xpath("//span[@class='canned-message-input']")).sendKeys("Hai");
			Thread.sleep(200);
			
			driver.findElement(By.xpath("//div[@class='add-canned-message-btn']")).click();
			Thread.sleep(300);
			
			driver.navigate().refresh();
			
			Thread.sleep(300);
			
			//click on user
			
			String b = driver.findElement(By.xpath("//div[@data-name='saier']")).getAttribute("data-name");
			Assert.assertEquals("saier", b);
			Thread.sleep(300);
			
			driver.findElement(By.xpath("//div[@data-name='saier']")).click();
			Thread.sleep(300);
			
			String c = driver.findElement(By.xpath("//div[@data-message='Hai']")).getAttribute("data-message");
			Assert.assertEquals("Hai", c);
			
			Thread.sleep(500);	
				
				ExtentTest test= Extent.createTest("Enter text & add canned msg");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Canned response list: Enter data Test");
				test.info("Add: Click on add");
		
				
				test.info("EXPECTED RESULT:: It should display the added canned msg");
				test.pass(a);
				test.pass(b);
				test.pass(c);
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the added canned msg");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
				driver.close();	 	
			
	  }
	
	
	@Test
	
	  public void test3() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			  driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
		
			//Click on smile emoji
			driver.findElement(By.xpath("//div[@class='emoji-input-btn']")).click();
			Thread.sleep(500);
			
	
			
			//click on emoji
			
			driver.findElement(By.xpath("//div[@Class='canned-message-emoji-filter-btn']")).click();
			
			Thread.sleep(300);
			
			
			String b = driver.findElement(By.xpath("//span[@title=':sleepy:']")).getAttribute("title");
			Assert.assertEquals(":sleepy:", b);
			
			Thread.sleep(500);	
				
				ExtentTest test= Extent.createTest("Click on emoji");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Emoji: Click on emoji");
				test.info("People: Click on people category");
		
				
				test.info("EXPECTED RESULT:: It should display the people category emojis");
				test.pass(a);
				test.pass(b);
				
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the people category emojis");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
				driver.close();	 	
			
	  }
	
	@Test
	
	  public void test4() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			  driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
		
			//Click on smile emoji
			driver.findElement(By.xpath("//div[@class='emoji-input-btn']")).click();
			Thread.sleep(500);
			
	
			
			//click on search
			
			driver.findElement(By.xpath("//input[@id='cannedMessageEmojiSearchWrapper']")).sendKeys("bus");
			
			Thread.sleep(300);
			
			
			String b = driver.findElement(By.xpath("//span[@title=':oncoming_bus:']")).getAttribute("title");
			Assert.assertEquals(":oncoming_bus:", b);
			Thread.sleep(200);	
			
			String c = driver.findElement(By.xpath("//span[@title=':oncoming_taxi:']")).getAttribute("title");
			Assert.assertEquals(":oncoming_taxi:", c);
			Thread.sleep(500);	
				
				ExtentTest test= Extent.createTest("Click on search enter valid data");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Emoji: Click on emoji");
				test.info("Search: Bus");
		
				
				test.info("EXPECTED RESULT:: It should display the bus emojis");
				test.pass(a);
				test.pass(b);
				test.pass(c);
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the bus emojis");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
			driver.close();	 	
			
	  }

	
	@Test
	
	  public void test5() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			  driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
		
			//Click on smile emoji
			driver.findElement(By.xpath("//div[@class='emoji-input-btn']")).click();
			Thread.sleep(500);
			
	
			
			//click on search
			
			driver.findElement(By.xpath("//input[@id='cannedMessageEmojiSearchWrapper']")).sendKeys("Choc");
			
			Thread.sleep(300);
			
			
			String b = driver.findElement(By.xpath("//span[@title=':chocolate_bar:']")).getAttribute("title");
			Assert.assertEquals(":chocolate_bar:", b);
			Thread.sleep(200);	
			
			String c = driver.findElement(By.xpath("//span[@data-category='food']")).getAttribute("data-category");
			Assert.assertEquals("food", c);
			Thread.sleep(800);	
			//	click on choclate
			
			driver.findElement(By.xpath("//span[@class='emojione emojione-32-food _1f36b row-visible']")).click();
			Thread.sleep(300);	
			
			//click on add
			driver.findElement(By.xpath("//div[@class='add-canned-message-btn']")).click();
			Thread.sleep(300);
			
			
				ExtentTest test= Extent.createTest("Click on search & click on emoji & click on add");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Emoji: Click on emoji");
				test.info("Search: choclate");
				test.info("Choclate: Click on choclate");
				test.info("Add: Click on add");
				test.info("Refresh: Refresh the page");
				test.info("User: Click on saier");
		
				
				test.info("EXPECTED RESULT:: It should display the Choclate bar emoji");
				test.pass(a);
				test.pass(b);
				test.pass(c);
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is displaying the choclate bar emoji");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
			driver.close();	 	
			
	  }
	
	@Test
	
	  public void test6() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			  driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
		
			//Click on smile emoji
			driver.findElement(By.xpath("//div[@class='emoji-input-btn']")).click();
			Thread.sleep(500);
			
	
			
			//click on search with invalid data
			
			driver.findElement(By.xpath("//input[@id='cannedMessageEmojiSearchWrapper']")).sendKeys("Abcd");
			
			Thread.sleep(300);
			
			
			String b = driver.findElement(By.xpath("//div[@class='no-results-found']")).getAttribute("class");
			Assert.assertEquals("no-results-found", b);
			Thread.sleep(200);	
		
				ExtentTest test= Extent.createTest("Search with invalid data");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Emoji: Click on emoji");
				test.info("Search: Abcd");
				
		
				test.info("EXPECTED RESULT:: It should display No results found");
				test.pass(a);
				test.pass(b);
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is displaying No results found");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
			driver.close();	 	
			
	  }
	
	
	@Test
	
	  public void test7() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "/home/lavanya/Downloads/chromedriver_linux64/chromedriver");
			  
			 driver = new ChromeDriver();
			  driver.get("http://192.168.2.55:8081/login");
			  
			  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("maneesh@tm.com");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
				Thread.sleep(500);
				driver.manage().window().maximize();
				Thread.sleep(500);
				driver.findElement(By.xpath("//div[@class='submit-wrap']")).click();
				Thread.sleep(300);
				
				//click on settings
			
				driver.findElement(By.xpath("//div[@data-type='4']")).click();
				
				Thread.sleep(500);
				
				//click on ibuzr

				driver.findElement(By.xpath("//div[@data-tab='6']")).click();
					
				Thread.sleep(200);
				
			String a = driver.findElement(By.xpath("//div[@class='messenger-settings-tab active']")).getText();
			Assert.assertEquals("iBUZR (QRP)", a);
			Thread.sleep(500);
		
			//Click on smile emoji
			driver.findElement(By.xpath("//div[@class='emoji-input-btn']")).click();
			Thread.sleep(500);
			
	
			
			//click on search
			
			driver.findElement(By.xpath("//input[@id='cannedMessageEmojiSearchWrapper']")).sendKeys("Choc");
			
			Thread.sleep(300);
			
			
			String b = driver.findElement(By.xpath("//span[@title=':chocolate_bar:']")).getAttribute("title");
			Assert.assertEquals(":chocolate_bar:", b);
			Thread.sleep(200);	
			
			String c = driver.findElement(By.xpath("//span[@data-category='food']")).getAttribute("data-category");
			Assert.assertEquals("food", c);
			Thread.sleep(800);	
			//	click on choclate
			
			driver.findElement(By.xpath("//span[@class='emojione emojione-32-food _1f36b row-visible']")).click();
			Thread.sleep(300);	
			
			//click on add
			//driver.findElement(By.xpath("//div[@class='add-canned-message-btn']")).click();
			//Thread.sleep(300);
			
			//click on close
			
			String d = driver.findElement(By.xpath("(//span[@class='remove-canned-message'])[5]")).getAttribute("class");
			Assert.assertEquals("remove-canned-message", d);
			
			
			
			driver.findElement(By.xpath("(//span[@class='remove-canned-message'])[5]")).click();
			
			
			Thread.sleep(300);
			
				ExtentTest test= Extent.createTest("Click on add & Click on cross symbol");
				test.log(Status.INFO, "Chrome Browser Launched Successfully");
				test.info("Navigate to URL");
				test.info("Gmail: Maneesh@tm.com");
				test.info("Password: 123456");
				test.info("Login: Click on login");
				test.info("Personal Settings: Click on personal settings");
				test.info("ibuzr: Click on ibuzr");
				test.info("Emoji: Click on emoji");
				test.info("Search: choclate");
				test.info("Choclate: Click on choclate");
				test.info("Add: Click on add");
				test.info("Cross symbol: Click on cross symbol");
				
				
				test.info("EXPECTED RESULT:: It should not display the Choclate bar emoji");
				test.pass(a);
				test.pass(b);
				test.pass(c);
				test.pass(d);
				
				
				test.log(Status.PASS,"ACTUAL RESULT:: It is not displaying the choclate bar emoji");
				test.pass("Test Case:: TestCase PASSED");
				Thread.sleep(500);
			driver.close();		
			
	  }
	
	
  @AfterSuite
  public void afterSuite() {

  Extent.flush();
  }

}
