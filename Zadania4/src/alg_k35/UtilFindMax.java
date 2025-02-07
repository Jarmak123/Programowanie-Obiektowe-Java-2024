package alg_k35;

import java.util.ArrayList;
import java.util.Collection;

public class UtilFindMax {
    public static <T extends Comparable<T>> T findMax(Collection<T> items){
        T max = null;
        for(T i: items){
            if(max==null || max.compareTo(i)>0){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Book> bks = new ArrayList<>();
        bks.add(new Book("Hobbit",122));
        bks.add(new Book("Aobbit",122));
        bks.add(new Book("Bobbit",122));

        System.out.println(findMax(bks));
    }
}
