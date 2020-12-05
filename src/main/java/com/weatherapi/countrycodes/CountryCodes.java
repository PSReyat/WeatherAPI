package com.weatherapi.countrycodes;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountryCodes {
	
	private Map<String, String> countries;
	
	public CountryCodes() {
		
		this.countries = new HashMap<>();
	    for (String iso : Locale.getISOCountries()) {
	        Locale l = new Locale("", iso);
	        countries.put(l.getDisplayCountry().toLowerCase(), iso.toLowerCase());
	    }

	}
	
	public String getCountryCode(String country) {
		
		System.out.println(this.countries.get(country));
		
		return this.countries.get(country);
		
	}

}
