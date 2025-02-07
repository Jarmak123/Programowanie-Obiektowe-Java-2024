package alg_l24;

import java.util.Objects;

public class Book implements Comparable<Book>{
    public String title;
    public int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.pages,o.pages);
    }
}
