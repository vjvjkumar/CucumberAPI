package com.pim.migration.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public  class WeatherResponse {
    public final Coord coord;
    public final Weather weather[];
    public final String base;
    public final Main main;
    public final long visibility;
    public final Wind wind;
    public final Clouds clouds;
    public final long dt;
    public final Sys sys;
    public final long id;
    public final String name;
    public final long cod;

    @JsonCreator
    public WeatherResponse(@JsonProperty("coord") Coord coord, @JsonProperty("weather") Weather[] weather, @JsonProperty("base") String base, @JsonProperty("main") Main main, @JsonProperty("visibility") long visibility, @JsonProperty("wind") Wind wind, @JsonProperty("clouds") Clouds clouds, @JsonProperty("dt") long dt, @JsonProperty("sys") Sys sys, @JsonProperty("id") long id, @JsonProperty("name") String name, @JsonProperty("cod") long cod){
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public static final class Coord {
        public final double lon;
        public final double lat;

        @JsonCreator
        public Coord(@JsonProperty("lon") double lon, @JsonProperty("lat") double lat){
            this.lon = lon;
            this.lat = lat;
        }
    }

    public static final class Weather {
        public final long id;
        public final String main;
        public final String description;
        public final String icon;

        @JsonCreator
        public Weather(@JsonProperty("id") long id, @JsonProperty("main") String main, @JsonProperty("description") String description, @JsonProperty("icon") String icon){
            this.id = id;
            this.main = main;
            this.description = description;
            this.icon = icon;
        }
    }

    public static final class Main {
        public final double temp;
        public final long pressure;
        public final long humidity;
        public final double temp_min;
        public final double temp_max;

        @JsonCreator
        public Main(@JsonProperty("temp") double temp, @JsonProperty("pressure") long pressure, @JsonProperty("humidity") long humidity, @JsonProperty("temp_min") double temp_min, @JsonProperty("temp_max") double temp_max){
            this.temp = temp;
            this.pressure = pressure;
            this.humidity = humidity;
            this.temp_min = temp_min;
            this.temp_max = temp_max;
        }
    }

    public static final class Wind {
        public final double speed;
        public final long deg;

        @JsonCreator
        public Wind(@JsonProperty("speed") double speed, @JsonProperty("deg") long deg){
            this.speed = speed;
            this.deg = deg;
        }
    }

    public static final class Clouds {
        public final long all;

        @JsonCreator
        public Clouds(@JsonProperty("all") long all){
            this.all = all;
        }
    }

    public static final class Sys {
        public final long type;
        public final long id;
        public final double message;
        public final String country;
        public final long sunrise;
        public final long sunset;

        @JsonCreator
        public Sys(@JsonProperty("type") long type, @JsonProperty("id") long id, @JsonProperty("message") double message, @JsonProperty("country") String country, @JsonProperty("sunrise") long sunrise, @JsonProperty("sunset") long sunset){
            this.type = type;
            this.id = id;
            this.message = message;
            this.country = country;
            this.sunrise = sunrise;
            this.sunset = sunset;
        }
    }

	public Coord getCoord() {
		return coord;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public String getBase() {
		return base;
	}

	public Main getMain() {
		return main;
	}

	public long getVisibility() {
		return visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public long getDt() {
		return dt;
	}

	public Sys getSys() {
		return sys;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getCod() {
		return cod;
	}
    
    
}