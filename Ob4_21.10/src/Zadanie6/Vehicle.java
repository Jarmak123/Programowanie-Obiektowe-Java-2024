package Zadanie6;

import java.util.Objects;

public class Vehicle {
    String brand;
    String model;
    int yearOfProduction;

    public Vehicle(String brand, String model, int yearOfProduction) {
        if(yearOfProduction>2024)
        {
            yearOfProduction=2024;
        }
        if(model==null || model=="")
        {
            model="-";
        }
        if(brand==null || model=="")
        {
            brand="-";
        }

        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfProduction == vehicle.yearOfProduction && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction);
    }
}
