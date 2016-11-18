package sample.service;

import sample.model.Weather;

/**
 * Created by Tomek on 2016-11-17.
 */
public interface WeatherService {
    Weather getWeatherFromUrl(String url, String ciy);

}
