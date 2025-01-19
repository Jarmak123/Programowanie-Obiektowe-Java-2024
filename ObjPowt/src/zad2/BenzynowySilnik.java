package zad2;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Uruchomiłeś silnik benzynowy");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymałeś silnik benzynowy");
    }
}
