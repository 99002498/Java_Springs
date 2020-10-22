package com.hotelapp.client;

import java.util.List;


import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.HotelServiceImpl;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelService hotelservice = new HotelServiceImpl();
		List<Hotel> hotellist =hotelservice.getAllHotels();
		for(Hotel H:hotellist) {
			System.out.println(H);
		}

	}

}
