package space;

import java.util.ArrayList;

public class TestSpacecraft {
    public static void main(String[] args) {
        ArrayList<Double> array_ufo = new ArrayList<>();
        array_ufo.add(2.5);
        array_ufo.add(3.12);
        array_ufo.add(5.52);

        ArrayList<Double> array_sokol_milenium = new ArrayList<>();
        array_sokol_milenium.add(10.0);
        array_sokol_milenium.add(7.2);
        array_sokol_milenium.add(9.25);


        Spacecraft ufo = new Spacecraft("Przyjaciel z kosmosu","NASA",array_ufo);
        Spacecraft sokol_milenium = new Spacecraft("Sokol Milenium","Republika Nowej Galaktyki",array_sokol_milenium);

        System.out.println(ufo.toString());
        System.out.println(sokol_milenium.toString());

        ufo.addRating(2.52);
        System.out.println(ufo.toString());

        ufo.removeRating(3.12);
        System.out.println(ufo.toString());

    }
}
