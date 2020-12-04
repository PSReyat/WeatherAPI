package com.weatherapi.dao;

import java.io.IOException;

import org.json.JSONObject;

public interface WeatherDAO {
	
	public JSONObject getWeatherDataCity(String city) throws IOException;
	
	public JSONObject getWeatherDataCityCountry(String city, String country) throws IOException;
	
}
