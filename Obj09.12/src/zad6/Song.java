package zad6;

import java.util.Comparator;

public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return " "+duration+" "+artist;
    }
}

class DurationComparator implements Comparator<Song>
{
    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.duration,o2.duration);
    }
}

class ArtistTitleComparator implements Comparator<Song>
{
    @Override
    public int compare(Song o1, Song o2) {
        return o1.artist.compareTo(o2.artist);
    }
}
