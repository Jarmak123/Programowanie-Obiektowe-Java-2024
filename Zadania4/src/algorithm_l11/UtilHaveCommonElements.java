package algorithm_l11;

import java.util.HashSet;

public class UtilHaveCommonElements {
    public <E> boolean haveCommonElements(HashSet<E> set1, HashSet<E> set2){
        for(E i: set1){
            if(set2.contains(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        UtilHaveCommonElements hce = new UtilHaveCommonElements();
        HashSet<Integer> hsi = new HashSet<>();
        hsi.add(1);
        hsi.add(2);
        hsi.add(3);

        HashSet<Integer> hsi1 = new HashSet<>();
        hsi1.add(1);

        System.out.println(hce.haveCommonElements(hsi,hsi1));


    }
}
