package Interfejsy;

public class Cat extends Animal implements LoudAnimal{

    public Cat(String nazwa){
        super(nazwa);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau");
    }
}
