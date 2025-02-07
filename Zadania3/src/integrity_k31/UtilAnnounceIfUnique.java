package integrity_k31;

public class UtilAnnounceIfUnique {
    public static <T> void announceIfUnique(T a, T b, T c){
        if(!(a.equals(b)) && !(b.equals(c) && !(c.equals(a)))){
            System.out.println("Każdy argument jest unikalny");
        }
    }
}
