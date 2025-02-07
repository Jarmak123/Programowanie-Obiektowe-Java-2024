package playlist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> sng = new ArrayList<>();

        sng.add(new Song("Problem", "Ariana Grande", 213));
        sng.add(new Song("Huj ci w dupe", "Essa", 312));
        sng.add(new Song("Essasito", "Medusa", 500));
        sng.add(new Song("Alejandro", "Barbara", 121));
        sng.add(new Song("Cukierek typu drops", "Korsarz", 123));

        System.out.println(sng);
        sng.sort(new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println(sng);


    }
}