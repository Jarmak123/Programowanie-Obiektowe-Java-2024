package zad2;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod(new BenzynowySilnik());

        samochod.start();
        samochod.stop();

        Samochod samochod1 = new Samochod(new ElektrycznySilnik());
        samochod1.start();
        samochod1.stop();

    }
}
