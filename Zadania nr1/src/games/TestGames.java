package games;

public class TestGames {
    public static void main(String[] args) {
        ComputerGame g1 = new ComputerGame("Wiedzmin","CDPR",new double[]{2.3,5.4,2.1});
        ComputerGame g2 = new ComputerGame("MySummerCar","Amsi",new double[]{5.1,5.15,10.0});

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g1.equals(g2));
        g1.addRatings(4.20);
        System.out.println(g1.toString());
        g1.removeRating(2.3);
        System.out.println(g1.toString());

    }
}
