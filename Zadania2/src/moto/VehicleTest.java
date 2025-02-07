package moto;

public class VehicleTest {
    public static void main(String[] args) {
        Car samochod = new Car();

        samochod.startEngine("benzyna");
        System.out.println(samochod.canDrive(5));
        samochod.stop();
        samochod.honk();
        System.out.println(Vehicle.info());
    }
}
