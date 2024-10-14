public class Book {
    String title;
    String author;
    int publicationYear;

    public Book() {
        this.title = "Józef";
        this.author= "Albert Cieć";
        this.publicationYear= 2009;
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

}
