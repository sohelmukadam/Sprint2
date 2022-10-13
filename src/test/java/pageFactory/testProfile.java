package pageFactory;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.ProfilePage;
public class testProfile {

	    static WebDriver driver;



	   public static void main(String[] args) {
	        
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
			
			try {
			    Thread.sleep(5000);
			} catch(InterruptedException e) {
			    System.out.println("got interrupted!");
			}
			driver.findElement(By.cssSelector(".spriteIcon-Firstfold.profileIcon-active")).click();
			
	   
	   		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
	   		
	   		driver.findElement(By.xpath("//div[@class='prof-picture mb-55 clearfix ']//i[@id='editProfile']")).click();
	   
	        
	        //login code to get to the edit page
	        
	        ProfilePage p = PageFactory.initElements(driver, ProfilePage.class);
	        
	        
	        
	        p.profile_action("Sohel" ,"Mukadam", "9987050342");
	       
	        
	        driver.findElement(By.xpath("//a[@class='global-button-white btn-style2 ap_user_profile_btn']")).click();
	        
	        //driver.quit();

	   }

	}

