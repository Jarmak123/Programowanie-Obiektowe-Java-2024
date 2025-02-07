package consistency;

public class UtilsAreBothNonNull { //k21
    public static <T> boolean areBothNonNull(T a, T b){
        return (a!=null && b!=null);
    }
}
