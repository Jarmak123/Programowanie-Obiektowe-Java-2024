package vehicle;

public class Main {

    public static <T extends Comparable<T>> boolean isDescending(T[] array){
        if(array==null || array.length==0)
        {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        for(int i=0; i<array.length-1;i++)
        {
            if(array[i].compareTo(array[i+1])<0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] numbers = {5,4,3,2,1};

        System.out.println(isDescending(numbers));
    }

}
