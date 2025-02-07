package moto_k11;

public class Main {
    public static void main(String[] args) {
        Integer[] ar = new Integer[4];
        ar[0]=3;
        ar[1]=5;
        ar[2]=1;
        ar[3]=2;

        System.out.println(lastMaxValue(ar));

    }

    public static <T extends Comparable<T>> T lastMaxValue(T[] arrs){
        T max_last = arrs[0];

        for(T i: arrs)
        {
            if(i.compareTo(max_last)>=0)
            {
                max_last=i;
            }
        }
        return max_last;
    }
}
