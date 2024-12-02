package zad1;

public class Main {
    public static void main(String[] args) {
        Bitmap bitmap1 = new Bitmap(123,123,"abc");
        Vector vector1 = new Vector(1,3,"wektor_super");

        vector1.saveFile();
        vector1.loadFile();

        bitmap1.saveFile();
        bitmap1.loadFile();
    }
}
