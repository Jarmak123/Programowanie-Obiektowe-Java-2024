package Zad3;

public record PointR(int x, int y) {
    public PointC rtoC(){
        return new PointC(x,y);
    }
}
