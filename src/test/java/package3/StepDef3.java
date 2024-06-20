package package3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.util.Precision;
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

public class StepDef3 {
	public static WebDriver driver;
	@Given("I Am on the SauceDemo login page")
	public void i_Am_on_the_SauceDemo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		String driverPath = System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
        System.out.println(driverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-orgins=*");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        driver = new ChromeDriver(); // Initialize the class-level driver variable
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
	    
	}

	@When("I Enter the username {string}")
	public void i_Enter_the_username(String user) {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, Pageobj.class);
		Pageobj.username.sendKeys(user);
	    
	}

	@And("I Enter the password {string}")
	public void i_Enter_the_password(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.password.sendKeys(pass);
	    
	}

	@And("I Click the login button")
	public void i_Click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.button.click();
	   
	}

	@When("I Click add to cart button")
	public void i_Click_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.addToCartBackpack.click();
		Pageobj.addToCartJacket.click();
	   
	}

	@And("I click the cart icon")
	public void i_click_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.cartButton.click();
	  
	}

	@And("I click the checkout button")
	public void i_click_the_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.checkout.click();
	    
	}

	@When("I enter the user information block i enter first name {string}")
	public void i_enter_the_user_information_block_i_enter_first_name(String first) {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.firstname.sendKeys(first);
	   
	}

	@And("I enter the last name {string}")
	public void i_enter_the_last_name(String last) {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.lastname.sendKeys(last);
	    
	}

	@And("I enter the postal code {string}")
	public void i_enter_the_postal_code(String post) {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.postal.sendKeys(post);
	    
	}

	@Then("I click the continue button")
	public void i_click_the_continue_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Pageobj.continueButton.click();
		
	}
	@And("I check that the total price is equal")
	public void i_check_that_the_total_price_is_equal(){
		 float pricetotal=Float.parseFloat(driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText().substring(13));
	     float tax = Float.parseFloat(driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText().substring(6));	
	     float total = Float.parseFloat(driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']")).getText().substring(8));
	     System.out.println(pricetotal);
	     System.out.println(tax);
	     System.out.println(total);
	     float n=pricetotal+tax;
	     float priceAndtax=Precision.round(n, 2);
	     if(priceAndtax==total) {
	    	 System.out.println("Equals");
	     }else {
	    	 System.out.println("not");
	     }
	}
	

}
