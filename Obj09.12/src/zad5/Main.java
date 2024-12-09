package zad5;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> prs = new ArrayList<>();

        prs.add(new Person("Andrzej","Siemaszko", LocalDate.of(2002,12,3)));
        prs.add(new Person("Józek","Dobrodziej", LocalDate.of(2002,12,3)));
        prs.add(new Person("Andrzej","Problemski", LocalDate.of(2002,12,3)));
        prs.add(new Person("Bartek","Siemaszko", LocalDate.of(2002,12,3)));
        prs.add(new Person("Marta","Augustynowska", LocalDate.of(2002,12,3)));

        System.out.println(prs);
        prs.sort(new FirstLastNameComparator());
        System.out.println(prs);
    }
}
