import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>,Cloneable{
    String name;
    double sredniaOcen;
    int rokUrodzenia;

    public Student(String name, double sredniaOcen, int rokUrodzenia) {
        this.name = name;
        this.sredniaOcen = sredniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return sredniaOcen+" "+rokUrodzenia;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ziutson", 5.0, 2000));
        students.add(new Student("Fiutson", 4.2, 2001));
        students.add(new Student("Kulson", 4.9, 2002));

        System.out.println(students);
//        Collections.sort(students);
//        Collections.sort(students, new AvgGradeStudentComparator());
//        System.out.println(students);
//        //students.sort(new YearOfBirthStudentComparator());
//        Collections.sort(students, new YearOfBirthStudentComparator());
//        System.out.println(students);
        Collections.sort(students);
        Student s1 = new Student("A",3.5, 2004);
        Student s2 = null;

        try{
            s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Nie da rady sklonować");
        }

        s2.name = "B";
        System.out.println(s2.name);
        System.out.println(s1.name);


        //System.out.println(students);
    }

    @Override
    public int compareTo(Student o) {
        if(Double.compare(this.sredniaOcen,o.sredniaOcen)==0)
        {
            return Integer.compare(o.rokUrodzenia, this.rokUrodzenia);
        }
        else
        {
            return Double.compare(this.sredniaOcen, o.sredniaOcen);
        }
    }
}

class YearOfBirthStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.rokUrodzenia, o1.rokUrodzenia);
    }
}

class AvgGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.sredniaOcen,o2.sredniaOcen);
    }
}

