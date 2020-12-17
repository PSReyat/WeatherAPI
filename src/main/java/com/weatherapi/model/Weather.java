package com.weatherapi.model;

public class Weather {

	private String city;
	private String country;
	private double timeZone;
	private double temperature;
	private String weather;
	private String weatherDesc;
	private double tempFeelsLike;
	private double tempMin;
	private double tempMax;
	private double pressure;
	private double humidity;

	public Weather() {}
	
	public double getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(double timeZone) {
		this.timeZone = timeZone;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getTempFeelsLike() {
		return tempFeelsLike;
	}

	public void setTempFeelsLike(double tempFeelsLike) {
		this.tempFeelsLike = tempFeelsLike;
	}

	public double getTempMin() {
		return tempMin;
	}

	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}

	public double getTempMax() {
		return tempMax;
	}

	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWeatherDesc() {
		return weatherDesc;
	}

	public void setWeatherDesc(String weatherDesc) {
		this.weatherDesc = weatherDesc;
	}

}
