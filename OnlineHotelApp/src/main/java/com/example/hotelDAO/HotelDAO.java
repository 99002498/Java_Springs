package com.example.hotelDAO;

import java.util.List;

import com.example.model.Hotel;

public interface HotelDAO {
	
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String city);
	List<Hotel> getByType(String type);
	Hotel getByName(String name); 

}
