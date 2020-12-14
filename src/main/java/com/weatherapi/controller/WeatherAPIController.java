package com.weatherapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		
		return "weather_view";
		
	}
	
	@GetMapping("/weather/{city}")
	public String getCurrentWeatherDataForCity(@PathVariable @RequestParam String city, Model model) throws IOException {
		
		return this.wService.getWeatherDataCity(city);
		
	}
	
	@GetMapping("/weather/{city}/{country}")
	public String getCurrentWeatherDataForCityAndCountry(@PathVariable @RequestParam String city, @PathVariable @RequestParam String country) throws IOException {
		
		return this.wService.getWeatherDataCityCountry(city, country);
		
	}
	
}
