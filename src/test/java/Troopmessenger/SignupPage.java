package Troopmessenger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

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
	public void tvisha_sharath_9876543210_sharath4() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("tvisha technologies");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sharath");
		driver.findElement(By.xpath("//input[@name='userMobile']")).sendKeys("9877663469");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("sharath.34@gmail.com");
		driver.findElement(By.xpath("//input[@class='submit-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='signupPassword']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//div[@class='otp-input-wrapper clearfix-height']"));
		driver.findElement(By.xpath("//input[@data-input='1']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@data-step='2']")).click();
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(src,new File("/home/tvisha/Pictures/troopmessenger.png"));
		//Login group
		driver.findElement(By.xpath("//div[@id='recentCreateGroupBtn']")).click();
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("wgogds");
		driver.findElement(By.xpath("//input[@id='groupDescriptionInput']")).sendKeys("sdfdgfg");
		WebElement e=driver.findElement(By.xpath("//input[@id='groupAttachment']"));
		e.sendKeys("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot1.png");
		driver.findElement(By.xpath("//input[@id='groupNameInput']")).sendKeys("Testing");
		driver.findElement(By.xpath("//div[@class='group-user-wrapper row-visible']")).click();
		driver.findElement(By.xpath("//span[@class='group-member-admin']")).click();
		driver.findElement(By.xpath("//input[@id='createGroupSubmitBtn']")).click();
		Thread.sleep(2000);
		//Add User
		driver.findElement(By.xpath("//div[@id='recentAddUsersBtn'")).click();
	}
	@AfterClass
	public void EndTest() {		  
		driver.close();
	}
}
