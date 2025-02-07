package checking;

public class UtilsEchoIfEquivalent {
    public static <T> void echoIfEquivalent(T a, T b, T c){
        if(a.equals(b) && c.equals(b) && a.equals(c)){
            System.out.println("Wszystkie są równoważne");
        }
    }
}
