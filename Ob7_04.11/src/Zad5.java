import java.util.ArrayList;

public class Zad5 {
    public static int oddElementsSum(ArrayList<Integer> n)
    {
        int np = 0;
        for(int i: n)
        {
            if(i%2!=0)
            {
                np+=i;
            }
        }
        return np;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            tab.add(i);
        }
        System.out.println(oddElementsSum(tab));
    }
}
