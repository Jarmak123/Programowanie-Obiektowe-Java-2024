package verification_k24;

public class UtilDisplayIfDistinct {
    public static <T> void displayIfDistinct(T a,T b, T c){
        if(!(a.equals(b) && b.equals(c) && c.equals(a))){
            System.out.println("Wszystkie trzy są różne");
        }
    }
}
