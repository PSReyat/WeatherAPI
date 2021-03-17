package com.weatherapi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
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
public class WeatherAPIController implements ErrorController{
	
	private static final String ERROR_PATH = "/error";
	
	@Autowired
	WeatherService wService;
	
	private List<String> days;
	private List<List<FiveDayHourlyWeather>> weatherData;
	
	@RequestMapping(value = ERROR_PATH)
	public String errorPage(Model model) {
		
		CountryCodes codes = new CountryCodes();
		
		model.addAttribute("codes", codes.getAllCountryCodes());
		
		return "weather_view";
		
	}
	
	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
	
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
			CountryCodes codes = new CountryCodes();
			model.addAttribute("error", true);
			model.addAttribute("codes", codes.getAllCountryCodes());
			return "weather_view";
		}
		
	}
	
	@GetMapping("/five_day/weather")
	public String getFiveDayForecast(
			@RequestParam("city") String city, 
			@RequestParam("country") String country, 
			Model model) throws IOException {
		
		city = city.substring(0, 1).toUpperCase() + city.substring(1);
		
		Map<String, List<FiveDayHourlyWeather>> fiveDay = this.wService.getHourlyWeather(city, country);
		
		if(!fiveDay.isEmpty()) {
			getDays(fiveDay);
			getDataForEachDay(fiveDay);
			model.addAttribute("city", city);
			model.addAttribute("days", this.days);
			model.addAttribute("weather_data", this.weatherData);
			
			return "five_day_forecast";
		}else {
			CountryCodes codes = new CountryCodes();
			model.addAttribute("error", true);
			model.addAttribute("codes", codes.getAllCountryCodes());
			
			return "weather_view";
		}
		
	}
	
	public void getDays(Map<String, List<FiveDayHourlyWeather>> fiveDay) {
		
		this.days = new ArrayList<>();
		
		for(String day : fiveDay.keySet()) {
			
			this.days.add(day);
			
		}
		
	}
	
	public void getDataForEachDay(Map<String, List<FiveDayHourlyWeather>> fiveDay) {
		
		this.weatherData = new ArrayList<>();
		
		for(String list : fiveDay.keySet()) {
			
			this.weatherData.add(fiveDay.get(list));
			
		}
		
	}


}
