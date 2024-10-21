package Zadanie5;

import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        if(age<0)
        {
            age=0;
        }

        if(firstName==null || firstName.isEmpty())
        {
            firstName="-";
        }

        if(lastName==null || lastName.isEmpty())
        {
            lastName="-";
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person:\n" +
                firstName + ' ' +
                lastName +
                ", Age:" + age +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
