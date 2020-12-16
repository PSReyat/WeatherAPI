package com.weatherapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weatherapi.countrycodes.CountryCodes;
import com.weatherapi.model.Weather;
import com.weatherapi.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherAPIController {
	
	@Autowired
	WeatherService wService;
	
	@RequestMapping("/")
	public String getWeatherView(Model model, CountryCodes codes) {
		
		model.addAttribute("codes", codes.getAllCountryCodes());
		
		return "weather_view";
		
	}
	
	@GetMapping("/weather")
	public String getCurrentWeatherDataForCityAndCountry(
			@RequestParam("city") String city, 
			@RequestParam("country") String country, Model model, Weather weather) throws IOException {
		
		if(country.isEmpty()) {
			
			weather = this.wService.getWeatherDataCity(city);
			
		}else {
			
			weather = this.wService.getWeatherDataCityCountry(city, country);
			
		}
		
		return "weather_for_city";
		
	}
	
}
