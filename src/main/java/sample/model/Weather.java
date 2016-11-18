package sample.model;


/**
 * Created by Tomek on 2016-11-17.
 */
public class Weather {

    private double temperatureInCelsius;
    private String lastUpdates;
    private double feelsLikeTemperature;
    private boolean isDay;
    private double pressureMb;
    private String location;
    private WeatherCondition weatherCondition;

    @Override
    public String toString() {
        return "Weather{" +
                "lastUpdates=" + lastUpdates +
                '}';
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public String getLastUpdates() {
        return lastUpdates;
    }

    public void setLastUpdates(String lastUpdates) {
        this.lastUpdates = lastUpdates;
    }

    public double getFeelsLikeTemperature() {
        return feelsLikeTemperature;
    }

    public void setFeelsLikeTemperature(double feelsLikeTemperature) {
        this.feelsLikeTemperature = feelsLikeTemperature;
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

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
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
