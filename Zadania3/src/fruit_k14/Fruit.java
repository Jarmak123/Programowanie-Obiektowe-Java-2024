package fruit_k14;

import java.util.ArrayList;

public class Fruit implements Comparable<Fruit>{
    public String name;
    public double sweetness;

    public Fruit(String name, double sweetness) {
        this.name = name;
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", sweetness=" + sweetness +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        return Double.compare(this.sweetness,o.sweetness);
    }

    public static <T extends Comparable<T>> T firstMinValue(T[] arr){
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Tablica nie moze byc pusta");
        }

        T first_min = arr[0];

        for(T i: arr){
            if(i.compareTo(first_min)<0)
            {
                first_min=i;
            }
        }

        return first_min;
    }

    public static void main(String[] args) {
        Fruit[] frt = new Fruit[3];
        frt[0]= new Fruit("japko", 2);
        frt[1]= new Fruit("pomarancza",32.1);
        frt[2]= new Fruit("grucha",1.25);

        System.out.println(firstMinValue(frt));

    }
}
