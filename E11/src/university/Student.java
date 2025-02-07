package university;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Student {
    public String name;
    public double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    public static <T> int countElements(Collection<T> items, T element){
        int counter = 0;
        for(T i: items){
            if(i.equals(element)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        ArrayList<Student> std = new ArrayList<>();
        std.add(new Student("Andrzej",3.0));
        std.add(new Student("Andrzej",3.0));
        std.add(new Student("Andrzej",3.0));
        std.add(new Student("Józek",5.0));
        std.add(new Student("Amelia",4.0));

        System.out.println(countElements(std,new Student("Andrzej",3.0)));
    }
}
