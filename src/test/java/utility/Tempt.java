package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Automation Support\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		
		Actions act=new Actions(driver);
		
	WebElement xyz=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		
		act.moveToElement(xyz).build().perform();
		
		driver.findElement(By.xpath("//*[text()='My Profile']")).click();
		
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7498783899");
        
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("kishor");
		
	    driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
	    Thread.sleep(5000);
	    
		driver.findElement(By.xpath("(//*[@class='NS64GK'])[1]")).click();
	}
}
