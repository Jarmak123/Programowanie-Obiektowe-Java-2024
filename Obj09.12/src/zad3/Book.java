package zad3;

import java.time.LocalDate;

public class Book implements Comparable<Book>{
    String title;
    int numberOfPages;
    LocalDate publicationDate;

    public Book(String title, int numberOfPages, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return ""+numberOfPages;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages, this.numberOfPages);
    }
}
