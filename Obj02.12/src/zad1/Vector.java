package zad1;

public class Vector extends ComputerGraphic{
    public Vector(int width, int height, String filename) {
        super(width, height, filename);
    }

    @Override
    public void saveFile() {
        System.out.println("Zapisano vector o szerokości: "+this.width+" wysokości: "+this.height+" i o nazwie "+this.filename);
    }

    @Override
    public void loadFile() {
        System.out.println("Wczytano vector o szerokości: "+this.width+" wysokości: "+this.height+" i o nazwie "+this.filename);
    }
}
