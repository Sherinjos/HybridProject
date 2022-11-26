package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	//Declaration
	@FindBy(xpath="//a[text()='X']")
	private WebElement close;
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	//Initialization
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void closepopup() {
		close.click();
	}
	
	public void playbutton() {
		playbtn.click();
	}
	
	public void pausebutton() {
		pausebtn.click();
	}
	
	public void addtowishlistbtn() {
		addtowishlist.click();
	}
}
