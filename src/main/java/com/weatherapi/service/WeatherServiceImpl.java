package com.weatherapi.service;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weatherapi.dao.WeatherDAO;
import com.weatherapi.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService{
	
	@Autowired
	WeatherDAO wDAO;
	
	private String json;
	private Weather weather;

	@Override
	public Weather getWeatherDataCity(String city) throws IOException {

		return jsonParseCityWeather(city);
		
	}

	@Override
	public Weather getWeatherDataCityCountry(String city, String country) throws IOException {

		return jsonParseISOCityWeather(city, country);
		
	}
	
	public Weather jsonParseCityWeather(String city) throws IOException {
		
		this.json = this.wDAO.getWeatherDataCity(city);
		JSONObject obj = new JSONObject(this.json);
		this.weather.setCity(obj.getString("name"));
		
		return this.weather;
		
	}
	
	public Weather jsonParseISOCityWeather(String city, String country) throws IOException {
		
		this.json = this.wDAO.getWeatherDataCityCountry(city, country);
		JSONObject obj = new JSONObject(this.json);
		
		
		return this.weather;
		
	}
	
	public 

}
