package echo;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Józek",20);
        Student student2 = new Student("Staszek",20);
        Student student3 = new Student("Piotrek",20);

        student1.echoIfEquivalent(student1,student2,student3);
    }
}
