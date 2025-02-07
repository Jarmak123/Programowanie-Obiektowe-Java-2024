package book_k22;

public class Student implements Comparable<Student> {
    public String name;
    public String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public static void main(String[] args) {
        Student[] ar = new Student[4];
        ar[0] = new Student("Jacek", "Zgorczyk");
        ar[1] = new Student("Dobrodziej", "Siemaszko");
        ar[2] = new Student("Dobrodziej", "Siemaszko");
        ar[3] = new Student("Dobrodziej", "Siemaszko");

        System.out.println(UtilMostFrequentValue.mostFrequentValue(ar));
    }
}
