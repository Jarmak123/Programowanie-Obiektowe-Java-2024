package university;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    /////////////////////////////////////////////////

    public static <T> int countElements(Collection<T> items, T element){
        int how_much =0;

        for(T item: items)
        {
            if(item.equals(element)){
                how_much++;
            }
        }

        return how_much;
    }

    ////////////////////////////////////////////////

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Andrzej",5.0));
        students.add(new Student("Józek",3.0));
        students.add(new Student("Zosia",2.0));
        students.add(new Student("Tosia",4.0));
        students.add(new Student("Albert",3.27));
        students.add(new Student("Zosia",3.2));
        students.add(new Student("Zosia",3.2));

        System.out.println(countElements(students,new Student("Zosia",3.2)));

    }

}
