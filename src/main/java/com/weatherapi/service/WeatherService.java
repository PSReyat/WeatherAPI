package com.weatherapi.service;

import java.io.IOException;

import com.weatherapi.model.FiveDayHourlyWeather;
import com.weatherapi.model.Weather;

public interface WeatherService {
	
	public Weather getWeatherDataCity(String city, String country) throws IOException;
	
	public FiveDayHourlyWeather getHourlyWeather(String city, String country) throws IOException;

}
