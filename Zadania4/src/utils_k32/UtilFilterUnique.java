package utils_k32;

import java.util.*;

public class UtilFilterUnique {
    public static <T> void filterUnique(Collection<T> items){
        Collection<T> unikaty = new ArrayList<>();

        for(T i: items){
            if(!unikaty.contains(i)){
                unikaty.add(i);
            }
        }
        items.clear();

        for(T i: unikaty){
            items.add(i);
        }
    }

    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        students.add(new Student("Jacek","debil"));
        students.add(new Student("Staszek","debil"));
        students.add(new Student("Jacek","debil"));
        students.add(new Student("Bertram","debil"));

        System.out.println(students);
        filterUnique(students);
        System.out.println(students);

    }
}
