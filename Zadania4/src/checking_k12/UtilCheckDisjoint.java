package checking_k12;

import java.util.HashSet;

public class UtilCheckDisjoint {
    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2){
        for(E item: set1){
            if(set2.contains(item)){
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
        hsi1.add(1);
        hsi1.add(2);
        hsi1.add(3);

        System.out.println(checkDisjoint(hsi,hsi1));
    }
}
