import java.util.Random;

public class Zad3 {
    public static int generateRandomInt(){
        Random rand = new Random();
        return rand.nextInt(1,10);
    }

    public static void main(String[] args) {
        System.out.println(generateRandomInt());
    }
}
