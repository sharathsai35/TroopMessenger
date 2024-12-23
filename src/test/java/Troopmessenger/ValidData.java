package Troopmessenger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidData extends ExtentReports {
	WebDriver driver;
	  @BeforeClass
	  public void StartTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://testing.troopmessenger.com/sign-up");
	  }
	  @Test
	  public void Testcase1() throws InterruptedException {
	      driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha technologies");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		  driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9877663460");
		  driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.37@gmail.com");
		  driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
	  }
	 /* @Test
	  public void tvisha_sharath_9876543210_sharath4() throws InterruptedException, IOException {
		  
		  driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai@123");
		  driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		  driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2");
		  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("3");
		  //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("4");
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		  driver.findElement(By.xpath("//input[@data-step='2']")).click();
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(src,new File("/home/tvisha/Pictures/troopmessenger.png"));
		  
	  }*/	
		@AfterClass
		public void endTest() {
			driver.close();
		}
	
}
