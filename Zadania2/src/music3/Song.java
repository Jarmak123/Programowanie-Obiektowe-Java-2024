package music3;

public record Song(String title, String artist, int duration) implements Comparable<Song>{
    @Override
    public int compareTo(Song o) {
        if(Integer.compare(this.duration(),o.duration())==0)
        {
            return o.title().compareTo(this.title());
        }
        return Integer.compare(this.duration(),o.duration());
    }
}
