package org.adacstep;

import org.openqa.selenium.WebDriver;

import com.Adactin.AdactinBase;
import com.Adactin.AdactinPom;
import com.Adactin.AdactinPomBooking;
import com.Adactin.AdactinPomNext;
import com.Adactin.AdactinPomSearchHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Adacstep extends AdactinBase {
	public WebDriver driver;
	public AdactinPom a;
	public  AdactinPomSearchHotel b;
	public  AdactinPomNext c;
	public  AdactinPomBooking d;
	

	@Given("Launch browser and Url")
	public void launch_browser_and_url() {
		driver = browserLaunch("https://adactinhotelapp.com/");
	   
	}
	@Given("Pass the username")
	public void pass_the_username() {
		a= new  AdactinPom(driver);
		sendkey(a.getUsername(), "VPavithra");
	   
	}
	@Given("Pass the password")
	public void pass_the_password() {
		a= new  AdactinPom(driver);
		sendkey(a.getPassword(), "pavi@10");
	   
	}
	@Then("click the login")
	public void click_the_login() {
		a= new  AdactinPom(driver);
		click(a.getLogin());
	}
	
	@Given("Select Location")
	public void select_location() {
		b= new  AdactinPomSearchHotel(driver);
		selectbyvisibletext_Dropdown(b.getSelectLocation(), "New York");
	   	}
	@Given("Select hotel")
	public void select_hotel() {
		b= new  AdactinPomSearchHotel(driver);
		selectbyvisibletext_Dropdown(b.getSelectHotel(),"Hotel Creek");  
	}
	@Given("Select Roomtype")
	public void select_roomtype() {
		b= new  AdactinPomSearchHotel(driver);
		selectbyvisibletext_Dropdown(b.getSelectRoomType(),"Double"); 
	}
	@Given("Select Number Of Room")
	public void select_number_of_room() {
		b= new  AdactinPomSearchHotel(driver);
		selectbyvalue_Dropdown(b.getNumberOfRoom(), "5");
	}
	@Given("Check In Date")
	public void check_in_date() { 
	b= new  AdactinPomSearchHotel(driver);
	clear(b.getCheckInDate());
	sendkey(b.getCheckInDate(),"22/12/2021");
	}
	@Given("Check Out Date")
	public void check_out_date() {
		b= new  AdactinPomSearchHotel(driver);
		clear(b.getCheckOutDate());
		sendkey(b.getCheckOutDate(),"23/12/2021");
	}
	@Given("Adult Per Room")
	public void adult_per_room() {
		b= new  AdactinPomSearchHotel(driver);
		selectbyvalue_Dropdown(b.getAdultPerRoom(), "3");
	   	}
	@Given("children Per Room")
	public void children_per_room() {
		b= new  AdactinPomSearchHotel(driver);
		selectbyvalue_Dropdown(b.getChildrenPerRoom(),"1");
	   	}
	@Then("Search")
	public void search() {
		b= new  AdactinPomSearchHotel(driver);
		click(b.getSearch());
	   	}
	@Given("Select The button")
	public void select_the_button() {
		c= new  AdactinPomNext(driver);
		click(c.getSelect());
	   
	}
	@Then("Continue")
	public void Continue() {
		c= new  AdactinPomNext(driver);
		click(c.getContinue());
	}
	
	@Given("First name")
	public void first_name() {
		d= new  AdactinPomBooking(driver);
		sendkey(d.getFistname(),"pavi");
	}
	@Given("Last Name")
	public void last_name() {
		d= new  AdactinPomBooking(driver);
		sendkey(d.getLastname(),"thra");

	}
	@Given("Billing Address")
	public void billing_address() {
		d= new  AdactinPomBooking(driver);
		sendkey(d.getBillingAddress(),"000zeroarea");
	}
	@Given("Credit Card No")
	public void credit_card_no() {
		d= new  AdactinPomBooking(driver);
		sendkey(d.getCreditCardno(), "1002003004005006"); 
	}
	@Given("Credit Card Type")
	public void credit_card_type() {
		d= new  AdactinPomBooking(driver);
		selectbyvisibletext_Dropdown(d.getselectCredittype(), "VISA");  
	}
	@Given("Select Month")
	public void select_month() {
		d= new  AdactinPomBooking(driver);
		selectbyvisibletext_Dropdown(d.getselectMonth(), "February");

	}
	@Given("Select Year")
	public void select_year() {
		d= new  AdactinPomBooking(driver);
		selectbyvisibletext_Dropdown(d.getselectYear(), "2020"); 
	}
	@Given("CVV No")
	public void cvv_no() {
		d= new  AdactinPomBooking(driver);
		sendkey(d.getCvvNum(), "123");  
	}
	@Then("Cancel")
	public void cancel() {
		d= new  AdactinPomBooking(driver);
		click(d.getCancel());   
	}
	@Then("Click Cancel")
	public void click_cancel() {
		c= new  AdactinPomNext(driver);
		click(c.getCancel());
		 
	}
	@Then("Reset")
	public void reset() {
		b= new  AdactinPomSearchHotel(driver);
		click(b.getReset());
	}

}

