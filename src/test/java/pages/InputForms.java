package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputForms {
	public InputForms(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id = "[id=get-input] .form-control")
	public WebElement enterMessage;
	
	FindBy()

}
