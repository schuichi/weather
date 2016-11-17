package sample.model;

import java.time.LocalDateTime;

/**
 * Created by Tomek on 2016-11-17.
 */
public class Weather {

    private double temperatureInCelsius;
    private LocalDateTime lastUpdates;
    private double feelsLikeTemperature;
    private String iconURL;
    private boolean isDay;
    private double pressureMb;
    private String location;
    private WeatherCondition weatherCondition;



    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public LocalDateTime getLastUpdates() {
        return lastUpdates;
    }

    public void setLastUpdates(LocalDateTime lastUpdates) {
        this.lastUpdates = lastUpdates;
    }

    public double getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(double feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
    }

    public String getIconURL() {
        return iconURL;
    }

    public void setIconURL(String iconURL) {
        this.iconURL = iconURL;
    }

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    // temp_c
    // last_updates
    // icon_url
    // condition:text
    // condition:icon
    // condition:code
    // feelslike_c
    // pressure_mb
    // is_day


}
