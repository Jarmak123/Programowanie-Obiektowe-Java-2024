package algorithm_k23;

import java.util.HashSet;

public class UtilIsSubset {
    public <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2){
        for(E i: set2){
            if(!set1.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashSet<Integer> inty1 = new HashSet<>();
        inty1.add(1);
        inty1.add(2);
        inty1.add(3);

        HashSet<Integer> inty2 = new HashSet<>();
        inty1.add(2);

        UtilIsSubset sub = new UtilIsSubset();

        System.out.println(sub.isSubset(inty1,inty2));
    }
}
