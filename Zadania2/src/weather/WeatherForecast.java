package weather;

import java.util.Comparator;

public class WeatherForecast {
    public int id;
    public String date;
    public double temperature;

    public WeatherForecast(int id, String date, double temperature) {
        this.id = id;
        this.date = date;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", temperature=" + temperature +
                "}\n";
    }
}

class TemperatureComparator implements Comparator<WeatherForecast>{

    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return Double.compare(o1.temperature,o2.temperature);
    }
}

class DateComparator implements Comparator<WeatherForecast>{

    @Override
    public int compare(WeatherForecast o1, WeatherForecast o2) {
        return o2.date.compareTo(o1.date);
    }
}
