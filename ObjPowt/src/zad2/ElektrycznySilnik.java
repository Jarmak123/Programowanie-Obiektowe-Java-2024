package zad2;

public class ElektrycznySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Silnik elektryczny uruchomiony");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik elektryczny zgaszony");
    }
}
