package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class firstauto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32101\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String baseURL = "https://www.asianpaints.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("span.profileIcon")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		WebElement myAlert= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginMobile']")));
		driver.findElement(By.xpath("//input[@id='loginMobile']")).sendKeys("9987050342");
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'ctaText modal__variant-login--submit')]")).click();
		
		
		try {
		    Thread.sleep(15000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		
		driver.findElement(By.cssSelector("div[id='isRegisteredModal'] button:nth-child(1)")).click();
		
		
		
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		//WebElement myAlert1= wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='ctaText modal__variant-login--submit']")));
		//myAlert1.click();
	
		 //driver.findElement(By.cssSelector("button[class='ctaText modal__variant-login--submit']")).click();
		//WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement myAlert2= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.profileIcon")));
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//Actions act =  new Actions(driver);
		//act.moveToElement(
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Actions act =  new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[3]/div[2]/div[1]/a[1]/span"))).click();
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.profileIcon")));
		try {
		    Thread.sleep(5000);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/header/div[3]/div[2]/div[1]/a[1]/span")).click();
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='My Profile']")));
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"editProfile\"]")).click();

		
		
		
		//driver.quit();
	
	}
}