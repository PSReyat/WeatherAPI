package com.weatherapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/weather/{city}")
	public String getCurrentWeatherDataForCity(@PathVariable @RequestParam("city") String city) throws IOException {
		
		System.out.println("First mapping activated.");
		
		System.out.println(city);
		
		this.wService.getWeatherDataCity(city);
		
		return "weather_for_city";
		
	}
	
	@GetMapping("/weather/{city}/{country}")
	public String getCurrentWeatherDataForCityAndCountry(
			@PathVariable @RequestParam("city") String city, 
			@PathVariable @RequestParam("country") String country) throws IOException {
		
		System.out.println("Second mapping activated.");
		
		System.out.println(city + " " + country);
		
		this.wService.getWeatherDataCityCountry(city, country);
		
		return "weather_for_city";
		
	}
	
}
