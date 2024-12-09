package zad7;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Marek","Angielski",3);
        Teacher t2 = null;
        try{
            t2 = (Teacher) t1.clone();
        } catch (CloneNotSupportedException e)
        {
            System.out.println("Nie da sie");
        }

        System.out.println(t1);
        System.out.println(t2);
        t1.experience=0;
        System.out.println(t1);
        System.out.println(t2);


    }
}
