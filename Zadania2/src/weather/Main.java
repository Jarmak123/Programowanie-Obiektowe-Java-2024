package weather;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeatherForecast> wf = new ArrayList<>();
        wf.add(new WeatherForecast(5,"01-01-2025",30.5));
        wf.add(new WeatherForecast(4,"02-01-2025",25.5));
        wf.add(new WeatherForecast(3,"03-01-2025",22.5));
        wf.add(new WeatherForecast(2,"04-01-2025",21.5));
        wf.add(new WeatherForecast(1,"05-01-2025",29.5));

        System.out.println(wf);
        wf.sort(new TemperatureComparator().thenComparing(new DateComparator()));
        System.out.println(wf);

    }
}
