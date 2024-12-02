package zad1;

public class Bitmap extends ComputerGraphic{
    public Bitmap(int width, int height, String filename) {
        super(width, height, filename);
    }

    @Override
    public void saveFile() {
        System.out.println("Zapisano bitmapę o szerokości: "+this.width+" wysokości: "+this.height+" i o nazwie "+this.filename);
    }

    @Override
    public void loadFile() {
        System.out.println("Wczytano bitmapę o szerokości: "+this.width+" wysokości: "+this.height+" i o nazwie "+this.filename);
    }
}
