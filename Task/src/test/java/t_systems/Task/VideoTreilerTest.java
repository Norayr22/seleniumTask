package t_systems.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VideoTreilerTest extends Webdriver{
  // Case when user can choose the video from list
	@Test(priority = 1)
	public void verifyVideoTreilerTest() throws InterruptedException {
		SearchPage search = new SearchPage(driver);
		search.verifyChosenVideoTreiler();
 
}
  // Case when the first video from right side is chosen
	@Test(priority = 2)
	public void verifyFIrstVideoTreilerTest() throws InterruptedException {
		SearchPage search = new SearchPage(driver);
		search.verifyFisrtVideoTreiler();
	}

 
  
}