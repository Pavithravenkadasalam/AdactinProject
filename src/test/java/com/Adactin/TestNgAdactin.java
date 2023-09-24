package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNgAdactin extends AdactinBase {

	@Test
	private void runtest() {
		

		 WebDriver driver = browserLaunch("https://adactinhotelapp.com/");
		 AdactinPom a = new AdactinPom(driver);
		sendkey(a.getUsername(),"VPavithra");
		sendkey(a.getPassword(), "pavi@10");
		click(a.getLogin());
		
		AdactinPomSearchHotel b = new AdactinPomSearchHotel(driver);
		selectbyvisibletext_Dropdown(b.getSelectLocation(), "New York");
		selectbyvisibletext_Dropdown(b.getSelectHotel(),"Hotel Creek");
		selectbyvisibletext_Dropdown(b.getSelectRoomType(),"Double");
		selectbyvalue_Dropdown(b.getNumberOfRoom(), "5");
		clear(b.getCheckInDate());
		sendkey(b.getCheckInDate(),"22/12/2021");
		clear(b.getCheckOutDate());
		sendkey(b.getCheckOutDate(),"23/12/2021");
		selectbyvalue_Dropdown(b.getAdultPerRoom(), "3");
		selectbyvalue_Dropdown(b.getChildrenPerRoom(),"1");
		click(b.getSearch());
		
		AdactinPomNext c = new AdactinPomNext(driver);
		click(c.getSelect());
		click(c.getContinue());
		
		AdactinPomBooking d = new AdactinPomBooking(driver);
		sendkey(d.getFistname(),"pavi");
		sendkey(d.getLastname(),"thra");
		sendkey(d.getBillingAddress(),"000zeroarea");
		sendkey(d.getCreditCardno(), "1002003004005006");
		selectbyvisibletext_Dropdown(d.getselectCredittype(), "VISA");
		selectbyvisibletext_Dropdown(d.getselectMonth(), "February");
		selectbyvisibletext_Dropdown(d.getselectYear(), "2020");
		sendkey(d.getCvvNum(), "123");
		click(d.getCancel());
		
		AdactinPomNext e = new AdactinPomNext(driver);
		click(e.getCancel());
		AdactinPomSearchHotel f = new AdactinPomSearchHotel(driver);
		click(f.getReset());
		
		
	}

}
