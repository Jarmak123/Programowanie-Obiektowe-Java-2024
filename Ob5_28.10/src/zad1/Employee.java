package zad1;

public class Employee extends Person{
    public void displayData(){
        System.out.println(super.getFirstName() +" "+ super.getLastName());
    }

    public Employee(String firstName, String lastName){
        super(firstName,lastName);
    }
    public Employee(){

    }
}
