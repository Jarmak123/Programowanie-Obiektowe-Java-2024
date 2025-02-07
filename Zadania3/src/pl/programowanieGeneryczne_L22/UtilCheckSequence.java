package pl.programowanieGeneryczne_L22;

public class UtilCheckSequence {
    public static <T extends Comparable<T>>  boolean checkSqeuence(T a, T b, T c){
        return ((a.compareTo(b)>0 && b.compareTo(c)>0) || (a.compareTo(b)<0 && b.compareTo(c)<0));
    }
}
