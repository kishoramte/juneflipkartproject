package utility;

public class Calling {public static void main(String[] args) throws InterruptedException{
	
	//browserLaunch
	Object[] input=new Object[2];
   		  input[0]="Chrome";
	      input[1]="D:\\Automation Support\\Chromedriver.exe";
	      SeleniumOperations.browserLaunch(input);
	
	//openApplication
	Object[] input1=new Object[1];
		  input1[0]="https://www.flipkart.com/";
		  SeleniumOperations.openApplication(input1);
	//clickOnElement
	
	Object[] input2=new Object[1];
	  input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	  SeleniumOperations.clickOnElement(input2);

	//mouseOverAction
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.mouseOverAction(input3);
	
	//clickOnMyProfile
	Object[] input4=new Object[1];
	input4[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.clickOnMyProfile(input4);
	
	//enteruserName
    Object[] input5=new Object[2];
		  input5[0]="//*[@class='_2IX_2- VJZDxU']";
      input5[1]="7498783899";
      SeleniumOperations.sendText(input5);
      
      //enterPassword
    Object[] input6=new Object[2];
	  input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
      input6[1]="kishor";
      SeleniumOperations.sendText(input6);
      
      //clickOnLogin
    Object[] input7=new Object[2];
	  input7[0]="(//*[@type='submit'])[2]";
	  SeleniumOperations.clickOnLogin(input7);
	  
	 // validaton
	  Object[] input8=new Object[2];
	  input8[0]="//*[text()='Kishor']";
	  input8[1]="Kishor";
      SeleniumOperations.validation(input6);
}

}
