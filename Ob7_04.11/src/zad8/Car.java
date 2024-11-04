package zad8;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + " " + numberOfDoors;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.print("and Joseph");
    }
}
