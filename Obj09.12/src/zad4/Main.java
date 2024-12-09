package zad4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> prd = new ArrayList<>();
        prd.add(new Product(1,"Masło",999.99));
        prd.add(new Product(2,"Mydło",6.90));
        prd.add(new Product(3,"Bułka",5.00));
        prd.add(new Product(4,"Zakwas chlebowy",5.00));
        prd.add(new Product(5,"Orzechy",39.99));

        System.out.println(prd);
        Collections.sort(prd, new PriceIDComparator());
        System.out.println(prd);

    }

}
