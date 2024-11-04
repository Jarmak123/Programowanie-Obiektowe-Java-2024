public class Zad2 {
    public static String capitalizeEverySecond1(StringBuilder n){
        for(int i=1; i<n.length();i+=2)
        {
            n.setCharAt(i,Character.toUpperCase(n.charAt(i)));
        }
        return n.toString();
    }

    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("Kapitan bomba");
        System.out.println(capitalizeEverySecond1(x));
    }
}