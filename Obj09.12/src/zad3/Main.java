package zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        bk.add(new Book("Hobbit",250, LocalDate.of(2008,12,3)));
        bk.add(new Book("Ja i Kot",7200, LocalDate.of(2010,12,3)));
        bk.add(new Book("Hari Pota",550, LocalDate.of(2012,12,3)));
        bk.add(new Book("Rok 1984",350, LocalDate.of(1950,12,3)));

        System.out.println(bk);
        Collections.sort(bk);
        System.out.println(bk);
    }
}
