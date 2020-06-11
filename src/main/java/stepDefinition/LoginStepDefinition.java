package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void User_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./exe/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
	}
	
	@When("^title of the login page is Fre CRM$")
	public void title_of_the_login_page_is_Fre_CRM() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(){
		driver.findElement(By.name("username")).sendKeys("batchauthomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", element);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title=driver.getTitle();
		System.out.println("Home Page title is "+title);
		Assert.assertEquals("CRMPRO", title);
	}
}
