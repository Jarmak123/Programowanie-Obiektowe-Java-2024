package zad6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> sng = new ArrayList<>();

        sng.add(new Song("Problem","Ariana Grande", 245));
        sng.add(new Song("Gangnam Style","PSY", 245));
        sng.add(new Song("Back in black","AC/DC", 321));
        sng.add(new Song("Muzyka","Super piosenkarz", 132));
        sng.add(new Song("Eureka","Ktoś niewiadomy", 153));

        System.out.println(sng);
        sng.sort(new DurationComparator());
        System.out.println(sng);
        sng.sort(new ArtistTitleComparator());
        System.out.println(sng);


    }
}
