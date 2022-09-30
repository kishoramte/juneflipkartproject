package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class ManageAddress {
	
	@When ("^user navigate on user tab$")
	public static void mouseOverAction() throws InterruptedException{
		Object[] input9=new Object[1];
		input9[0]="(//*[@class='exehdJ'])[1]";
		Hashtable<String,Object> output9=SeleniumOperations.mouseOverAction(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^^user navigate on user tab$",output9.get("MESSAGE").toString());
	
} @When ("^user click on user MyProfile$")
	public static void clickMyProfile(){
	Object[] input10=new Object[1];
	input10[0]="//*[text()='My Profile']";
	Hashtable<String,Object> output10=SeleniumOperations.clickOnMyProfile(input10);
	HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "^user click on user MyProfile$",output10.get("MESSAGE").toString());
}
@When ("^user navigates on user tab$")
public static void mouseOverActions() throws InterruptedException{
	Object[] input12=new Object[1];
	input12[0]="(//*[@class='exehdJ'])[1]";
	Hashtable<String,Object> output12=SeleniumOperations.mouseOverAction(input12);
	HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user navigates on user tab$",output12.get("MESSAGE").toString());}
@When ("^user click on manage address$")
public static void clickOnLogin() throws InterruptedException{
	 Object[] input11=new Object[2];
	 input11[0]="//*[text()='Manage Addresses']";
	  Hashtable<String,Object> output11=SeleniumOperations.clickOnLogin(input11);	
	  HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user click on manage address$",output11.get("MESSAGE").toString());
} @Then ("^Application shows user address to user$")
public static void validation() throws InterruptedException{
	Object[] input13=new Object[2];
	input13[0]="//*[text()='7498783899']";
	input13[1]="7498783899";
  Hashtable<String,Object> output13=SeleniumOperations.validation(input13);
  HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^Application shows user address to user$",output13.get("MESSAGE").toString());
}
}