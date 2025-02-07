package algorithm_l22;

import java.util.HashSet;

public class UtilIsSubset {
    public static <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2){
        for(E i: set2){
            if(!set1.contains(i))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashSet<Integer> hsi = new HashSet<>();
        hsi.add(1);
        hsi.add(2);
        hsi.add(3);

        HashSet<Integer> hsi1 = new HashSet<>();
        hsi.add(1);
        hsi.add(2);

        System.out.println(isSubset(hsi,hsi1));
    }
}
