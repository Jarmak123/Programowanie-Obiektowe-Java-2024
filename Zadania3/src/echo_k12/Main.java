package echo_k12;

public class Main {
    public static void main(String[] args) {

        echoIfEquivalent("abc","abc","ab");

    }

    public static <T> void echoIfEquivalent(T a, T b, T c){
        if(a.equals(b) && a.equals(c) && b.equals(c)){
            System.out.println("Wszystkie trzy są równoważne");
        }
    }
}
