package checking_L32;

public class UtilIsArraySorted {
    public static <T extends Comparable<T>> boolean isArraySorted(T[] arr){
        if(arr==null)
        {
            throw new NullPointerException("Tablica nie moze być null");
        }
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]==null)
            {
                throw new NullPointerException("Wartość pozycji w tablicy nie może być null");
            }
            else
            {
                if(arr[i].compareTo(arr[i+1])>=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
