package vehicle_k32;

public class UtilIsDescending {
    public static <T extends Comparable<T>> boolean isDescending(T[] arr){
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Argument nie moze byc pusta tablica");
        }

        for(int i=0; i<arr.length-1;i++){
            if(arr[i].compareTo(arr[i+1])>=0)
            {
                return true;
            }
        }
        return false;
    }
}
