package zad8;

public class Main {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle("tOJOTA","CORROLA");
        Car car = new Car("seat", "ibiza",4);
        System.out.println(veh);
        System.out.println(car);
        veh.drive();
        car.drive();
    }
}
