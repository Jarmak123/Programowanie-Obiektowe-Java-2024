package alg_k22;

import java.util.*;

public class UtilReverseMap {
    public static <K,V> TreeMap<V,K> reverseMap(TreeMap<K,V> map){
        TreeMap<V,K> new_map = new TreeMap<>();
        for(Map.Entry<K,V> entry: map.entrySet())
        {
            new_map.put(entry.getValue(), entry.getKey());
        }
        return new_map;
    }

    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");

        TreeMap<String,Integer> r_map = reverseMap(map);

        System.out.println(map);
        System.out.println(r_map);
    }
}
