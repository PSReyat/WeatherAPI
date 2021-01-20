package com.weatherapi.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.weatherapi.model.FiveDayHourlyWeather;
import com.weatherapi.model.Weather;

public interface WeatherService {
	
	public Weather getWeatherDataCity(String city, String country) throws IOException;
	
	public Map<String, List<FiveDayHourlyWeather>> getHourlyWeather(String city, String country) throws IOException;

}
