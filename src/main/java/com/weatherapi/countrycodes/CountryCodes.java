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
	        countries.put(l.getDisplayCountry(), iso);
	    }

	}
	
	public String getCountryCode(String country) {
		
		return this.countries.get(country);
		
	}

}
