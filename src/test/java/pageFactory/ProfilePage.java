package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.CacheLookup;


public class ProfilePage {

		
		    WebDriver driver;
		    
		    public ProfilePage(WebDriver driver)
		    {
		        this.driver= driver;
		    }
		    
		    @CacheLookup
		    @FindBy(name="profile_fname")
		    WebElement fname;
		    
		    @FindBy(name="profile_lname")
		    WebElement lname;
		    
		    @FindBy(name="profile_mobile")
		    WebElement mobile;
		    
		    @FindBy(linkText="Update")
		    WebElement update;
		    
		    public void profile_action(String Firstname,String Lastname,String Mobile)
		    {
		    	fname.clear();
		        fname.sendKeys(Firstname);
		        lname.clear();
		        lname.sendKeys(Lastname);
		        mobile.clear();
		        mobile.sendKeys(Mobile);
		       // update.click();
		        
		    }
		   

	}
