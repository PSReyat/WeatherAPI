package com.weatherapi.service;

import java.io.IOException;

import com.weatherapi.model.Weather;

public interface WeatherService {
	
	public Weather getWeatherDataCity(String city) throws IOException;
	
	public Weather getWeatherDataCityCountry(String city, String country) throws IOException;

}
