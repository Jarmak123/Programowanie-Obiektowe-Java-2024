package zad1;

public class Main {
    public static void main(String[] args) {
        Uzytkownik u1 = new Uzytkownik(new Email());
        u1.powiadomOModernizacji("chuj dupa\n");

        GolabPocztowy gp1 = new GolabPocztowy();
//        gp1.wyslij("eoeo");
        u1.setPowiadomienie(gp1);
        u1.powiadomOModernizacji("POMOC");

    }
}
