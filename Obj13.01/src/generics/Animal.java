package generics;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void dajGlos(){
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
