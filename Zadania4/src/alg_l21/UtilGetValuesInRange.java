package alg_l21;

import java.util.*;

public class UtilGetValuesInRange {
    public static <K extends Comparable<K>,V extends Comparable<V>> ArrayList<V> getValuesInRange(TreeMap<K,V> map, V minValue, V maxValue){
        ArrayList<V> result = new ArrayList<>();

        for(Map.Entry<K,V> i: map.entrySet())
        {
            if(i.getValue().compareTo(minValue)>=0 && i.getValue().compareTo(maxValue)<=0) result.add(i.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        TreeMap<String, Integer> tmsi = new TreeMap<>();
        tmsi.put("A",1);
        tmsi.put("B",2);
        tmsi.put("C",3);
        tmsi.put("D",4);
        tmsi.put("E",5);

        System.out.println(getValuesInRange(tmsi,1,3));

    }
}
