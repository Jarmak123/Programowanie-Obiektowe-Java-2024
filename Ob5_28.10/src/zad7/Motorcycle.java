package zad7;

import java.util.Objects;

public class Motorcycle extends Vehicle{
    int engineCapacity;

    public Motorcycle(String brand, String model, int yearOfProduction, int engineCapacity) {
        super(brand, model, yearOfProduction);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return engineCapacity == that.engineCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineCapacity);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
