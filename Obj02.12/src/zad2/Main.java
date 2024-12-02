package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> tab = new ArrayList<>();
        tab.add(new Smartphone("Samsung", "A21",2012));
        tab.add(new Television("LG", "KOX21",2024));
        tab.add(new Laptop("Dell", "SUP3R",2023));
        tab.add(new Laptop("Asus", "EXTRA",2023));
        tab.add(new Laptop("Samsung", "ELEGANT",2023));

        for(ElectronicDevice ed: tab)
        {
            ed.turnOn();
            ed.turnOff();
        }
    }
}
