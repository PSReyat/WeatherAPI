/*
 * Used Joda-Time library
 * Used JSTL
 */
package com.weatherapi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	
	private List<String> days;
	
	private List<FiveDayHourlyWeather> day1;
	private List<FiveDayHourlyWeather> day2;
	private List<FiveDayHourlyWeather> day3;
	private List<FiveDayHourlyWeather> day4;
	private List<FiveDayHourlyWeather> day5;
	
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
		
		city = city.substring(0, 1).toUpperCase() + city.substring(1);
		
		Map<String, List<FiveDayHourlyWeather>> fiveDay;
		fiveDay = this.wService.getHourlyWeather(city, country);
		getDays(fiveDay);
		
		model.addAttribute("five_day", fiveDay);
		model.addAttribute("city", city);
		model.addAttribute("days", this.days);
		
		return "five_day_forecast";
		
	}
	
	public void getDays(Map<String, List<FiveDayHourlyWeather>> fiveDay) {
		
		this.days = new ArrayList<>();
		
		for(String day : fiveDay.keySet()) {
			
			this.days.add(day);
			
		}
		
	}
	
}
