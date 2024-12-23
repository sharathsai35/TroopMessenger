package controls;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;

public class Brandinglogo {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	String extentReportImage = System.getProperty("user.dir")+ "extentReportImage.png";
	@BeforeSuite
	public void StartTest() {
		htmlReporter = new ExtentHtmlReporter("logo.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='center']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[4]/input")).click();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		ExtentTest test=extent.createTest("Branding logo is Enable");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select center in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top center in user page");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='left']")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[4]/input")).click();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		ExtentTest test=extent.createTest("Branding logo is Enable with left alignment");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select left in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top left corner in user page");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='right']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[4]/input")).click();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		ExtentTest test=extent.createTest("Branding logo with Alignment right");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select right in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top right corner in user page");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingFileInput']")).sendKeys("/home/tvisha/sai.png");
		driver.findElement(By.xpath("//span[@data-type='center']")).click();
		driver.findElement(By.xpath("//input[@id='logoBrandingColorPicker']")).sendKeys("#151313");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[4]/input")).click();
		//driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		ExtentTest test=extent.createTest("Branding logo with color ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select center in Alignment");
		test.info("Select background color is black");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top center with black color in user page");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test4() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingEnable\"]")).click();
		driver.findElement(By.xpath("//input[@id='permissionLogoBrandingColorNone']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Branding logo with background color none ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Enable");
		test.info("Upload Image");
		test.info("select center in Alignment");
		test.info("Select background color is none");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should display Branding logo in top center with no color in user page");
		test.log(Status.FAIL ,"ACTUAL RESULT ::  Permissions applied");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot3.png"));
		test.addScreenCaptureFromPath("/home/tvisha/Downloads/eclipse-inst-jre-linux64/maven/screenshot3.png");
		Thread.sleep(1000);
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://192.168.2.19:8081/messenger");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sharath@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id='bG9naW5CdG4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-type='5']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[16]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"permissionLogoBrandingDisable\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[17]/div[2]/div[4]/input")).click();
		driver.navigate().refresh();
		Thread.sleep(3000);
		ExtentTest test=extent.createTest("Branding logo with Disable ");
		test.log(Status.INFO, "Chrome Browser launching Successfully");
		test.info("Navigate to Url");
		test.info("Email:sharath@gmail.com");
		test.info("Password:123456");
		test.info("Login:click on login");
		test.info("Click on AdminDashboard");
		test.info("click on controls");
		test.info("Click on BrandingLogo");
		test.info("Select Disable");
		test.info("click on save");
		test.info("EXPECTED RESULT ::  System should not display any branding logo");
		test.log(Status.PASS ,"ACTUAL RESULT ::  Permissions applied");
		test.pass("Test Case:: TestCase PASSED");
		driver.close();
	}
	@AfterSuite
	public void endTest() {
		extent.flush();
	}
}

