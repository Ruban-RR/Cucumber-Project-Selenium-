package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobj {

	@FindBy(xpath="//input[@id='user-name']")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="login-button")
	public static WebElement button;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	public static WebElement addToCartBackpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	public static WebElement addToCartJacket;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	public static WebElement cartButton;
	
	@FindBy(xpath="//h3")
	public static WebElement errormsg;
	
	@FindBy(xpath="//button[@id='checkout']")
	public static WebElement checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	public static WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	public static WebElement postal;
	
	@FindBy(xpath="//input[@id='continue']")
	public static WebElement continueButton;
	
	@FindBy(xpath="//div[@class='summary_subtotal_label']")
	public static WebElement itemPrice;
	
	@FindBy(xpath="//div[@class='summary_tax_label']")
	public static WebElement tax;
	
	@FindBy(xpath="//div[@class='summary_info_label summary_total_label']")
	public static WebElement total;
	
	public static WebDriver driver;
	

	
	public static void screenschot() throws IOException {
		TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
	    // Capture the screenshot as a file
		//Step 2 (print screeen) JVM
	    File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
	    //Step 3 - Path setup 
	    // Specify the location to save the screenshot (change the path as needed)
	    Date currentDate=new Date();
	    String filename=currentDate.toString().replace(" ", "-").replace(":","-");
	    // Move the file to the desired location
	    //Step 4 - Move to my path
	    FileUtils.moveFile(screenshotFile, new File("D:\\Eclipse-Workspace\\org.selenium.cucumber\\src\\test\\resources"+filename+".png"));
	}
	
	
}
