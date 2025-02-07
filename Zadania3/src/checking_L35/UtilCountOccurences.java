package checking_L35;

public class UtilCountOccurences {
    public static <T> int countOccurrences(T[] arr, T element){
        if(arr==null || arr.length==0 || element==null)
        {
            throw new IllegalArgumentException("Żaden z argumentów nie może byc null");
        }

        int counter = 0;

        for(T i: arr)
        {
            if(i==element) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        String[] tab = new String[3];
        tab[0]="A";
        tab[1]="B";
        tab[2]="A";

        System.out.println(countOccurrences(tab,"A"));
    }
}
