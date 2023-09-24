package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPomBooking {

	
	
	private WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFistname() {
		return Fistname;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public WebElement getCreditCardno() {
		return CreditCardno;
	}
	public WebElement getselectCredittype() {
		return selectCredittype;
	}
	
	public WebElement getselectMonth() {
		return selectmonth;
	}
	public WebElement getselectYear() {
		return selectyear;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}
	public WebElement getCancel() {
		return cancel;
	}
	@FindBy(id="first_name")
	private WebElement Fistname;
	@FindBy(id="last_name")
	private WebElement Lastname;
	@FindBy(id="address")
	private WebElement BillingAddress;
	@FindBy(id="cc_num")
	private WebElement CreditCardno;
	@FindBy(id="cc_type")
	private WebElement selectCredittype;
	@FindBy(id="cc_exp_month")
	private WebElement selectmonth;
	@FindBy(id="cc_exp_year")
	private WebElement selectyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	@FindBy(id="cancel")
	private WebElement cancel;
	
	public AdactinPomBooking(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
