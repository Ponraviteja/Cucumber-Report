package org.pom.test;

import org.baseclass.test.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPomTest extends BaseClass{

	public loginPomTest() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement TxtPass;
	
	@FindBy(name="login")
	private WebElement txtLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return TxtPass;
	}

	public WebElement getTxtLogin() {
		return txtLogin;
	}
	
	public void enterCred(String username,String password) {

		fill(getTxtEmail(),username);
		fill(getTxtPass(), password);
	
	}
	
	public void clickLoginBut() {

		butClick(getTxtLogin());

	}
	
	
	
}
