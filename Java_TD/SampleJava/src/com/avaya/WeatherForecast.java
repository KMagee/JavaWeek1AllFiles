package com.avaya;

public class WeatherForecast extends WeatherReport implements IWeather {

    public static void main(String[] arguments) {
        WeatherForecast forecast = new WeatherForecast();
        forecast.getWeather();
        forecast.showWeather();
    }

    public void getWeather(){
        System.out.println("Forecast:");
        super.getWeather();
    }

    public void showWeather(){
        System.out.println("Forecast:");
        super.showWeather();
    }

}
