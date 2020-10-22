package com.example.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Hotel;
import com.example.service.HotelService;

public class HotelController {
	
	@Autowired
	HotelService hotelservice;
	@GetMapping("/Hotels")
	public List<Hotel> showAllHotels(){
		return hotelservice.getAllHotels();
	}
	
	@GetMapping("/Hotels-by-city/{author}")
	public List<Hotel> showHotelsByCity(@PathVariable("city")String city){
		return hotelservice.getByCity(city);
	}
	
	@GetMapping("/Hotels-by-category/{category}")
	public List<Hotel> showHotelsByCategory(@PathVariable("type")String type){
		return hotelservice.getByType(type);
	}
	@GetMapping("/Hotels-by-Id/{Hotelname}")
	public Hotel showHotelsById(@PathVariable("name")String name){
		return hotelservice.getByName(name);
	}

}
