package alg_l31;

import java.util.*;

public class UtilContainsValue {
    public static <K,V> boolean containsValue(HashMap<K,V> hm, V element){
        for(Map.Entry<K,V> i: hm.entrySet()){
            if(i.getValue()==element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hash_m = new HashMap<>();
        hash_m.put("A",1);
        hash_m.put("B",2);
        hash_m.put("C",3);
        hash_m.put("D",4);

        System.out.println(containsValue(hash_m,5));
    }
}
