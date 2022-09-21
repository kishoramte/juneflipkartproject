package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {
	
	public static WebDriver driver=null;
	
	// BrowserLaunch
	 
	public static void browserLaunch(Object[]inputParameters){
		try {
			
		
		String bName=(String) inputParameters[0];
		String webdriverxpath=(String) inputParameters[1];
		
		if(bName.equalsIgnoreCase("Chrome")){
			
		
		System.setProperty("webdriver.chrome.driver", webdriverxpath);
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else if(bName.equalsIgnoreCase("Firefox")){
			
			
			System.setProperty("webdriver.gecko.driver", webdriverxpath);
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}}
		catch(Exception e){
			System.out.println(e);
		}
	}
	// open Application
	public static void openApplication(Object[]inputParameters){
		try{
			
		
		String strurl=(String) inputParameters[0];
		
		driver.get(strurl);
	}
	catch(Exception e){
		System.out.println(e);
	}}
	//click
public static void clickOnElement(Object[]inputParameters){
		try{
			
		
		String locator=(String) inputParameters[0];
		
		driver.findElement(By.xpath(locator)).click();		
}
		catch(Exception e){
			System.out.println(e);
		}	
}
    //mouseover
        public static void mouseOverAction(Object[]inputParameters){
	try{
		
	     String locator=(String) inputParameters[0];
	 	Actions act=new Actions(driver);
		
		WebElement xyz=driver.findElement(By.xpath(locator));
			
			act.moveToElement(xyz).build().perform();
}     catch(Exception e){
	   System.out.println(e);
}
        }
        //click on My Profile	
        public static void clickOnMyProfile(Object[]inputParameters){
    		try{
    		String locator=(String) inputParameters[0];
    		
    		driver.findElement(By.xpath(locator)).click();		
    }     catch(Exception e){
		System.out.println(e);
	}
        }// Enter userName
public static void sendText(Object[]inputParameters) throws InterruptedException{ Thread.sleep(5000);
        try{
      
    		String locator=(String) inputParameters[0];
    		String mobileno=(String) inputParameters[1];
    		driver.findElement(By.xpath(locator)).sendKeys(mobileno);
    }   catch(Exception e){
		System.out.println(e);
	}
}
//click on Login	
public static void clickOnLogin(Object[]inputParameters){
	try{
	
	String locator=(String) inputParameters[0];
	
	driver.findElement(By.xpath(locator)).click();		
}   catch(Exception e){
	System.out.println(e);
}
} 
// validation
public static void validation(Object[]inputParameters) throws InterruptedException{ Thread.sleep(5000);
try{

String xpath=(String) inputParameters[0];
String givenText=(String) inputParameters[1];

String findedText=driver.findElement(By.xpath(xpath)).getText();   ///"//*[text()='Kishor']"
if(findedText.equalsIgnoreCase(givenText)){
	System.out.println("Test case pass");
}
else{
	System.out.println("Test case faild");
}
}catch(Exception e){
	System.out.println(e);
}
}

}
