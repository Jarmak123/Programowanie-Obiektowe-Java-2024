package exceptions;

public class SklepMonopolowy {

    public static void checkAge(int age)
    {
        if(age<18)
        {
            throw new IllegalArgumentException("Klient nie ma 18 lat!"); //runtime exception
        }
        else
        {
            System.out.println("Wiek zweryfikowano pomyślnie");
        }
    }

    public static void main(String[] args) {
        checkAge(25);
        checkAge(18);
        try {
            checkAge(15);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        checkAge(20);
    }

}
