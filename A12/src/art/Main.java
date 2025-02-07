package art;

public class Main {
    public static void main(String[] args) {
        ArtGallery gallery1 = ArtGallery.getInstance("Galeria Wolska");
        ArtGallery gallery2 = ArtGallery.getInstance("Galeria Wolska");
        ArtGallery gallery3 = ArtGallery.getInstance("Galeria WWA");
        ArtGallery gallery4 = ArtGallery.getInstance("Galeria Saska");

        System.out.println(gallery1.getName());
        System.out.println(gallery2.getName());
        System.out.println(gallery3.getName());
        System.out.println(gallery4.getName());

        System.out.println(gallery1==gallery2);
        System.out.println(gallery1==gallery3);
        System.out.println(gallery1==gallery4);


    }
}
