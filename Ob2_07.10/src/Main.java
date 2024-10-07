import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<Double> liczby2 = new ArrayList<>();
        ArrayList<Integer> liczby3 = new ArrayList<>();
        for(int i=3; i<13; i++)
        {
            liczby.add(i);
        }

        for(double i=3.0; i<13.0; i++)
        {
            liczby2.add(i);
        }

        liczby3.add(1);
        liczby3.add(2);
        liczby3.add(0);
        liczby3.add(6);
        liczby3.add(0);

        System.out.println(TestListy.minimumValue(liczby));
        System.out.println(TestListy.average(liczby2));
        System.out.println(TestListy.countZeros(liczby3));
        System.out.println(TestListy.copyArray(liczby));
        System.out.println(TestListy.usunSpacje("Kapitan Bomba"));
    }
}
