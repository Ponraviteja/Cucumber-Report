package org.loginsteps.test;

import org.baseclass.test.BaseClass;
import org.junit.Assert;
import org.pom.test.loginPomTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	
	public loginPomTest l; 
	
	@Given("User in Facebook Login Page")
	public void user_in_Facebook_Login_Page() {
	 launchBrowser();
	 launchUrl("https://www.facebook.com/");
	}

	@When("User Pass the Credentials in username and password")
	public void user_Pass_the_Credentials_in_username_and_password() {
	   
		l = new loginPomTest();
		l.enterCred("Ravi", "Ravi@123");
	
	}

	@When("User Click the Login button")
	public void user_Click_the_Login_button() {
		l = new loginPomTest();
	   l.clickLoginBut();
	}

	@Then("user enters in Main Page")
	public void user_enters_in_Main_Page() {
		String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("privacy_mutation_tokn"));
		
	}

}
