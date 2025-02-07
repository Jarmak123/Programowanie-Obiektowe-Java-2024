package music4;

public class TestSong {
    public static void main(String[] args) {
        Song sng = new Song("Problem","A. Grande",23);
        Song sng1 = new Song("HUj","A. Grande",23);

        System.out.println(sng.equals(sng1));

    }
}
