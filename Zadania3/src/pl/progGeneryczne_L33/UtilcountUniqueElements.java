package pl.progGeneryczne_L33;

public class UtilcountUniqueElements {
    public static <T> int countUniqueElements(T a, T b, T c){
        if(a==null && b==null && c==null)
        {
            throw new IllegalArgumentException("Argument nie może byc nullem");
        }
        int i=3;
        if(a.equals(b)) i--;
        if(b.equals(c)) i--;
        if(a.equals(c)) i--;

        return i;
    }
}
