package com.weatherapi.controller;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherapi.service.WeatherService;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController
public class WeatherAPIController {
	
	@Autowired
	WeatherService wService;
	
	@GetMapping("/{city}")
	public JSONObject getCurrentWeatherDataForCity(@PathVariable String city) throws IOException {
		
<<<<<<< HEAD
=======
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city)
			.get()
			.addHeader("x-rapidapi-key", "2e0f5e5587msh5b20c6d40614898p14e8aejsn9eec5fb064d8")
			.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
			.build();

		//ObjectMapper objMapper = new ObjectMapper();
		
		Response response = client.newCall(request).execute();
>>>>>>> c6d06c1... update
		
		JSONObject object = new JSONObject(response.body().string());
		
		//object = objMapper.readValue(response.body());
		
		return object;
		
		//return this.wService.getWeatherDataCity(city);
		
	}
	
	@GetMapping("/{city}/{country}")
	public JSONObject getCurrentWeatherDataForCityAndCountry(@PathVariable String city, @PathVariable String country) throws IOException {
		
		return this.wService.getWeatherDataCityCountry(city, country);
		
	}

}
