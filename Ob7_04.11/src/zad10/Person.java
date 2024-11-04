package zad10;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        for(char i: firstName.toCharArray())
        {
            if(Character.isAlphabetic(i)==false)
            {
                this.firstName="-";
                break;
            }
        }

        for(char i: lastName.toCharArray())
        {
            if(Character.isAlphabetic(i)==false)
            {
                this.lastName="-";
                break;
            }
        }

        if(!firstName.isEmpty() || firstName==null)
        {
            this.firstName = "-";
        }

        if(lastName.isEmpty() || lastName==null)
        {
            this.lastName = "-";
        }


    }
}
