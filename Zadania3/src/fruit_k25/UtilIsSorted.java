package fruit_k25;

public class UtilIsSorted {
    public static <T extends Comparable<T>> boolean isSorted(T[] arr){
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Tablica nie moze byc pusta");
        }

        for(int i=0; i<arr.length-1;i++)
        {
            if((arr[i].compareTo(arr[i+1])>0)){
                return false;
            }
        }
        return true;
    }
}
