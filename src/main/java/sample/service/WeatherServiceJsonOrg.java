package sample.service;

import jdk.nashorn.api.scripting.JSObject;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import sample.model.Weather;
import sample.model.WeatherCondition;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.time.LocalDateTime;

import static javafx.scene.input.KeyCode.J;
import static javax.swing.UIManager.getInt;

/**
 * Created by Tomek on 2016-11-17.
 */
public class WeatherServiceJsonOrg implements WeatherService {
    private String privateKey;

    public WeatherServiceJsonOrg (String privateKey){
        this.privateKey = privateKey;
    }


    public Weather getWeatherFromUrl(String url, String city) {
        String fineUrl = url+"?key="+privateKey+"&q="+city;
        Weather weather = new Weather();
        try {
           String location = city;
            JSONObject json = new JSONObject(IOUtils.toString(new URL(fineUrl), Charset.forName("UTF-8")));
            //    JSONObject weatherJson = (JSONObject)json.get("location");
            JSONObject weatherJSon = json.getJSONObject("location");
            JSONObject currentWether = json.getJSONObject("current");
            double temperatureInCelsius = currentWether.getDouble("temp_c");
            String lastUpdated = currentWether.getString("last_updated");
            boolean isDay = currentWether.getInt("is day")==1 ? true : false;
            double feelsLikeTemperatureInCelsius = currentWether.getDouble("feelslike_c");
            double pressureMB = currentWether.getDouble("pressure_mb");

            JSONObject currentConditionWeather = currentWether.getJSONObject("condition");
            String conditionText = currentConditionWeather.getString("text");
            String iconUrl = currentConditionWeather.getString("icon");
            int code = currentConditionWeather.getInt("code");

            WeatherCondition weatherCondition = new WeatherCondition(conditionText, iconUrl, code);

            weather.setDay(isDay);
            weather.setWeatherCondition(weatherCondition);
            weather.setLastUpdates(lastUpdated);
            weather.setTemperatureInCelsius(temperatureInCelsius);
            weather.setLocation(location);
            weather.setPressureMb(pressureMB);
            weather.setFeelsLikeTemperature(feelsLikeTemperatureInCelsius);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return weather;
    }

    public static void main(String[] args){
        WeatherServiceJsonOrg weatherServiceJsonOrg = new WeatherServiceJsonOrg("d578c483ed8b494bad8170534161511");
        Weather weather = weatherServiceJsonOrg.getWeatherFromUrl("http://api.apixu.com/v1/current.json","Warsaw");
        System.out.println(weather);
    }
}
