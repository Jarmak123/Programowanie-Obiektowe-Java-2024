package collectiontools_k33;

import java.util.HashSet;

public class UtilCombineSet {
    public static <T> HashSet<T> combineSets(HashSet<T> set1, HashSet<T> set2){
        HashSet<T> new_hashset = new HashSet<>();

        for(T i: set1){
            if(!new_hashset.contains(i)) new_hashset.add(i);
        }
        for(T i: set2){
            if(!new_hashset.contains(i)) new_hashset.add(i);
        }

        return new_hashset;
    }

    public static void main(String[] args) {
        HashSet<Product> hsp = new HashSet<>();
        hsp.add(new Product("Mydlo","Domowe"));
        hsp.add(new Product("Karma dla kota","Domowe"));
        hsp.add(new Product("Mydlo","Domowe"));

        HashSet<Product> hsp1 = new HashSet<>();
        hsp1.add(new Product("Żelki","Słodycze"));
        hsp1.add(new Product("Batony","Słodycze"));
        hsp1.add(new Product("Żelki","Słodycze"));

        HashSet<Product> hsp3 = combineSets(hsp,hsp1);

        System.out.println(hsp);
        System.out.println(hsp1);
        System.out.println(hsp3);



    }
}
