package consistency;

import java.util.LinkedList;

public class Main {
    public static <T> boolean areBothNonNull(T arg1, T arg2){
        return(arg1!=null && arg2!=null);
    }

    public static <E extends Comparable<E>> int countGreater(LinkedList<E> list, E element){
        int ilosc=0;

        for(E i: list)
        {
            if(i.compareTo(element)>0)
            {
                ilosc++;
            }
        }

        return ilosc;
    }

    public static void main(String[] args) {
        System.out.println(areBothNonNull(null,"Hi"));
        System.out.println(areBothNonNull(42,100));

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(2);

        System.out.println(countGreater(ll,1));
    }
}
