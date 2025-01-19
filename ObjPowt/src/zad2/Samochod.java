package zad2;

public class Samochod {
    private Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }

    void start(){
        silnik.uruchom();
    }

    void stop(){
        silnik.zatrzymaj();
    }
}
