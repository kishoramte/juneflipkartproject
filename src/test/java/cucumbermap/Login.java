package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login {
	
	@Given ("^User provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
	public static void brLaunch(String name, String location){
		Object[] input=new Object[2];
 		  input[0]=name;
	      input[1]=location;
	      SeleniumOperations.browserLaunch(input);}
	
	@Given ("^User enter url as \"(.*)\"$")
   public static void openApplication(String url){
		Object[] input1=new Object[1];
		  input1[0]=url;
		  SeleniumOperations.openApplication(input1);
		  }
	
	@Given ("^User cancelled initial login window$")
	public static void clickElement(){
		Object[] input2=new Object[1];
		  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  SeleniumOperations.clickOnElement(input2);
}
	
	@When ("^user navigate on login tab$")
	public static void mouseOverAction(){
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.mouseOverAction(input3);
	}
	
	@When ("^user click on MyProfile$")
	public static void clickMyProfile(){
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.clickOnMyProfile(input4);
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public static void sendText(String name) throws InterruptedException{
		 Object[] input5=new Object[2];
		  input5[0]="//*[@class='_2IX_2- VJZDxU']";
     input5[1]=name;
     SeleniumOperations.sendText(input5);
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public static void sendpassword(String password) throws InterruptedException{
		 Object[] input6=new Object[2];
		  input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
	    input6[1]=password;
	    SeleniumOperations.sendText(input6);	
	}
	 
	@When ("^user click on Login button$")
	public static void clickOnLogin(){
		 Object[] input7=new Object[2];
		  input7[0]="(//*[@type='submit'])[2]";
		  SeleniumOperations.clickOnLogin(input7);	
	}
	
	@Then ("^Application shows user profile to user$")
	public static void validation() throws InterruptedException{
		
	
	Object[] input8=new Object[2];
	  input8[0]="//*[text()='Kishor']";
	  input8[1]="Kishor";
    SeleniumOperations.validation(input8);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
