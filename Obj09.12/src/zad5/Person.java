package zad5;

import java.time.LocalDate;
import java.util.Comparator;

public class Person{
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return " "+firstName+" "+lastName;
    }

}

class FirstLastNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.lastName.compareTo(o2.lastName)==0)
        {
            return o1.firstName.compareTo(o2.firstName);
        }
        return o1.lastName.compareTo(o2.lastName);
    }
}
