package t_systems.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchPage {
	WebDriver driver;
	@FindBy(className = Constants.SEARCH_FIELD)
	private WebElement search_field;
	@FindBy(xpath = Constants.SEARCH_BUTTON)
	private WebElement search_button;
	@FindBy(xpath = Constants.CHOOSEN_VIDEO) // in this case this is "Котята прикольно поют" video
	private WebElement choosen_video;
	@FindBy(css = Constants.FIRST_VIDEO_ON_RIGHT_SIDE)// it is the first video from right side
	private WebElement first_video_on_right_side;


	public  SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyChosenVideoTreiler() throws InterruptedException {
		search_field.click();
		search_field.sendKeys("Котята");
		search_button.click();
		Thread.sleep(3000);
		String str = choosen_video.getAttribute("src");
		Actions action = new Actions(driver);
		WebElement we = search_button;
		action.moveToElement(we).moveToElement(choosen_video).build().perform();
		Thread.sleep(2000);
		String str1 = choosen_video.getAttribute("src");	
		Assert.assertNotEquals(str, str1);
		Thread.sleep(1000);


	}
	
	public void verifyFisrtVideoTreiler() throws InterruptedException {
		search_field.click();
		search_field.sendKeys("Котята");
		search_button.click();
		Thread.sleep(3000);
		String str2 = first_video_on_right_side.getAttribute("src");
		Actions action = new Actions(driver);
		WebElement we = search_button;
		action.moveToElement(we).moveToElement(first_video_on_right_side).build().perform();
		Thread.sleep(2000);
		String str3 = first_video_on_right_side.getAttribute("src");	
		Assert.assertNotEquals(str2, str3);
		Thread.sleep(1000);
		
	}
}
