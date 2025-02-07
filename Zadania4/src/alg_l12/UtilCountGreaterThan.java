package alg_l12;

import java.util.LinkedList;

public class UtilCountGreaterThan {
    public static <E extends Comparable<E>> int countGreaterThan(LinkedList<E> list, E element){
        int counter =0;

        for(E i: list)
        {
            if(i.compareTo(element)>0) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lli = new LinkedList<>();
        lli.add(1);
        lli.add(1);
        lli.add(1);
        lli.add(3);
        lli.add(0);
        lli.add(6);

        System.out.println(countGreaterThan(lli,0));

    }
}
