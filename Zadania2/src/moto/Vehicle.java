package moto;

public interface Vehicle {
    abstract void startEngine(String fuelType);
    abstract boolean canDrive(int fuelLevel);
    default void stop(){
        System.out.println("Zatrzymano pojazd");
    }
    default void honk(){
        System.out.println("Bib bib");
    }
    static String info(){
        return "Interfejs Vehicle:\nPosiada metody: startEngine(), canDrive(), stop(), honk() i info(), które właśnie zostało wywowałane";
    }

}
