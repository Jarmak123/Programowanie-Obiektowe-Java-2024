package integrity_k31;

import java.util.Objects;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public static void main(String[] args) {
        Book ksiega1 = new Book("Hobbit","Tolkien");
        Book ksiega2 = new Book("Hobbit","Tolkien");
        Book ksiega3 = new Book("Star wars","George Lucas");
        Book ksiega4 = new Book("Tregodor","Peter Supra");

        System.out.println("P1:");
        UtilAnnounceIfUnique.announceIfUnique(ksiega1,ksiega3,ksiega4);
        System.out.println("P2:");
        UtilAnnounceIfUnique.announceIfUnique(ksiega1,ksiega2,ksiega3);

    }
}
