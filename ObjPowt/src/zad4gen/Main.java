package zad4gen;

import java.util.Arrays;

public class Main {
    public static <T extends Comparable<T>> T sortandReturnFirst(T[] arr) throws EmptyArrayException{
        if(arr == null || arr.length ==0)
        {
            throw new EmptyArrayException("Lista nie moze byc pusta");
        }

        Arrays.sort(arr);

        return arr[0];
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Hobbit","Tolkien"),
                new Book("Lord","Hitlere"),
                new Book("A","Tolkien"),
        };

        try {
            Book result = sortandReturnFirst(books);
            System.out.println(result);
        } catch (EmptyArrayException e) {
            System.out.println(e.getMessage());
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
