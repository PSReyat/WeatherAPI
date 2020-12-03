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
		
		
	}

}
