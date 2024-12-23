package troopmessenger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class videoRecorder {
	WebDriver driver;
	ATUTestRecorder recorder;
	@BeforeTest
    public void ATURecordersetup() throws ATUTestRecorderException  {
      DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
      Date date = new Date();
      recorder = new ATUTestRecorder(System.getProperty("user.dir"),"\\videos\\"+dateFormat.format(date), false);
      recorder.start();
      System.setProperty("webdriver.chrome.driver", "/home/tvisha/Documents/chrome/chromedriver_linux64/chromedriver");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("https://testing.troopmessenger.com/sign-up");
    }
    @Test
    public void ScreenResolutions() throws Exception {
      driver.manage().window().setSize(new Dimension(500,700));
      Thread. sleep(1000);
      driver.manage().window().setSize(new Dimension(700,500));
      Thread. sleep(1000);
    }
    @AfterTest
    public void Close() throws Exception {
      driver.close();
      recorder.stop();
    }
}
