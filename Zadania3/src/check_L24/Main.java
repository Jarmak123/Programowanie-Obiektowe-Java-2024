package check_L24;

public class Main {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";

        System.out.println(UtilCheckTypeCompatibility.checkTypeCompatibility(str1,str2));
        System.out.println(str1.getClass());
    }
}
