package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	@CacheLookup
	@FindBy(id="registerName")
	WebElement name;
	
	@FindAll({
	@FindBy(id="registerEmail"),
	@FindBy(name="EMAIL")
	})
	WebElement email;
	
	@FindBy(xpath="//button[@class='ctaText reg_validate modal__variant-login--submit']")
	WebElement submit;
	
	public void Signup(String Username,String Email)
	{
		name.sendKeys("Sohelmukadam");
		email.sendKeys("Mikeposner619@gmail.com");
		
	}

}
