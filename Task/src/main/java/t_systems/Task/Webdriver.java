package t_systems.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Webdriver {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException{
	
		System.setProperty(Constants.CHROMEDRIVER, Constants.CHROMEDRIVER_EXE);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(Constants.URL);
		 Thread.sleep(3000);
		
	}
	 @AfterMethod()
	  public void close(){
		  driver.quit();
	  }

}
