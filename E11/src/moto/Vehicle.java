package moto;

import java.lang.reflect.Array;

public class Vehicle implements Comparable<Vehicle>{
    public String model;
    public int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.speed,o.speed);
    }

    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array==null || array.length==0)
        {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T max = array[0];

        for(T i: array){
            if(i.compareTo(max)>0){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[3];
        arr[0]=new Vehicle("Fiat Punto",120);
        arr[2]=new Vehicle("Opel Astra",130);
        arr[1]=new Vehicle("Ferrari Testarosa",350);

        for(Vehicle i: arr){
            System.out.println(i);
        }
        System.out.println(".........");
        System.out.println(maxValue(arr));

    }
}
