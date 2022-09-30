package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperations {
	
	public static WebDriver driver=null;
	public static ConfigReader config;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String, Object>();
	// BrowserLaunch
	 
	public static Hashtable<String,Object> browserLaunch(Object[]inputParameters){
		try {
			
		
		String bName=(String) inputParameters[0];
		
		
		if(bName.equalsIgnoreCase("Chrome")){
			
		 config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else if(bName.equalsIgnoreCase("Firefox")){
			
			
			System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
			
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}outputParameters.put("STATUS", "Pass");
			 outputParameters.put("MESSAGE", "Method used:browserLaunch , Input Given: " + inputParameters[0].toString());}
		catch(Exception e){
			outputParameters.put("STATUS", "Fail");
			 outputParameters.put("MESSAGE", "Method used:browserLaunch , Input Given: " + inputParameters[0].toString());
		}
		return outputParameters;
	}
	// open Application
	public static Hashtable<String,Object> openApplication(){
		try{
			
		
		
		
		driver.get(config.getApplicationUrl());
		outputParameters.put("STATUS", "Pass");
		 outputParameters.put("MESSAGE", "Method used:openApplication , Input Given: " + config.getApplicationUrl().toString());
	}
	catch(Exception e){
		outputParameters.put("STATUS", "Fail");
		 outputParameters.put("MESSAGE", "Method used:openApplication , Input Given: " + config.getApplicationUrl().toString());
	}
		return outputParameters;}
	//click
public static Hashtable<String,Object> clickOnElement(Object[]inputParameters){
		try{
			
		
		String locator=(String) inputParameters[0];
		
		driver.findElement(By.xpath(locator)).click();
		outputParameters.put("STATUS", "Pass");
		 outputParameters.put("MESSAGE", "Method used:clickOnElement , Input Given: " + inputParameters[0].toString());
}
		catch(Exception e){
			outputParameters.put("STATUS", "Fail");
			 outputParameters.put("MESSAGE", "Method used:clickOnElement , Input Given: " + inputParameters[0].toString());
			}return outputParameters;	
}
    //mouseover
        public static Hashtable<String,Object> mouseOverAction(Object[]inputParameters) throws InterruptedException{ Thread.sleep(5000);
	try{
		
	     String locator=(String) inputParameters[0];
	 	Actions act=new Actions(driver);
		
		WebElement xyz=driver.findElement(By.xpath(locator));
			
			act.moveToElement(xyz).build().perform();
			outputParameters.put("STATUS", "Pass");
			 outputParameters.put("MESSAGE", "Method used:mouseOverAction , Input Given: " + inputParameters[0].toString());
}     catch(Exception e){
	outputParameters.put("STATUS", "Fail");
	 outputParameters.put("MESSAGE", "Method used:mouseOverAction , Input Given: " + inputParameters[0].toString());
}    return outputParameters;
        }
        //mouseover
        public static Hashtable<String,Object> mouseOverActions(Object[]inputParameters) throws InterruptedException{ Thread.sleep(5000);
	try{
		
	     String locator=(String) inputParameters[0];
	 	Actions act=new Actions(driver);
		
		WebElement xyz=driver.findElement(By.xpath(locator));
			
			act.moveToElement(xyz).build().perform();
			outputParameters.put("STATUS", "Pass");
			 outputParameters.put("MESSAGE", "Method used:mouseOverAction , Input Given: " + inputParameters[0].toString());
}     catch(Exception e){
	outputParameters.put("STATUS", "Fail");
	 outputParameters.put("MESSAGE", "Method used:mouseOverAction , Input Given: " + inputParameters[0].toString());
}    return outputParameters;
        }
        //click on My Profile	
        public static Hashtable<String,Object> clickOnMyProfile(Object[]inputParameters){
    		try{
    		String locator=(String) inputParameters[0];
    		
    		driver.findElement(By.xpath(locator)).click();
    		outputParameters.put("STATUS", "Pass");
			 outputParameters.put("MESSAGE", "Method used:clickOnMyProfile , Input Given: " + inputParameters[0].toString());
    }     catch(Exception e){
    	outputParameters.put("STATUS", "Fail");
		 outputParameters.put("MESSAGE", "Method used:clickOnMyProfile , Input Given: " + inputParameters[0].toString());	} 
    		return outputParameters;
        }// Enter userName
public static Hashtable<String,Object> sendText(Object[]inputParameters) throws InterruptedException{ Thread.sleep(5000);
        try{
      
    		String locator=(String) inputParameters[0];
    		String mobileno=(String) inputParameters[1];
    		driver.findElement(By.xpath(locator)).sendKeys(mobileno);
    		outputParameters.put("STATUS", "Pass");
			 outputParameters.put("MESSAGE", "Method used:sendText , Input Given: " + inputParameters[0].toString());
    }   catch(Exception e){
    	outputParameters.put("STATUS", "Fail");
		 outputParameters.put("MESSAGE", "Method used:sendText , Input Given: " + inputParameters[0].toString());	}
        return outputParameters;
}
//click on Login	
public static Hashtable<String,Object> clickOnLogin(Object[]inputParameters) throws InterruptedException{Thread.sleep(5000);
	try{
	
	String locator=(String) inputParameters[0];
	
	driver.findElement(By.xpath(locator)).click();
	outputParameters.put("STATUS", "Pass");
	 outputParameters.put("MESSAGE", "Method used:clickOnLogin , Input Given: " + inputParameters[0].toString());
}   catch(Exception e){
	outputParameters.put("STATUS", "Fail");
	 outputParameters.put("MESSAGE", "Method used:clickOnLogin , Input Given: " + inputParameters[0].toString());
}return outputParameters;
} 
// validation
public static Hashtable<String,Object> validation(Object[]inputParameters) throws InterruptedException{ Thread.sleep(5000);
try{

String xpath=(String) inputParameters[0];
String givenText=(String) inputParameters[1];

String findedText=driver.findElement(By.xpath(xpath)).getText();   ///"//*[text()='Kishor']"
if(findedText.equalsIgnoreCase(givenText)){
	System.out.println("Test case pass");
}
else{
	System.out.println("Test case faild");
	outputParameters.put("STATUS", "Pass");
	 outputParameters.put("MESSAGE", "Method used:validation , Input Given: " + inputParameters[0].toString());
}
}catch(Exception e){
	outputParameters.put("STATUS", "Fail");
	 outputParameters.put("MESSAGE", "Method used:validation , Input Given: " + inputParameters[0].toString());
}return outputParameters;
}

}
