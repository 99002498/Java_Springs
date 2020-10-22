package com.hotelapp.service;

import java.util.List;

import com.hotelapp.dao.HotelDAO;
import com.hotelapp.dao.HotelDAOImpl;
import com.hotelapp.model.Hotel;

public class HotelServiceImpl implements HotelService {

	HotelDAO hotelDAO = new HotelDAOImpl();
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelDAO.getAllHotels();
	}

	@Override
	public List<Hotel> getByCity(String hotelCity) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCity(hotelCity);
	}

	@Override
	public List<Hotel> getByCusine(String hotelCusine) {
		// TODO Auto-generated method stub
		return hotelDAO.getByCusine(hotelCusine);
	}

	@Override
	public Hotel getById(int hotelId) {
		// TODO Auto-generated method stub
		return hotelDAO.getById(hotelId);
	}

}
