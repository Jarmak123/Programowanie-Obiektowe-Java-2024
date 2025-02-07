package alg;

import java.util.ArrayList;
import java.util.Collection;

public class UtilFindMax { //K11
    public static <T extends Comparable<T>> T findMax(Collection<T> items){
        T max = null;

        for(T item: items)
        {
            if(max==null || item.compareTo(max)<0)
            {
                max=item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Aobbit", 21));
        books.add(new Book("Popit", 21));
        books.add(new Book("Hobbit", 21));

        System.out.println(findMax(books));
    }
}
