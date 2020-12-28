package com.weatherapi.dao;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Repository
public class WeatherDAOImpl implements WeatherDAO{

	@Override
	public String getWeatherDataCity(String city, String country) throws IOException {

		return connectAPICity(city, country);
		
	}
	
	public String connectAPICity(String city, String country) throws IOException {
		
		OkHttpClient client = new OkHttpClient();
		Request request;
		
		if(country.isEmpty()) {
			request = new Request.Builder()
				.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city)
				.get()
				.addHeader("x-rapidapi-key", "	[OMITTED]")
				.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
				.build();
		}else {
			request = new Request.Builder()
				.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city + "%2C" + country)
				.get()
				.addHeader("x-rapidapi-key", "[OMITTED]")
				.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
				.build();
		}

		return getResponse(client, request);
		
	}
	
	public String connectFiveDayForecast(String city, String country) throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://community-open-weather-map.p.rapidapi.com/forecast?q=" + city + "%2C%20" + country)
			.get()
			.addHeader("x-rapidapi-key", "[OMITTED]")
			.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
			.build();

		return getFiveDayResponse(client, request);
		
	}
	
	public String getFiveDayResponse(OkHttpClient client, Request request) throws IOException {
		
		Response response = client.newCall(request).execute();
		
		String getResponseBody = response.body().string();
		
		return getResponseBody;
		
	}
	
	public String getResponse(OkHttpClient client, Request request) throws IOException {
		
		Response response = client.newCall(request).execute();
		
		String getResponseBody = response.body().string();
		
		return getResponseBody;
		
	}

}
