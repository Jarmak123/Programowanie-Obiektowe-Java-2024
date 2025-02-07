package alg_k34;

import java.util.TreeSet;

public class UtilIsUnique {
    public static <E> boolean isUnique(TreeSet<E> elements){
        return true;
    }

    public static void main(String[] args) {
        TreeSet<Integer> tsi = new TreeSet<>();
        tsi.add(1);
        tsi.add(1);
        tsi.add(3);

        System.out.println(tsi);
        System.out.println(isUnique(tsi));

    }

}
