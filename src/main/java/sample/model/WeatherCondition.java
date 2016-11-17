package sample.model;

/**
 * Created by Tomek on 2016-11-17.
 */
public class WeatherCondition {
    private String text;
    private String iconUrl;
    private int code;

    public WeatherCondition(String text, String iconUrl, int code) {
        this.text = text;
        this.iconUrl = iconUrl;
        this.code = code;
    }

    public WeatherCondition(String text, String iconUrl) {
        this.text = text;
        this.iconUrl = iconUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
