package zad2;

public class Smartphone extends ElectronicDevice{

    public Smartphone(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączyłes Smartphone");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłaczyłeś Smartphone");
    }
}
