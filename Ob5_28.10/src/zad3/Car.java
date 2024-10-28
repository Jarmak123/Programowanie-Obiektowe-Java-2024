package zad3;

public class Car extends Vehicle{
    /*
    @Override
    public void drive(){
        System.out.println("The car is moving");
    }
    */
    @Override
    public void drive(){
        super.drive();
        System.out.println("Car");
    }

    public static void main(String[] args) {
        Car samochod = new Car();
        samochod.drive();
    }

}
