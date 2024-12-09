package zad1;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    String name;
    Double salary;
    LocalDate employmentDate;

    public Employee(String name, Double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return ""+salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary,o.salary);
    }
}


