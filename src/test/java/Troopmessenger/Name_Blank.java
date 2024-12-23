package Troopmessenger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Blank extends ExtentReports{
	WebDriver driver;
	  @BeforeClass
	  public void StartTest() {
		  System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://testing.troopmessenger.com/sign-up");
	  }
	  @Test
	  public void TestCase10() throws InterruptedException {
		  driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha");
		  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("");
		  driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9876054531");
		  driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("abc@bcd.com");
		  driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		  Thread.sleep(1000);
	  }
	  @AfterClass
	  public void EndTest() {
		  driver.close();
	  }
}
