package com.weatherapi.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Weather {
	
	private static final Double ABSOLUTE_TEMPERATURE_CONSTANT = 273.15;
	private static final Integer CONVERT_SECONDS_TO_HOURS = 3600;
	
	private DecimalFormat df;

	private String city;
	private String country;
	private String countryISOCode;
	private double timeZone;
	private double temperature;
	private String weather;
	private String weatherDesc;
	private double tempFeelsLike;
	private double tempMin;
	private double tempMax;
	private double pressure;
	private double humidity;

	public Weather() {
		this.df = new DecimalFormat("#.00");
		this.df.setRoundingMode(RoundingMode.CEILING);
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public double getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(double timeZone) {
		this.timeZone = timeZone/CONVERT_SECONDS_TO_HOURS;
	}

	public double getTemperature() {
		this.df.format(this.temperature);
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = Double.parseDouble(String.format("%.2f", temperature - ABSOLUTE_TEMPERATURE_CONSTANT));
	}

	public double getTempFeelsLike() {
		this.df.format(this.tempFeelsLike);
		return tempFeelsLike;
	}

	public void setTempFeelsLike(double tempFeelsLike) {
		this.tempFeelsLike = Double.parseDouble(String.format("%.2f", tempFeelsLike - ABSOLUTE_TEMPERATURE_CONSTANT));
	}

	public double getTempMin() {
		this.df.format(this.tempMin);
		return tempMin;
	}

	public void setTempMin(double tempMin) {
		this.tempMin = Double.parseDouble(String.format("%.2f", tempMin - ABSOLUTE_TEMPERATURE_CONSTANT));
	}

	public double getTempMax() {
		this.df.format(this.tempMax);
		return tempMax;
	}

	public void setTempMax(double tempMax) {
		this.tempMax = Double.parseDouble(String.format("%.2f", tempMax - ABSOLUTE_TEMPERATURE_CONSTANT));
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

	public String getCountryISOCode() {
		return countryISOCode;
	}

	public void setCountryISOCode(String country) {
		this.countryISOCode = country;
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
