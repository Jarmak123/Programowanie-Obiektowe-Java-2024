package Zad3;

public class PointC {
    int x;
    int y;
    public PointC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointR rtoC(){
        return new PointR(x, y);
    }
}
