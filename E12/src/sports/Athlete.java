package sports;

import java.util.Comparator;

public class Athlete {
    public String name;
    public String nationality;
    public double[] records;

    public Athlete(String name, String nationality, double[] records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }
}

class RecordComparator implements Comparator<Athlete> {
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return ;
    }
}
