package zad2;

public class Television extends ElectronicDevice{
    public Television(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Włączyłes Telewizor");
    }

    @Override
    public void turnOff() {
        System.out.println("Wyłaczyłeś Telewizor");
    }
}
