package alg_l24;

import java.util.ArrayList;
import java.util.Collection;

public class UtilFindMax {
    public static <T extends Comparable<T>> T findMax(Collection<T> items){
        T max = null;
        for(T i: items){
            if(max==null || i.compareTo(max)>0) max=i;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("HUJ",230));
        books.add(new Book("HUJ",232130));
        books.add(new Book("ELO",23));
        books.add(new Book("HUJ",2300));

        System.out.println(findMax(books));
    }
}
