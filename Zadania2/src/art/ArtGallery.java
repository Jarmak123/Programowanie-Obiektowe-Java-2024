package art;

public class ArtGallery {
    private String name;
    private static ArtGallery instance;

    public ArtGallery(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArtGallery{" +
                "name='" + name + '\'' +
                '}';
    }

    public static ArtGallery getInstance(String name){
        if(instance==null){
            instance = new ArtGallery(name);
        }
        return instance;
    }
}
