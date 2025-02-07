package book_k22;

public class UtilMostFrequentValue {
    public static <T extends Comparable<T>> T mostFrequentValue(T[] arr){
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Tablica nie moze byc pusta");
        }
        int licznik = 1;
        int licznik_s = 0;
        T schowek = arr[0];

        for(int i=0;i<arr.length;i++){
            for(int y=0;y<arr.length;y++){
                if(arr[i].equals(arr[y]))
                {
                    licznik++;
                }
            }
            if(licznik>=licznik_s)
            {
                schowek = arr[i];
                licznik_s = licznik;
            }
            licznik=1;
        }
        return schowek;
    }
}
