package alg_l13;

import java.util.*;

public class UtilCountUniqueKeys {
    public static <K,V> int countUniqueKeys(HashMap<K,V> map){
        return map.size(); // mapy maja unikalne klucze
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hmsi = new HashMap<>();
        hmsi.put("A",1);
        hmsi.put("B",2);

        System.out.println(countUniqueKeys(hmsi));
    }
}
