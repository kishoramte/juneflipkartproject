package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login {
	
	@Given ("^User provide browser name as \"(.*)\" and exe location$")
	public static void brLaunch(String name){
		Object[] input=new Object[2];
 		  input[0]=name;
	      
	      SeleniumOperations.browserLaunch(input);}
	
	@Given ("^User enter url as$")
   public static void openApplication(){
		
		  SeleniumOperations.openApplication();
		  }
	
	@Given ("^User cancelled initial login window$")
	public static void clickOnElement() {
		Object[] input2=new Object[1];
		  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  SeleniumOperations.clickOnElement(input2);
}
	
	@When ("^user navigate on login tab$")
	public static void mouseOverAction() throws InterruptedException{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output3=SeleniumOperations.mouseOverAction(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on login tab$",output3.get("MESSAGE").toString());
	}
	
	@When ("^user click on MyProfile$")
	public static void clickMyProfile(){
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output4=SeleniumOperations.clickOnMyProfile(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on MyProfile$",output4.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public static void sendText(String name) throws InterruptedException{
		 Object[] input5=new Object[2];
		  input5[0]="//*[@class='_2IX_2- VJZDxU']";
     input5[1]=name;
     Hashtable<String,Object> output5=SeleniumOperations.sendText(input5);
     HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$",output5.get("MESSAGE").toString());
    		
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public static void sendpassword(String password) throws InterruptedException{
		 Object[] input6=new Object[2];
		  input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	    input6[1]=password;
	    Hashtable<String,Object> output6=SeleniumOperations.sendText(input6);
	    HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$",output6.get("MESSAGE").toString());
	}
	 
	@When ("^user click on Login button$")
	public static void clickOnLogin() throws InterruptedException{
		 Object[] input7=new Object[2];
		  input7[0]="(//*[@type='submit'])[2]";
		  Hashtable<String,Object> output7=SeleniumOperations.clickOnLogin(input7);	
		  HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on Login button$",output7.get("MESSAGE").toString());
	}
	
	@Then ("^Application shows user profile to user$")
	public static void validation() throws InterruptedException{
		Object[] input8=new Object[2];
	  input8[0]="//*[text()='Kishor']";
	  input8[1]="Kishor";
	  Hashtable<String,Object> output8=SeleniumOperations.validation(input8);
	  HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$",output8.get("MESSAGE").toString());
	}
	
}
