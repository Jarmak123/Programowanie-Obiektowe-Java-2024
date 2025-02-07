package playlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Song[] tab = new Song[5];

        tab[0]= new Song(211,"ZAriana Grande","Problem");
        tab[1]= new Song(211,"Liz Ghilis","Take a Hint");
        tab[2]= new Song(333,"Leon Thomas","TUTT");
        tab[3]= new Song(444,"Matt Benet","Essa");
        tab[4]= new Song(34,"Victoria Justice","L.A. Boys");

        for (Song song : tab) {
            System.out.println(song);
        }

        Arrays.sort(tab,new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("/////////");

        for (Song song : tab) {
            System.out.println(song);
        }

    }
}
