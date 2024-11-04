import java.util.ArrayList;

public class Zad6 {
    public static int average(ArrayList<Integer> n)
    {
        int np = 0;
        for(int i: n)
        {
            np+=i;
        }
        return np/n.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> tab = new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            tab.add(i);
        }
        System.out.println(average(tab));
    }
}
