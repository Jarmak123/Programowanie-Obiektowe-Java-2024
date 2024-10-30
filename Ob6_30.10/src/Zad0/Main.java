package Zad0;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Adam", "Nowak", 35);
        Person person2 = new Person("Adam", "Kowalski", 35);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.equals(person2));  // HashCode dobrze ustawiony

        System.out.println(person1.imie() + " : " +person1.nazwisko());  // Getter

        person1.przedstawSie();
    }
}
