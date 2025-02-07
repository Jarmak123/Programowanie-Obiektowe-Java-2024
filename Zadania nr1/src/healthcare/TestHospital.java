package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital szpital1 = new Hospital("Mari Dziewicy",32);
        Hospital szpital1a = new Hospital("Mari Dziewicy",32);
        Hospital szpital2 = new Hospital("Mariusza Wezuwiusza",100);
        Clinic klinika1 = new Clinic("Artura Bączura", 312, 3.5);
        Clinic klinika2 = new Clinic("Ambrożego Kleksa",312123,5.0);
        Clinic kliniak3 = new Clinic("Eustachego Motyki",42069,4.2);

        System.out.println(szpital1.equals(szpital1a));
        System.out.println(szpital1.equals(szpital2));
        System.out.println(klinika1.equals(klinika2));
        System.out.println(klinika1.equals(kliniak3));
        System.out.println(klinika2.equals(szpital2));

    }
}
