package com.weatherapi.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weatherapi.countrycodes.CountryCodes;
import com.weatherapi.model.FiveDayHourlyWeather;
import com.weatherapi.model.Weather;
import com.weatherapi.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherAPIController {
	
	@Autowired
	WeatherService wService;
	
	//Sets the search page and loads the ISO codes table.
	@RequestMapping("/")
	public String getWeatherView(Model model, CountryCodes codes) {
		
		model.addAttribute("codes", codes.getAllCountryCodes());
		
		return "weather_view";
		
	}
	
	//Allows you to search for weather in city + country (ISO) or just city alone.
	@GetMapping("/current/weather")
	public String getCurrentWeatherDataForCityAndCountry(
			@RequestParam("city") String city, 
			@RequestParam("country") String country, 
			Model model) throws IOException {
		
		Weather weather;
		weather = this.wService.getWeatherDataCity(city, country);
		
		if(weather != null) {
			model.addAttribute("weather", weather);
			
			return "weather_for_city";
		}else {
			model.addAttribute("error", true);
		}
		
		return "weather_view";
		
	}
	
	@GetMapping("/five_day/weather")
	public String getFiveDayForecast(
			@RequestParam("city") String city, 
			@RequestParam("country") String country, 
			Model model) throws IOException {
		
		FiveDayHourlyWeather fiveDay;
		fiveDay = this.wService.getHourlyWeather(city, country);
		
		model.addAttribute("five_day", fiveDay);
		
		return "five_day_forecast";
		
	}
	
}
