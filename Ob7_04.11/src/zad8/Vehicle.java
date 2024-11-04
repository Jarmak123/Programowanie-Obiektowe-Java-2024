package zad8;

public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void drive()
    {
        System.out.println("The car is driving by Jacob");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
