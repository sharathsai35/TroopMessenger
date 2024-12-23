package Troopmessenger;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class EmailWithUpperCase extends ExtentReports{
	WebDriver driver;
	@BeforeTest
	public void StartTest() {
		  System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://testing.troopmessenger.com/sign-up");
	  }
	  @Test
	  public void TestCase14() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		  driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876543100");
		  driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("SHARATH35@GMAIL.COM");
		  driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
	  }
	  @AfterTest
	  public void EndTest() {
		 driver.close();
	  }
}
