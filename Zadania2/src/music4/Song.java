package music4;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return title.equals(song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, duration);
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.title);
    }
}
