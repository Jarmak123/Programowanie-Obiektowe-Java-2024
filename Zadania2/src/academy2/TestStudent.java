package academy2;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Integer> sg = new ArrayList<>();
        sg.add(2);
        sg.add(3);
        sg.add(4);
        sg.add(5);

        Student s1 = new Student("Zajkowski",sg);
        Student s2 = null;

        s2 = (Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);

        s2.changeGrade(0,5);
        System.out.println("///////////");

        System.out.println(s1);
        System.out.println(s2);

    }
}
