package checking;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(checkDisjoint(set1,set2));
        set2.add(2);
        System.out.println(checkDisjoint(set1,set2));

    }

    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2){
        if(set1==null || set2==null)
        {
            throw new IllegalArgumentException("Argumenty nie mogą byc nullem");
        }

        for(E i: set1)
        {
            if(set2.contains(i))
            {
                return false;
            }
        }
        return true;
    }
}
