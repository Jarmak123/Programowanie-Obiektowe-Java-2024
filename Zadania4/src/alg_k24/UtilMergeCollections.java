package alg_k24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilMergeCollections {
    public static <T> Collection<T> mergeCollections(Collection<T> collection1, Collection<T> collection2){
        Collection<T> new_collection = new ArrayList<>(collection1);
        for(T i: collection2){
            if(!new_collection.contains(i))
            {
                new_collection.add(i);
            }
        }
        return new_collection;
    }

    public static void main(String[] args) {
        Collection<Employee> are = new ArrayList<>();
        are.add(new Employee("Jacek","Obsługa"));
        are.add(new Employee("Wacek","Obsługa"));


        List<Employee> are1 = new ArrayList<>();
        are1.add(new Employee("Jacek","Obsługa"));
        are1.add(new Employee("Saszka","Obsługa"));
        are1.add(new Employee("Traszka","Obsługa"));

        Collection<Employee> are3 = mergeCollections(are, are1);

        System.out.println(are);
        System.out.println(are1);
        System.out.println(are3);

    }
}
