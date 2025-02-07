package alg_l15;

import java.util.LinkedList;

public class UtilAreAllElementsEqual {
    public static <E> boolean areAllElementsEqual(LinkedList<E> list){
        if(list==null || list.isEmpty())
        {
            return false;
        }

        E temp = list.getFirst();

        for(E i: list)
        {
            if(!i.equals(temp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lli = new LinkedList<>();
        lli.add(1);
        lli.add(1);
        lli.add(1);
        lli.add(3);

        System.out.println(areAllElementsEqual(lli));
    }
}
