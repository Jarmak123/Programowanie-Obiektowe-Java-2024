package zad3;

public record Person(String imie, int age) {
    public Person {
        if(age<0)
        {
            throw new IllegalArgumentException("Wiek musi byc wiekszy niz 0");
        }
    }

    public void przywitajSie() {
        System.out.println("siema");
    }
}
