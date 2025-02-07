package verification_k13;

public class Main {
    public static void main(String[] args) {

        System.out.println(isEitherNull("abc","abc"));

    }

    public static <T> boolean isEitherNull(T a, T b){
        return (a==null || b==null);
    }
}
