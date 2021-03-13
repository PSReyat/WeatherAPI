package com.weatherapi.dao;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Repository
public class WeatherDAOImpl implements WeatherDAO{
	
	private static final String RAPID_API_KEY = "2e0f5e5587msh5b20c6d40614898p14e8aejsn9eec5fb064d8";
	
	//Get current weather for any given city.
	@Override
	public String getWeatherDataCity(String city, String country) throws IOException {

		return connectAPICity(city, country);
		
	}
	
	//Get a five day forecast in 3 hour increments for any given city.
	@Override
	public String getHourlyWeatherData(String city, String country) throws IOException {
		
		return connectFiveDayForecast(city, country);
		
	}
	
	//Gets weather data for current time
	private String connectAPICity(String city, String country) throws IOException {
		
		OkHttpClient client = new OkHttpClient();
		Request request;
		
		if(country.isEmpty()) {
			request = new Request.Builder()
				.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city)
				.get()
				.addHeader("x-rapidapi-key", RAPID_API_KEY)
				.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
				.build();
		}else {
			request = new Request.Builder()
				.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city + "%2C" + country)
				.get()
				.addHeader("x-rapidapi-key", RAPID_API_KEY)
				.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
				.build();
		}

		return getResponse(client, request);
		
	}
	
	private String connectFiveDayForecast(String city, String country) throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://community-open-weather-map.p.rapidapi.com/forecast?q=" + city + "%2C%20" + country)
			.get()
			.addHeader("x-rapidapi-key", RAPID_API_KEY)
			.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
			.build();

		return getFiveDayResponse(client, request);
		
	}
	
	private String getFiveDayResponse(OkHttpClient client, Request request) throws IOException {
		
		Response response = client.newCall(request).execute();
		
		String getResponseBody = response.body().string();
		
		return getResponseBody;
		
	}
	
	private String getResponse(OkHttpClient client, Request request) throws IOException {
		
		Response response = client.newCall(request).execute();
		
		String getResponseBody = response.body().string();
		
		return getResponseBody;
		
	}

}
