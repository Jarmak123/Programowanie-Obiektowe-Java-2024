package cinema;

public class Movie implements Comparable<Movie>{
    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                "}\n";
    }

    @Override
    public int compareTo(Movie o) {
        if(Integer.compare(this.title.length(),o.title.length())==0)
        {
            return this.title.compareTo(o.title);
        }
        return Integer.compare(this.title.length(),o.title.length());
    }
}
