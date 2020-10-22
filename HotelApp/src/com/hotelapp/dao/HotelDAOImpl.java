package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hotelapp.model.Hotel;

public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}

	@Override
	public List<Hotel> getByCity(String hotelCity) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getHotelCusine().equals(hotelCity))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public List<Hotel> getByCusine(String hotelCusine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getHotelCusine().equals(hotelCusine))
				newHotelList.add(hotel);
		}
		return newHotelList;
		
	}

	@Override
	public Hotel getById(int hotelId) {
		// TODO Auto-generated method stub
		
		for(Hotel hotel:showHotelList()) {
			if(hotel.getHoteId()== hotelId)
				return hotel;
		}
		return null;
	}
	
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel(1,"Pola","Ballari","Indian"),
				new Hotel(2,"Bala","Mysore","Italian"),
				new Hotel(3,"RRR","Banglore","Indian"),
				new Hotel(4,"Royal","Banglore","Indian")
				);
	}

}
