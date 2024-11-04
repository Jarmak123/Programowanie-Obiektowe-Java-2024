public class Main {
    public static String capitalizeEverySecond(StringBuilder n){
        for(int i=1; i<n.length();i+=2)
        {
            n.replace(i,i+1,new String(""+n.charAt(i)).toUpperCase());
        }
        return n.toString();
    }

    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("Kapitan bomba");
        System.out.println(capitalizeEverySecond(x));
    }
}