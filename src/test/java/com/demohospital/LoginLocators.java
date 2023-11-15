package com.demohospital;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="//a[contains(.,'User Login')]")
	WebElement clickuserLogin;
	@FindBy(xpath="//div[@class='form-group']/following-sibling::button[1]")
	WebElement clicksignIn;
	}

