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

public class Test_case {
	
	// static because its declared in the class
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.asianpaints.com");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("span.profileIcon")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		WebElement myAlert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginMobile']")));
		driver.findElement(By.xpath("//input[@id='loginMobile']")).sendKeys("9324267231");
		driver.findElement(By.xpath("//button[contains(@class,'ctaText modal__variant-login--submit')]")).click();
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
		
		try {
		    Thread.sleep(3000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		
		SignupPage S = PageFactory.initElements(driver, SignupPage.class);
		
		
		
		S.Signup("Sohelmukadam", "Mikeposner619@gmail.com");
		
		try {
		    Thread.sleep(20000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		
		S.submit.click();
		
		//driver.quit();
		

	}

}
