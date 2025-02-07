package literature;

public class TestLiterature {
    public static void main(String[] args) {
        Novel novela1 = new Novel("Ciepło zimno","A.Kleks", new double[]{2.5, 3.5, 1.25});
        Novel novela2 = new Novel("Czarny biały","M.Fuksja", new double[]{10.0, 9.72, 8.95});

        System.out.println(novela1.toString());
        System.out.println(novela2.toString());

        novela1.addRating(3.1);
        novela2.addRating(7.25);

        System.out.println(novela1.toString());
        System.out.println(novela2.toString());

        novela1.removeRating(2.5);
        novela2.removeRating(10.0);

        System.out.println(novela1.toString());
        System.out.println(novela2.toString());

        System.out.println(novela1.equals(novela2));

        System.out.println(novela1.hashCode());
        System.out.println(novela2.hashCode());




    }
}
