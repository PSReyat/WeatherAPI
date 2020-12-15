package com.weatherapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weatherapi.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherAPIController {
	
	@Autowired
	WeatherService wService;
	
	@RequestMapping("/")
	public String getWeatherView() {
	
		System.out.println("Weather View");
		
		return "weather_view";
		
	}
	
	@GetMapping("/weather/stuff")
	public String getCurrentWeatherDataForCity(@RequestParam("city") String city) throws IOException {
		
		this.wService.getWeatherDataCity(city);
		
		return "weather_for_city";
		
	}
	
	@GetMapping("/weather")
	public String getCurrentWeatherDataForCityAndCountry(
			@RequestParam("city") String city, 
			@RequestParam("country") String country) throws IOException {
		
		this.wService.getWeatherDataCityCountry(city, country);
		
		return "weather_for_city";
		
	}
	
}
