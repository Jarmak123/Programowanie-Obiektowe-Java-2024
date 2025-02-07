package check_L24;

public class UtilCheckTypeCompatibility {
    public static <T> boolean checkTypeCompatibility(T a, T b){
        return(a.getClass()==b.getClass());
    }
}
