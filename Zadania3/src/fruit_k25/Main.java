package fruit_k25;

public class Main {
    public static void main(String[] args) {
        Integer[] tab = new Integer[5];
        tab[0]=0;
        tab[1]=1;
        tab[2]=2;
        tab[3]=2;
        tab[4]=4;

        System.out.println(UtilIsSorted.isSorted(tab));
    }
}
