package com.demohospital;

import org.openqa.selenium.support.PageFactory;

public class LoginActions {
	LoginLocators logloc;
	public LoginActions() {
		this.logloc = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), logloc);
	}
	public void clickloginAction() {
		logloc.clickuserLogin.click();	
	}
	public void clicksigninAction() {
		logloc.clicksignIn.click();
	}
	
}
