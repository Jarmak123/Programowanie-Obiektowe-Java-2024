import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadz napis do wypisania: ");
        //String wejscie = scanner.nextLine();
        int wejscieliczbowe = scanner.nextInt();
        //System.out.println(wejscie);
        */

        Square squareNumber = new Square();
        Square squareNumber1 = new Square(5);

        Book ksiazka1 = new Book();
        Book ksiazka2 = new Book("Krzyżacy","Andrzej",2009);

        System.out.println(ksiazka1.title);
        System.out.println(ksiazka1.author);
        System.out.println(ksiazka1.publicationYear);

        System.out.println(ksiazka2.title);
        System.out.println(ksiazka2.author);
        System.out.println(ksiazka2.publicationYear);


    }

}