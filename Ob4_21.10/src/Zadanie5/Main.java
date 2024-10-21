package Zadanie5;

public class Main {
    public static void main(String[] args) {
        Person osoba1 = new Person("Józef","Brejka",42);
        Person osoba2 = new Person(null,"Jopek",22);
        Person osoba3 = new Person("Józef","Brejka",42);

        System.out.println(osoba1.toString());
        System.out.println(osoba2.toString());

        System.out.println(osoba1.equals(osoba3));

        System.out.println(osoba1.hashCode());
        System.out.println(osoba2.hashCode());
        System.out.println(osoba3.hashCode());


    }
}
