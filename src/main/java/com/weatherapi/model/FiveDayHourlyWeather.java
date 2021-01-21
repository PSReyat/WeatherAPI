package com.weatherapi.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FiveDayHourlyWeather {

	private static final Double ABSOLUTE_TEMPERATURE_CONSTANT = 273.15;
	private DecimalFormat df;
	
	private String day;
	private String city;
	private String time;
	private String country;
	private String countryISOCode;
	private double temperature;
	private String weather;
	private String weatherDesc;
	private double tempMin;
	private double tempMax;
	private double pressure;
	private double humidity;

	public FiveDayHourlyWeather() {
		this.df = new DecimalFormat("#.00");
		this.df.setRoundingMode(RoundingMode.CEILING);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public DecimalFormat getDf() {
		return df;
	}

	public void setDf(DecimalFormat df) {
		this.df = df;
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

	public String getCountryISOCode() {
		return countryISOCode;
	}

	public void setCountryISOCode(String countryISOCode) {
		this.countryISOCode = countryISOCode;
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

	public double getTemperature() {
		this.df.format(this.temperature);
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = Double.parseDouble(String.format("%.2f", temperature - ABSOLUTE_TEMPERATURE_CONSTANT));
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

}
