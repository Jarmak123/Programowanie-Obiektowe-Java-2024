package games;

public class Main {
    public static void main(String[] args) {
        double[] rate = {2.5, 10.5, 5.5};
        ComputerGame game = new ComputerGame("Wiedzmin","CDPR", rate);
        ComputerGame game1 = new ComputerGame("Wiedzmin1","CDPR", rate);

        System.out.println(game.toString());
        game.addRating(2.5);
        System.out.println(game.toString());
        game.removeRating(10.5);
        System.out.println(game.toString());

        System.out.println(game.equals(game1));
    }
}
