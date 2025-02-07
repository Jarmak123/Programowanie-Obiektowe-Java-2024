package pl.kolekcje;

import java.util.ArrayList;
import java.util.Collection;

public class UtilContainsAllElements {
    public static <E> boolean containsAllElements(Collection<E> col1, Collection<E> col2){
        if(col1==null || col2==null) throw new IllegalArgumentException("Wartosci nie moga byc null");

        for(E i: col2){
            if(!col1.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        Collection<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);

        System.out.println(containsAllElements(c,d));
        System.out.println(containsAllElements(d,c));

    }
}
