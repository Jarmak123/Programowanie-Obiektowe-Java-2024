package finding_m15;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
    public String model;
    public int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.model.compareTo(o.model);
    }
}
