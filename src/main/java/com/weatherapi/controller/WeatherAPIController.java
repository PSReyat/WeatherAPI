package com.weatherapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapi.countrycodes.CountryCodes;
import com.weatherapi.service.WeatherService;

@RestController
public class WeatherAPIController {
	
	@Autowired
	WeatherService wService;
	
	@GetMapping("/{city}")
	public String getCurrentWeatherDataForCity(@PathVariable String city) throws IOException {
		
		return this.wService.getWeatherDataCity(city);
		
	}
	
	@GetMapping("/{city}/{country}")
	public String getCurrentWeatherDataForCityAndCountry(@PathVariable String city, @PathVariable String country) throws IOException {
		
		CountryCodes codes = new CountryCodes();
		
		String countryCode = codes.getCountryCode(country);
		
		return this.wService.getWeatherDataCityCountry(city, countryCode);
		
	}
	
}
