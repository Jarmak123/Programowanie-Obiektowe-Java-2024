package checking_L21;

public class Main {
    public static void main(String[] args) {
        Integer[] ar1 = new Integer[3];
        ar1[0]=0;
        ar1[1]=1;
        ar1[2]=2;

        Integer[] ar2 = new Integer[3];
        ar2[0]=0;
        ar2[1]=1;
        ar2[2]=2;

        System.out.println(UtilAreArraysEqual.areArraysEqual(ar1,ar2));



    }
}
