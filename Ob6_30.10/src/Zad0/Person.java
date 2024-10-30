package Zad0;

public record Person(String imie, String nazwisko, int wiek) {
    // Pola są prywatne i final
    // Rekord nie może dziedziczyć klas, bo dziedziczy po klasie record

    public void przedstawSie() {
        System.out.printf("Nazywam się %s %s%n", imie(), nazwisko());
    }
}
