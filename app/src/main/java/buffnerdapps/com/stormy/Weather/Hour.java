package buffnerdapps.com.stormy.Weather;

/**
 * Created by k.love on 10/29/2015.
 */
public class Hour {

    private long mTime;
    private String summary;
    private double mTemperature;
    private String mIcon;
    private String mTimezone;


    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
