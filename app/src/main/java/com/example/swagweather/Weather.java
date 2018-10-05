package com.example.swagweather;

import com.example.swagweather.gson.AQI;
import com.example.swagweather.gson.Basic;
import com.example.swagweather.gson.Forecast;
import com.example.swagweather.gson.Now;
import com.example.swagweather.gson.Suggestion;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
