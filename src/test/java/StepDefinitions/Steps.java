package StepDefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public static WebDriver driver;
	// LOGIN STEPS
	@Given("I am on the Asianpaints home page")
	public void i_am_on_the_asianpaints_home_page() {
	    
		driver = new ChromeDriver();
		String baseURL = "https://www.asianpaints.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

	@Given("I click on profile button")
	public void i_click_on_profile_button() {
	    
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("span.profileIcon")).click();
	}  

	@When("I enter number as {string}")
	public void i_enter_number_as(String string) {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		WebElement myAlert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginMobile']")));
		driver.findElement(By.xpath("//input[@id='loginMobile']")).sendKeys(string);
		driver.findElement(By.xpath("//button[contains(@class,'ctaText modal__variant-login--submit')]")).click();
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
	}//button[contains(@class,'ctaText modal__variant-login--submit')]

	@When("I enter otp")
	public void i_enter_otp() {
	    
		try {
		    Thread.sleep(20000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
	    
		driver.findElement(By.cssSelector("div[id='isRegisteredModal'] button:nth-child(1)")).click();
	}

	@Then("login is successful")
	public void login_is_successful() {
	    
		System.out.println("Successful");
	}

	//PROFILE DETAILS STEP

	@Given("I am a loggedin user")
	public void i_am_a_loggedin_user() {
    
	driver = new ChromeDriver();
	String baseURL = "https://www.asianpaints.com";
	driver.get(baseURL);
	driver.manage().window().maximize();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	driver.findElement(By.cssSelector("span.profileIcon")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
	WebElement myAlert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginMobile']")));
	driver.findElement(By.xpath("//input[@id='loginMobile']")).sendKeys("9987050342");
	driver.findElement(By.xpath("//button[contains(@class,'ctaText modal__variant-login--submit')]")).click();
	 driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
	try {
	    Thread.sleep(15000);
	} catch(InterruptedException e) {
	    System.out.println("got interrupted!");
	}
	
		driver.findElement(By.cssSelector("div[id='isRegisteredModal'] button:nth-child(1)")).click();
	}


	@Given("I click on profile active button")
	public void i_click_on_profile_active_button() {
    
	try {
	    Thread.sleep(5000);
	} catch(InterruptedException e) {
	    System.out.println("got interrupted!");
	}
	JavascriptExecutor js= (JavascriptExecutor) driver;
	driver.findElement(By.cssSelector(".spriteIcon-Firstfold.profileIcon-active")).click();
	}

	@When("I click on Myprofile button")
	public void i_click_on_myprofile_button() {
    
	driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
	
	}

	@Then("I can see the profileDetails")
	public void i_can_see_the_profile_details() {
    
	String actualTitle =  driver.getTitle();
    Assert.assertEquals("My Profile",actualTitle);
	}
	
	//ORDER DETAILS STEP

	@When("I click on Myorder button")
	public void i_click_on_myorder_button() {
	
	//driver = new ChromeDriver();
	try {
	    Thread.sleep(2000);
	} catch(InterruptedException e) {
	    System.out.println("got interrupted!");
	}
	//driver.findElement(By.xpath("//*[@id=\"as-smart-tab\"]/li[3]/a")).click();
	driver.findElement(By.cssSelector("a[href='#tab-3']")).click();
	}

	@Then("I can see the orderDetails")
	public void i_can_see_the_order_details() {
	String actualTitle =  driver.getTitle();
    Assert.assertEquals("My Profile",actualTitle);
	}


    //SIGNUP STEPS
	
	@When("I click on regSubmit button")
	public void i_click_on_reg_submit_button() {
	    
		driver.findElement(By.xpath("//button[contains(@class,'ctaText modal__variant-login--submit')]")).click();
	}
	
	@When("I enter name as {string}")
	public void i_enter_name_as(String string) {
		
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		driver.findElement(By.id("registerName")).sendKeys(string);
	}

	@When("I enter email as {string}")
	public void i_enter_email_as(String string) {
    
		driver.findElement(By.id("registerEmail")).sendKeys(string);
	}

	@When("I click on registerSubmit button")
	public void i_click_on_register_submit_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.cssSelector(".ctaText.reg_validate.modal__variant-login--submit")).click();
	}

	@Then("signup is successful")
	public void signup_is_successful() {
    
    	System.out.println("Signup successful");
	}	


	//DOCUMENT DETAILS STEPS

	@When("I click on Mydocuments button")
	public void i_click_on_mydocuments_button() {
    
		driver.findElement(By.cssSelector("a[href='#tab-4']")).click();
	}

	@Then("I can see the documentDetails")
	public void i_can_see_the_document_details() {
    
		String actualTitle =  driver.getTitle();
	    Assert.assertEquals("My Profile",actualTitle);
	}


   //PROFILE DETAILS EDIT

	@When("I click on edit button")
	public void i_click_on_edit_button() {
		
		driver.findElement(By.xpath("//div[@class='prof-picture mb-55 clearfix ']//i[@id='editProfile']")).click();
	}

	@When("I click and edit firstname as {string}")
	public void i_click_and_edit_firstname_as(String string) {
		
		driver.findElement(By.xpath("//input[@name='profile_fname']")).clear();
		driver.findElement(By.xpath("//input[@name='profile_fname']")).sendKeys(string);
	}

	@When("I click and edit lastname as {string}")
	public void i_click_and_edit_lastname_as(String string) {
    
		driver.findElement(By.xpath("//input[@name='profile_lname']")).clear();
		driver.findElement(By.xpath("//input[@name='profile_lname']")).sendKeys(string);
	}


	@When("I click and edit mobile as {string}")
	public void i_click_and_edit_mobile_as(String string) {
		
		driver.findElement(By.xpath("//input[@name='profile_mobile']")).clear();
		driver.findElement(By.xpath("//input[@name='profile_mobile']")).sendKeys(string);
	}

	@When("I click and select gender")
	public void i_click_and_select_gender() {
    
		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[7]/div/div/div/button/span[1]")).click();
		//List<WebElement> dropdownItems = dropdownBtn.findElements(By.tagName("span"));
		//dropdownItems.get(1).click();
		//driver.findElement(By.className("text")[0].innerext).click();
		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[7]/div/div/div/div/ul/li[3]/a")).click();
		
	}

	@When("I click on update button")
	public void i_click_on_update_button() {
    
		driver.findElement(By.xpath("//a[@class='global-button-white btn-style2 ap_user_profile_btn']")).click();
	}

	@Then("I can see the profileDetails updated")
	public void i_can_see_the_profile_details_updated() {
		
		System.out.println("Updated!");
	}
}

