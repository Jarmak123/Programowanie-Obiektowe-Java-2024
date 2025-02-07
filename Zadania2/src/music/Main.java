package music;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Song[] arr = new Song[5];
        arr[0]=new Song("Problem","Ariana G.",512);
        arr[1]=new Song("Saphire","Mata",321);
        arr[2]=new Song("Esperesso","Sabrina C.",32);
        arr[3]=new Song("Gwiazda","Zenek M.",112);
        arr[4]=new Song("Ametyst","Alejandro",32);

        for(Song i: arr)
        {
            System.out.println(i);
        }
        Arrays.sort(arr, new DurationTitleComparator());
        System.out.println("///////////////////////////");
        for(Song i: arr)
        {
            System.out.println(i);
        }


    }
}
