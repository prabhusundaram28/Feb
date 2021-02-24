package com.adactinPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotel extends BaseClass {
	
	public  SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement rooms;
	
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;

	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	
	@FindBy(id="Submit")
	private WebElement submitBtn;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}
	
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

}
