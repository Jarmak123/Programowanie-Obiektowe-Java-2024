package music2;

import java.util.ArrayList;
import java.util.Collections;

public class Song implements Comparable<Song>{
    public String title;
    public String artist;
    public int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                "}\n";
    }

    @Override
    public int compareTo(Song o) {
        if(Integer.compare(this.duration,o.duration)==0)
        {
            return this.title.compareTo(o.title);
        }
        return Integer.compare(this.duration,o.duration);
    }

    public static void main(String[] args) {
        ArrayList<Song> arr = new ArrayList<>();
        arr.add(new Song("G","Dupowski",32));
        arr.add(new Song("C","Zurowski",1212));
        arr.add(new Song("As","dsadas",32));

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

    }
}
