package com.weatherapi.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;

@RestController
public class WeatherAPIController {
	
	@GetMapping("/{city}")
	public void getCurrentWeatherData(@PathVariable String city) {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://community-open-weather-map.p.rapidapi.com/weather?q=London%2Cuk&lat=0&lon=0&callback=test&id=2172797&lang=null&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html")
			.get()
			.addHeader("x-rapidapi-key", "2e0f5e5587msh5b20c6d40614898p14e8aejsn9eec5fb064d8")
			.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
			.build();

		Response response = client.newCall(request).execute();
		
	}

}
