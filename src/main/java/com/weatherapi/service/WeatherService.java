package com.weatherapi.service;

import java.io.IOException;

public interface WeatherService {
	
	public String getWeatherDataCity(String city) throws IOException;
	
	public String getWeatherDataCityCountry(String city, String country) throws IOException;

}
