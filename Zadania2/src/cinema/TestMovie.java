package cinema;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie {
    public static void main(String[] args) {
        ArrayList<Movie> almov = new ArrayList<>();
        almov.add(new Movie("Milioner","Patryk Vega","Komedia"));
        almov.add(new Movie("Bilioner","Patryk Vega","Komedio dramat"));
        almov.add(new Movie("O tym jak rozpętałem drugą wojne światową","Andrzej Rutkowski","Komedia"));
        almov.add(new Movie("Star Wars 4","George Lucas","SCIFI"));

        System.out.println(almov);
        Collections.sort(almov);
        System.out.println(almov);

    }
}
