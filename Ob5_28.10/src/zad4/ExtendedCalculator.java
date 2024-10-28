package zad4;

public class ExtendedCalculator extends Calculator{
    //@Override
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Calculator dodawanie1 = new Calculator();
        ExtendedCalculator dodwanie2 = new ExtendedCalculator();

        System.out.println(dodawanie1.add(1,2));
        System.out.println(dodwanie2.add(1,2,3));


    }
}
