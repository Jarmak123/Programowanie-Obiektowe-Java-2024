package zad1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Józek",299.99,LocalDate.of(1991,12,23)));
        emp.add(new Employee("Jadzia",2997.99,LocalDate.of(2000,1,3)));
        emp.add(new Employee("Bodzio",2996.99,LocalDate.of(1995,2,12)));
        emp.add(new Employee("Geniek",2995.99,LocalDate.of(2004,12,12)));
        emp.add(new Employee("Halina",2999.99,LocalDate.of(2006,6,5)));

        System.out.println(emp);
        Collections.sort(emp);
        System.out.println(emp);

    }
}
