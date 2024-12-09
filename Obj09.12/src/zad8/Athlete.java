package zad8;

import java.util.ArrayList;
import java.util.Arrays;

public class Athlete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public Athlete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimes=" + lapTimes +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        Athlete athlete = (Athlete) super.clone();
//        athlete.lapTimes = new ArrayList<>(athlete.lapTimes);
//        return athlete
        return super.clone();
    }
}
