package com.example.service;

import java.util.List;

import com.example.model.Hotel;

public interface HotelService {
	
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String city);
	List<Hotel> getByType(String type);
	Hotel getByName(String name);     //this will return only 1 Hotel
	

}
