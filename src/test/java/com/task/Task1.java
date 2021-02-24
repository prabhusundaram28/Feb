package com.task;



import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.adactinPages.BookHotel;
import com.adactinPages.LoginPage;
import com.adactinPages.SearchHotel;
import com.adactinPages.SelectHotel;
import com.base.BaseClass;

public class Task1 extends BaseClass {
	@Parameters({"name","password"})
	@Test
	private  void tc0(String user,String pass) throws IOException, InterruptedException {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/index.php");
		
		LoginPage loginpage=new LoginPage();
		
		fill(loginpage.getUserName(), user );
		excel("D:\\Workspace\\TestNg\\Excel\\Excel.xlsx", "AdactinDatas", user, 0, 0);
		getConsole(loginpage.getUserName());
		
		fill(loginpage.getPassword(), pass);
		excel("D:\\Workspace\\TestNg\\Excel\\Excel.xlsx", "AdactinDatas", pass, 0, 1);
		getConsole(loginpage.getPassword());
		Thread.sleep(2000);
		btnClick(loginpage.getLogin());	
	}
	@Parameters({"location","hotel","roomType","noOfRooms","adultsPerRoom","childPerRoom"})
	@Test
	private void tc1(String location,String hotel,String roomType,String noOfRooms,String adultsPerRoom,String ChildPerRoom) throws IOException {
		SearchHotel searchHotel=new SearchHotel();
		
		dropDown(searchHotel.getLocation(),location );
		//excel("AdactinDatas", location, 0, 2);
		getConsole(searchHotel.getLocation());
		
		dropDown(searchHotel.getHotels(),hotel );
		//excel("AdactinDatas", hotel, 0, 3);
		getConsole(searchHotel.getHotels());
		
		dropDown(searchHotel.getRooms(), roomType);
		//excel("AdactinDatas", roomType, 0, 4);
		getConsole(searchHotel.getRooms());
		
		dropDown(searchHotel.getNumberOfRooms(),noOfRooms );
		//excel("AdactinDatas", noOfRooms, 0, 5);
		getConsole(searchHotel.getNumberOfRooms());
		
		dropDown(searchHotel.getAdultPerRoom(),adultsPerRoom );
		//excel("AdactinDatas", adultsPerRoom, 0, 6);
		getConsole(searchHotel.getAdultPerRoom());
		
		dropDown(searchHotel.getChildPerRoom(),ChildPerRoom );
		//excel("AdactinDatas", ChildPerRoom, 0, 7);
		getConsole(searchHotel.getChildPerRoom());
		
		btnClick(searchHotel.getSubmitBtn());
	}
	@Test
	private void tc2() {
		SelectHotel selectHotel=new SelectHotel();
		btnClick(selectHotel.getRadioBtn());
		btnClick(selectHotel.getContinueBtn());

	}
	@Parameters({"firstName","lastNmae","address","creditCardNumber","creditCardType","expMonth","expYear","cvvNumber"})
	@Test
	private void tc3(String fName,String lName,String address,String creditCardNumber,String creditCardType,String expMonth,String expYear,String cvvNumber) throws IOException, InterruptedException {
		BookHotel bookHotel=new BookHotel();
		fill(bookHotel.getFirstName(), fName);
		//excel("AdactinDatas", fName, 1, 9);
		getConsole(bookHotel.getFirstName());
		
		fill(bookHotel.getLastName(), lName);
		//excel("AdactinDatas", lName, 1, 10);
		getConsole(bookHotel.getLastName());
		
		fill(bookHotel.getAddress(), address);
		//excel("AdactinDatas", address, 1,11);
		getConsole(bookHotel.getAddress());
		
		fill(bookHotel.getCreditCardNumber(), creditCardNumber);
		//excel("AdactinDatas", creditCardNumber, 1,12);
		getConsole(bookHotel.getCreditCardNumber());
		
		fill(bookHotel.getCreditCardType(), creditCardType);
		//excel("AdactinDatas", creditCardType, 1, 13);
		getConsole(bookHotel.getCreditCardType());
		
		fill(bookHotel.getExpireMonth(), expMonth);
		//excel("AdactinDatas", expMonth, 1, 14);
		getConsole(bookHotel.getExpireMonth());
		
		fill(bookHotel.getExpireYear(), expYear);
		//excel("AdactinDatas", expYear, 1, 15);
		getConsole(bookHotel.getExpireYear());
		
		fill(bookHotel.getCvvNumber(), cvvNumber);
		//excel("AdactinDatas", cvvNumber, 1, 16);
		getConsole(bookHotel.getCvvNumber());
		
		btnClick(bookHotel.getBookNow());
		
		Thread.sleep(5000);
		
		getConsole(bookHotel.getOrderNo());
		
		
	}
	
	
	

}
