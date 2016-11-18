package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import sample.model.Weather;
import sample.service.WeatherServiceJsonOrg;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Label dataLabel;

    @FXML
    public Label textConditionLabel;

    @FXML
    public Label temperatureLabel;

    @FXML
    public Label cityLabel;

    @FXML
    public ImageView iconImageView;

    private Weather currentWeather;


    public void initialize(URL location, ResourceBundle resources) {
        WeatherServiceJsonOrg weatherServiceJsonOrg = new WeatherServiceJsonOrg("d578c483ed8b494bad8170534161511");
        currentWeather = weatherServiceJsonOrg.getWeatherFromUrl("http://api.apixu.com/v1/current.json","Warsaw");
        dataLabel.setText(currentWeather.getLastUpdates());
        cityLabel.setText(currentWeather.getLocation());
        temperatureLabel.setText(String.valueOf(currentWeather.getTemperatureInCelsius()));
        textConditionLabel.setText(currentWeather.getWeatherCondition().getText());

    }
}
