package zadanie_Printer;

public class StandardowyPrint implements Printer{
    @Override
    public void drukuj() {
        System.out.println("Wydrukowano stronę tekstu");
    }
}
