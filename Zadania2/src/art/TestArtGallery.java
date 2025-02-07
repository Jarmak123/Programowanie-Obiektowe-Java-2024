package art;

public class TestArtGallery {
    public static void main(String[] args) {
        ArtGallery ag = ArtGallery.getInstance("Wolska");
        ArtGallery ag1 = ArtGallery.getInstance("Tolska");
        ArtGallery ag2 = ArtGallery.getInstance("Opolska");

        System.out.println(ag);
        System.out.println(ag1);
        System.out.println(ag2);
    }
}
