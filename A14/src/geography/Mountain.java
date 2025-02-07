package geography;

import java.util.ArrayList;

public class Mountain implements Cloneable{
    private String name;
    private ArrayList<Double> heights;

    public Mountain(String name, ArrayList<Double> heights) {
        if(heights.size()>5)
        {
           throw new IndexOutOfBoundsException("Za duża tablica");
        }

        this.name = name;
        this.heights = heights;
    }

    public void setHeights(int index, double value){
        if(index>=0 && index<heights.size()){
            heights.set(index,value);
        }else{
            throw new IndexOutOfBoundsException("Nieprawidłowy index");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getHeights() {
        return heights;
    }



    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", heights=" + heights +
                '}';
    }

    @Override
    public Mountain clone() {
        try {
            Mountain clone = (Mountain) super.clone();
            clone.heights = new ArrayList<>(this.heights);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
