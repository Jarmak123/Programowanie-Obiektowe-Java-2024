package music;

import java.util.Comparator;

public record Song(String title, String artist, int duration) {
}

class DurationTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        if (Integer.compare(o1.duration(),o2.duration())==0)
        {
            return o1.title().compareTo(o2.title());
        }
        return Integer.compare(o1.duration(),o2.duration());
    }
}
