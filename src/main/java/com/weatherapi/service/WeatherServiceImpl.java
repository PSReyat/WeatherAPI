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
	public Weather getWeatherDataCity(String city, String country) throws IOException {
		
		return jsonParseCityWeather(city, country);
		
	}
	
	//Retrieves weather data in JSON format and assigns it to a String object.
	public Weather jsonParseCityWeather(String city, String country) throws IOException {
		
		this.json = this.wDAO.getWeatherDataCity(city, country);
		setWeatherParameters();
		
		return this.weather;
		
	}
	
	//Parses the JSONOBject and retrieves the necessary data.
	public void setWeatherParameters() {
		
		//Parsing JSON object and retrieving relevant information.
		JSONObject obj = new JSONObject(this.json);
		
		String name = obj.getString("name");
		String country = obj.getJSONObject("sys").getString("country");
		double humidity = obj.getJSONObject("main").getInt("humidity");
		double pressure = obj.getJSONObject("main").getInt("pressure");
		double temperature = obj.getJSONObject("main").getDouble("temp");
		double tempFeelsLike = obj.getJSONObject("main").getDouble("feels_like");
		double tempMax = obj.getJSONObject("main").getDouble("temp_max");
		double tempMin = obj.getJSONObject("main").getDouble("temp_min");
		double timeZone = obj.getDouble("timezone");
		String weather = obj.getJSONArray("weather").getJSONObject(0).getString("main");
		String weatherDesc = obj.getJSONArray("weather").getJSONObject(0).getString("description");
		
		//Creating the Weather object
		this.weather = new Weather();
		
		//Setting the Weather object
		this.weather.setCity(name);
		this.weather.setCountry(country);
		this.weather.setHumidity(humidity);
		this.weather.setPressure(pressure);
		this.weather.setTemperature(temperature);
		this.weather.setTempFeelsLike(tempFeelsLike);
		this.weather.setTempMax(tempMax);
		this.weather.setTempMin(tempMin);
		this.weather.setTimeZone(timeZone);
		this.weather.setWeather(weather);
		this.weather.setWeatherDesc(weatherDesc);
		
	}

}
