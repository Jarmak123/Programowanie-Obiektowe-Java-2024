package playlist;

import java.util.Comparator;

public class Song {
    public String tile;
    public String artist;
    public int duration;

    public Song(int duration, String artist, String tile) {
        this.duration = duration;
        this.artist = artist;
        this.tile = tile;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "tile='" + tile + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}

class DurationComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.duration, o2.duration);
    }
}

class ArtistTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        if(o1.artist.compareTo(o2.artist)==0)
        {
            return o1.tile.compareTo(o2.tile);
        }
        return o1.artist.compareTo(o2.artist);
    }
}
