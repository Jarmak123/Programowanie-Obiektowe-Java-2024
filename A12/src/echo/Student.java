package echo;

import java.util.Objects;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public <T> void echoIfEquivalent(T a, T b, T c){
        if(a.equals(b) && b.equals(c) && c.equals(a))
        {
            System.out.println("Wszystkie są równoważne");
        }
    }
}
