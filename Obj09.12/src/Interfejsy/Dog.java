package Interfejsy;

public class Dog extends Animal implements LoudAnimal{

    public Dog(String nazwa){
        super(nazwa);
    }

    @Override
    public void makeNoise() {
        System.out.println("Hau Hau");
    }
}
