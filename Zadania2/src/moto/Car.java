package moto;

public class Car implements Vehicle{

    @Override
    public void startEngine(String fuelType) {
        if(fuelType.equals("diesel") || fuelType.equals("benzyna"))
        {
            System.out.println("Silnik uruchomiony z użyciem "+fuelType);
        }
        else{
            System.out.println("Nieznany typ paliwa");
        }
    }

    @Override
    public boolean canDrive(int fuelLevel) {
        return (fuelLevel>5);
    }
}
