package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {

	//Declaration
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class=\"fa fa-linkedin\"])[2]")
	private WebElement linkedin;
	
	//Initialization
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Utilization
	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getLinkedin() {
		return linkedin;
	}
	
	public void linkedinicon() {
		linkedin.click();
	}


	
	


}
