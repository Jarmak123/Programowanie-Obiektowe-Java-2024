package zad8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lps = new ArrayList<>();
        for(int i=0; i<11; i++)
        {
            lps.add(i);
        }

        Athlete atl = new Athlete("Józek",lps);
        Athlete atl1 = null;

        try{
            atl1 = (Athlete) atl.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Błąd");
        }

        System.out.println(atl);
        System.out.println(atl1);
        atl.lapTimes.set(2,10);
        System.out.println(atl);
        System.out.println(atl1);

    }
}
