package alg_k25;

import java.util.*;

public class UtilCompareFirstAndLast {
    public static <E> boolean compareFirstAndLast(LinkedList<E> list){
        return (list.getFirst()==list.getLast());
    }

    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.add(1);
        linklist.add(2);
        linklist.add(1);

        System.out.println(compareFirstAndLast(linklist));
    }
}
