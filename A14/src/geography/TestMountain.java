package geography;

import java.util.ArrayList;

public class TestMountain {
    public static void main(String[] args) {
        ArrayList<Double> g1 = new ArrayList<>();
        g1.add(23.41);
        g1.add(20.48);
        g1.add(15.41);

        Mountain gora1 = new Mountain("Mala gora",g1);
        Mountain gora2 = null;

        gora2 = (Mountain) gora1.clone();

        System.out.println(gora1);
        System.out.println(gora2);

        gora2.setHeights(2,123.12);

        System.out.println(gora1);
        System.out.println(gora2);





    }
}
