package package1;


	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
	import java.util.Date;
	import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import resource.Pageobj;

	public class StepDef1 extends Pageobj{
		public static WebDriver driver;
		@Given("I am on the saucedemo login page")
		public void i_am_on_the_saucedemo_login_page() throws Exception {
			String driverPath = System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	        System.out.println(driverPath);
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-orgins=*");
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        capabilities.merge(capabilities);
	        driver = new ChromeDriver(); // Initialize the class-level driver variable
	        driver.get("https://www.saucedemo.com/");
	        
		}
		@When("I enter the Username {string}")
		public void i_enter_the_Username(String user) {
			PageFactory.initElements(driver, Pageobj.class);
			Pageobj.username.sendKeys(user);
		}
		@And("I enter the Password {string}")
		public void i_enter_the_Password(String pass) {
			Pageobj.password.sendKeys(pass);
		}
		@And("I click the Login button")
		public void i_click_the_login_button() {
			Pageobj.button.click();

		}
		@Then("I should see an error msg as login failed if login failed")
		public void i_should_see_an_error_msg_as_login_failed_if_login_failed() throws IOException {
			try {
				String errmsg=Pageobj.errormsg.getText();
				System.out.println(errmsg);
			}catch(Exception e){
				System.out.println("Login success");
			}
			Pageobj.screenschot();
		}
		
		/*
		@When("I click add to cart button")
		public void i_click_add_to_cart_button() {
			Pageobj.addToCartBackpack.click();
		}
		
		@Then("I check number of items in cart is correct")
		public void i_check_number_of_items_in_cart_is_correct() {
			String number = driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).getText();
			if (number == "2") {
				System.out.println("Number of items in cart is equal to no.of added items");
			}
			*/
		}

		

	

