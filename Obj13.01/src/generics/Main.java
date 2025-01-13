package generics;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Animal animal2 = new Animal("Reksio");
        Box<Animal,String> box1 = new Box<>(animal, "cześć");
        Box<Animal,Animal> box2 = new Box<>(animal, animal2);

//        box1.get().dajGlos();
//
//        Box<String> box2 = new Box<>("Część");
//        System.out.println(box2.get());

        System.out.println(animal);
        wypisz(animal);
        //wypisz("Cześć");
    }

    public static <T extends Animal> void wypisz(T obj){
        System.out.println(obj);
    }
}
