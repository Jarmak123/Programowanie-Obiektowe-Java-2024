package moto;

public class Vehicle implements Comparable<Vehicle> {
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
        return Integer.compare(o.speed,this.speed);
    }

    //////////////////////////////////////////////////////////////////////////

    public static <T extends Comparable<T>> T maxValue(T[] array){
        if(array==null || array.length==0)
        {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T max = array[0];

        for(T i: array)
        {
            if(max.compareTo(i)>0)
            {
                max=i;
            }
        }

        return max;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Vehicle[] tab = new Vehicle[5];

        tab[0]=new Vehicle("Fiat Punto",120);
        tab[1]=new Vehicle("Ferrari Italia",370);
        tab[2]=new Vehicle("Opel Astra",150);
        tab[3]=new Vehicle("Seat Leon",180);
        tab[4]=new Vehicle("Lotus Omega",320);

        for(Vehicle i : tab)
        {
            System.out.println(i);
        }


        System.out.println("Najwiekszą predkośc z listy to: "+maxValue(tab));

    }

}
