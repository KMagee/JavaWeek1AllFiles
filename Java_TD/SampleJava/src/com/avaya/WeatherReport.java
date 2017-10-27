package com.avaya;

public class WeatherReport implements IWeather {

    public String city = "Galway";
    public String country = "ie";

    public static void main(String[] arguments){
        WeatherReport report = new WeatherReport();
        report.getWeather();
        report.showWeather();
    }


    public void getWeather(){
        System.out.println("Contacting weather server...");
    }

    public void showWeather(){
        System.out.println("Weather in " + city + " in " + country + " is cloudy, 12 degrees");
    }



}

