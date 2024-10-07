import java.util.ArrayList;

public class TestListy {

    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();

        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);
        liczby.add(7);
        liczby.add(8);
        liczby.add(9);
        liczby.add(10);
        liczby.add(11);
        liczby.add(12);

        for(int i=liczby.size()-1; i>=0; i--){
            System.out.println(liczby.get(i));
        }

        zbudujPiramide(3,'x');
    }

    public static int minimumValue(ArrayList<Integer> lista){
        int min=lista.get(0);
        for(int i=0; i<=lista.size()-1; i++){
            if(lista.get(i)<min)
            {
                min=lista.get(i);
            }
        }
        return min;
    }

    public static double average(ArrayList<Double> lista){
        if(lista.isEmpty()){
            return 0;
        }
        double sum=0;
        for(int i=0; i<=lista.size()-1; i++){
            sum+=lista.get(i);
        }
        return (sum/lista.size());
    }

    public static int countZeros(ArrayList<Integer> lista){
        int licznik=0;
        for(int i=0; i<=lista.size()-1;i++)
        {
            if(lista.get(i)==0)
            {
                licznik+=1;
            }
        }
        return licznik;
    }

    public static ArrayList<Integer> copyArray(ArrayList<Integer> lista)
    {
        ArrayList<Integer> nowaLista = new ArrayList<>();

        for(int i=0; i<=lista.size()-1;i++)
        {
            nowaLista.add(lista.get(i));
        }
        return nowaLista;
    }

    /*
    public static String zamienZnaki(String napis)
    {

    }
    */

    public static String usunSpacje(String napis)
    {
        String nowyNapis="";

        for(int i=0; i<=napis.length()-1; i++)
        {
            if(napis.charAt(i)!=' ')
            {
                nowyNapis+=napis.charAt(i);
            }
        }

        return nowyNapis;
    }

    public static void zbudujPiramide(int n, char x){
        int maxDlugosc = 2*n-1;
        for(int i=1; i<=n; i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int spacje=0; spacje<n-i;spacje++)
            {
                sb.append(" ");
            }
            for(int d=0; d<2*i-1;d++)
            {
                sb.append(x);
            }
            System.out.println(sb.toString());
        }

    }
}
