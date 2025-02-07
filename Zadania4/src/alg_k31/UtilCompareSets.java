package alg_k31;

import java.util.TreeSet;

public class UtilCompareSets {
    public static <E> int compareSets(TreeSet<E> set1, TreeSet<E> set2){
        int counter = 0;
        for(E i: set1)
        {
            if(set2.contains(i)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);


        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);

        System.out.println(compareSets(set1,set2));
    }
}
