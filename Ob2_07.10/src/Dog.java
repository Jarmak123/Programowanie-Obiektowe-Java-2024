public class Dog {
    String name;
    String breed;
    int age;

    public void bark(){
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog pies = new Dog();
        pies.bark();
    }
}

