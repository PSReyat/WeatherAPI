package com.weatherapi.dao;

import java.io.IOException;

import org.springframework.stereotype.Repository;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Repository
public class WeatherDAOImpl implements WeatherDAO{

	@Override
	public String getWeatherDataCity(String city) throws IOException {

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city)
			.get()
			.addHeader("x-rapidapi-key", "2e0f5e5587msh5b20c6d40614898p14e8aejsn9eec5fb064d8")
			.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
			.build();

		Response response = client.newCall(request).execute();
		
		String getResponseBody = response.body().toString();
		
		return getResponseBody;
		
	}

	@Override
	public String getWeatherDataCityCountry(String city, String country) throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
			.url("https://community-open-weather-map.p.rapidapi.com/weather?q=" + city + "%2C" + country)
			.get()
			.addHeader("x-rapidapi-key", "2e0f5e5587msh5b20c6d40614898p14e8aejsn9eec5fb064d8")
			.addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
			.build();

		Response response = client.newCall(request).execute();
		
		String getResponseBody = response.body().string();
		
		return getResponseBody;
		
	}

}
