package com.example.hotelDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO{

		@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
		//return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
		//return null;
	}

	@Override
	public List<Hotel> getByType(String type) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel: showHotelList()) {
			if(hotel.getType().equals(type))
				newHotelList.add(hotel);
		}
		return newHotelList;
		//return null;
	}

	@Override
	public Hotel getByName(String name) {
		// TODO Auto-generated method stub
		for(Hotel hotel:showHotelList()) {
			if(hotel.getName()== name)
				return hotel;
		}
		return null;
	//return null;
	}
	private List<Hotel> showHotelList(){
		return Arrays.asList(
				new Hotel("Pola","Ballari","KAR","Indian"),
				new Hotel("Bala","Mysore","KAR","Italian"),
				new Hotel("RRR","Banglore","TN","Indian"),
				new Hotel("Royal","Banglore","TN","Indian")
				);
	}

}
