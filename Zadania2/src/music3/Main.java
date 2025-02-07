package music3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> sng = new ArrayList<>();
        sng.add(new Song("Z","B",21));
        sng.add(new Song("B","B",21));
        sng.add(new Song("A","B",3211));
        sng.add(new Song("D","B",23211));
        sng.add(new Song("H","B",2121));

        for(Song i: sng)
        {
            System.out.println(i);
        }
        Collections.sort(sng);
        System.out.println("///////////////////////");
        for(Song i: sng)
        {
            System.out.println(i);
        }
    }
}
