package pageObjects;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class CustomerCreationPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='inputUser']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='inputPassword']")
	private WebElement password;
	
	@FindBy(xpath = "//body/div[@id='outterWrapper']/div[@id='innerWrapper']/form[@id='credentialsForm']/div[1]/input[1]")
	private WebElement logInButton;
	
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	private WebElement newcustomerButton;
	
	@FindBy (xpath="//body/div[13]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement zipcodeType;
	
	@FindBy (xpath = "//body/div[13]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement addressType;
	
	@FindBy (xpath = "//body/div[13]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement firstName;
	
	@FindBy (xpath = "//body/div[13]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement lastName;
	
	@FindBy (xpath = "//body/div[13]/div[3]/div[1]/button[1]/span[1]")
	private WebElement clickSaveButton;
	
	@FindBy (xpath = "//div[contains(text(),'4413 N Shiloh Rd Garland, TX 75044')]")
	private WebElement addressValidate;
	
	@FindBy (xpath = "//span[@id='ui-id-11']")
	private WebElement nameValidate;
	
	public void typeUsername() {
		username.sendKeys("interview_test");
	}
	public void typePassword() {
		password.sendKeys("1235252");
	}
	public void clickLoginButton() {
		logInButton.click();
	}
	public void clickCustomerButton() {
		newcustomerButton.click();
	}
	public void typeZipcode() {
		zipcodeType.sendKeys("75044");
	}
	public void typeAddress() {
		addressType.sendKeys("4413 N Shiloh Rd");
	}
	public void typeFirstName() {
		firstName.sendKeys("John");
	}
	public void typeLastName() {
		lastName.sendKeys("Doe");
	}
	public void clickSaveButton() {
		clickSaveButton.click();
	}
	public void validateAdress() {
		Assert.assertEquals("4413 N Shiloh Rd Garland, TX 75044", addressValidate.getText());
	}
	public void validateCustomer() {
		Assert.assertEquals(" &nbsp;&nbsp;John Doe ", nameValidate.getText());
	}
}
