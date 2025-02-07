package alg_l32;

import java.util.*;

public class UtilCountValueOccurences {
    public static <K,V> int countValuesOccurrences(HashMap<K,V> hm, V element){
        if(hm==null || element == null) throw new NullPointerException("Wartosc/HashMap nie moze byc null");

        int counter = 0;

        for(Map.Entry<K,V> i: hm.entrySet()){
            if(i.getValue().equals(element)){
                counter++;
            }
            else if(i.getValue().equals(null)){
                throw new NullPointerException("Wartosc nie moze byc null");
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",2);

        System.out.println(countValuesOccurrences(map,2));

    }

}
