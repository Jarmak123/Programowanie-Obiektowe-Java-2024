package zad1;

public abstract class ComputerGraphic{
    int width;
    int height;
    String filename;

    public ComputerGraphic() {
        this.width = 0;
        this.height = 0;
        this.filename = "sample_name";
    }

    public ComputerGraphic(int width, int height, String filename) {
        this.width = width;
        this.height = height;
        this.filename = filename;
    }

    public abstract void loadFile();
    public abstract void saveFile();
}
