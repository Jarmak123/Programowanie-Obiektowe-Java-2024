package checking_L32;

public class Main {
    public static void main(String[] args) {
        Integer[] a = new Integer[4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;

        System.out.println(UtilIsArraySorted.isArraySorted(a));
    }
}
