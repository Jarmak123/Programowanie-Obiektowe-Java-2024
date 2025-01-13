package zad1;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie1 {
    public static void dzielenie() {
    Scanner scanner = new Scanner(System.in);
    int a =0;
    int b =0;

    try{
        a=scanner.nextInt();
        b=scanner.nextInt();
    }catch (InputMismatchException i){
        System.out.println("Wartosc nie jest numerem");
    }finally {
        scanner.close();
    }
    try{
        System.out.println(a/b);
    }catch (ArithmeticException ae){
        System.out.println("Nie mozna dzielic przez 0");
    }
    }
    
    public static void main(String[] args) {
        dzielenie();
    }

}
