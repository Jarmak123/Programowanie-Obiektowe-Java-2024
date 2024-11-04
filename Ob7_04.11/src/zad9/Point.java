package zad9;

public class Point {
    int x;
    int y;
    int z;

    public Point(int x, int y, int z) {
        if(x>100){
            x=100;
        }
        else if(x<-100)
        {
            x=-100;
        }
        if(y>100){
            y=100;
        }
        else if(y<-100)
        {
            y=-100;
        }
        if(z>100){
            z=100;
        }
        else if(z<-100)
        {
            z=-100;
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
