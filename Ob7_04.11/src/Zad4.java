import java.util.ArrayList;

public class Zad4 {
    /*
    public static ArrayList<Integer> generateTab(){
        ArrayList<Integer> tab = new ArrayList<>();
        for(int i=0; i<15; i++)
        {

        }
    }
     */

    public static int sum(int[] tab){
        int suma = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]%3==0)
            {
                suma+=tab[i];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] tab = new int[15];
        for(int i=1; i<=15; i++)
        {
            tab[i-1]=i;
        }
        System.out.println(sum(tab));

    }
}
