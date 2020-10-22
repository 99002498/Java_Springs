package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelDAO.HotelDAO;
import com.example.model.Hotel;
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelDAO hotelDAO;
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAO.getAllHotels();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCity(city);
	}

	@Override
	public List<Hotel> getByType(String type) {
		// TODO Auto-generated method stub
		return hotelDAO.getByType(type);
	}

	@Override
	public Hotel getByName(String name) {
		// TODO Auto-generated method stub
		return hotelDAO.getByName(name);
	}
	

	

	


}
