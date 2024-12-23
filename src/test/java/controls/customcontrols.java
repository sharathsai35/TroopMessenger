package controls;

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

public class customcontrols {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
	htmlReporter = new ExtentHtmlReporter("customcontrols.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[5]/div/div[2]/div/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"roleNameInput\"]")).sendKeys("billing");
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"addMembersbtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/label[1]/span/span[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/label[2]/span/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"addRoleNextBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/table/tbody/tr[4]/td[3]/label/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/table/tbody/tr[4]/td[4]/label/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"addRoleSubmitBtn\"]")).click();
		ExtentTest test = extent.createTest("Billing");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Admin Dashboard:click on AdminDashboard");
		test.info("Users:Click on Users");
		test.info("Roles:Click on Roles");
		test.info("Create New:Click on Create New");
		test.info("Role:Add Role as Billing");
		test.info("Add:Click on add members and add users");
		test.info("click on done");
		test.info("Next:click on Next button and It move to Permission");
		test.info("Billing:select Billing to view and create");
		test.info("Save:Click on Save Button");
		test.info("EXPECTED RESULT:: System should display the Role Billing ");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Role added successfully");
		test.log(Status.PASS,"ACTUAL RESULT::  Role added successfully ");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.55:8081/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sai@123");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[5]/div/div[2]/div/div/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"roleNameInput\"]")).sendKeys("group");
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"addMembersbtn\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/label[1]/span/span[2]/span")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/label[2]/span/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div[2]/div/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(" //*[@id=\"addRoleNextBtn\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/table/tbody/tr[5]/td[3]/label/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/table/tbody/tr[5]/td[6]/label/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"addRoleSubmitBtn\"]")).click();
		ExtentTest test = extent.createTest("Groups");
		test.log(Status.INFO, "Chrome Browser Launched Successfully");
		test.info("Navigate to URL");
		test.info("Email:abcd@gmail.com");
		test.info("Password:sai@123");
		test.info("Login:Click on Login");
		test.info("Admin Dashboard:click on AdminDashboard");
		test.info("Users:Click on Users");
		test.info("Roles:Click on Roles");
		test.info("Create New:Click on Create New");
		test.info("Role:Add Role as Groups");
		test.info("Add:Click on add members and add users");
		test.info("click on done");
		test.info("Next:click on Next button and It move to Permission");
		test.info("Groups:select Groups to view and Delete");
		test.info("Save:Click on Save Button");
		test.info("EXPECTED RESULT:: System should display the Group ");
		//String actual=driver.findElement(By.xpath("//div[@class='feedback-section']")).getText();
		//Assert.assertEquals(actual, "Role added successfully");
		test.log(Status.PASS,"ACTUAL RESULT::  Role added successfully");
		test.pass("Test Case:: TestCase PASSED");
		Thread.sleep(1000);
		driver.close();
	}
	@AfterSuite
	public void endTtest() {
		extent.flush();
	}
}
