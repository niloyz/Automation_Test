package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CustomerCreationPage;

public class StepDefinition extends CustomerCreationPage {
	WebDriver driver;

	@Before

	public void openBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@Given("I am navigated to PestRoutes domain {string}")
	public void i_am_navigated_to_PestRoutes_domain(String string) {
		driver.get(string);
	}

	@When("I enter my username and password")
	public void i_enter_my_username_and_password() throws InterruptedException {
		typeUsername();
		typePassword();
		
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		clickLoginButton();
	}

	@When("I click on New Customer button")
	public void i_click_on_New_Customer_button() {
		clickCustomerButton();
	}

	@When("I create customer with first name, last name, and address")
	public void i_create_customer_with_first_name_last_name_and_address() {
		typeZipcode();
		typeAddress();
		typeFirstName();
		typeLastName();
	}

	@When("I click on save")
	public void i_click_on_save() {
		clickSaveButton();
	}


	@Then("I validate if customer name and address match in overview tab")
	public void i_validate_if_customer_name_and_address_match_in_overview_tab() {
		validateAdress();
		validateCustomer();
	}
	
	@After 
	public void tearDown() {
		driver.quit();
	}
	

}
