package zad3;

public class Main {
    public static void main(String[] args) {
        Person prs = new Person("Jacek",12);
        System.out.println(prs.age());

        Person prs1 = new Person("Jacek",12);
        System.out.println(prs1.age());
        prs1.przywitajSie();
    }
}
