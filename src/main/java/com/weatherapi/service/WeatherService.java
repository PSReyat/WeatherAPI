package com.weatherapi.service;

import java.io.IOException;

import org.json.JSONObject;

public interface WeatherService {
	
	public JSONObject getWeatherDataCity(String city) throws IOException;
	
	public JSONObject getWeatherDataCityCountry(String city, String country) throws IOException;

}
