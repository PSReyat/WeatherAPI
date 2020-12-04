package com.weatherapi.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weatherapi.dao.WeatherDAO;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	@Autowired
	WeatherDAO wDAO;

	@Override
	public String getWeatherDataCity(String city) throws IOException {

		return this.wDAO.getWeatherDataCity(city);
		
	}

	@Override
	public String getWeatherDataCityCountry(String city, String country) throws IOException {

		return this.wDAO.getWeatherDataCityCountry(city, country);
		
	}

}
