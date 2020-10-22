package com.hotelapp.dao;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelDAO {
	
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String hotelCity);
	List<Hotel> getByCusine(String hotelCusine);
	Hotel getById(int hotelId);

}
