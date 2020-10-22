package com.hotelapp.model;

public class Hotel {

	Integer hoteId;
	String hotelName;
	String hotelCity;
	String hotelCusine;
	
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(Integer hoteId, String hotelName, String hotelCity, String hotelCusine) {
		super();
		this.hoteId = hoteId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelCusine = hotelCusine;
	}
	public Integer getHoteId() {
		return hoteId;
	}
	public void setHoteId(Integer hoteId) {
		this.hoteId = hoteId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getHotelCusine() {
		return hotelCusine;
	}
	public void setHotelCusine(String hotelCusine) {
		this.hotelCusine = hotelCusine;
	}
	@Override
	public String toString() {
		return "Hotel [hoteId=" + hoteId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity + ", hotelCusine="
				+ hotelCusine + "]";
	}
	
	
}
