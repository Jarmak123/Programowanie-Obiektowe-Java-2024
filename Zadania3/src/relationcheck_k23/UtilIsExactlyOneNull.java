package relationcheck_k23;

public class UtilIsExactlyOneNull {
    public static <T> boolean isExactlyOneNull(T a, T b){
        return (a==null && b!=null) || (a!=null && b==null);
    }
}
