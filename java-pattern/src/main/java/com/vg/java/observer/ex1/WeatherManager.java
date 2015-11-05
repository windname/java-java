package com.vg.java.observer.ex1;

import java.util.Observable;

public class WeatherManager extends Observable {
	private String weather;

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
		setChanged();
		notifyObservers();
	}

}
