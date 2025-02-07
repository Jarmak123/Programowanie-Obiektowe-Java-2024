package academy;

import java.util.Arrays;

public class Student implements Cloneable{
    private String name;
    private int[] grades = new int[5];

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = Arrays.copyOf(grades,grades.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void changeGrade(int index, int newGrade){
        this.grades[index]=newGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student clone  = (Student) super.clone();
        clone.grades = Arrays.copyOf(grades,grades.length);
        return clone;
    }
}
