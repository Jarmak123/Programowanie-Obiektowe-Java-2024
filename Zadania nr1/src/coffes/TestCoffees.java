package coffes;

import java.util.ArrayList;

public class TestCoffees {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("Good");
        str1.add("Tasty");
        str1.add("Okay");

        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Okay");
        str2.add("Awful");
        str2.add("Could be better");

        CoffeBlend cb1 = new CoffeBlend("MKCafe","Singapur",str1);
        CoffeBlend cb2 = new CoffeBlend("Jacobs","Germany",str2);

        System.out.println(cb1);
        System.out.println(cb2);
        System.out.println("////////////");
        System.out.println(cb1.getFlavorNotes());
        cb1.removeNote("Good");
        cb1.addNote("Soo good");
        System.out.println(cb1.getFlavorNotes());
        System.out.println(cb1.toString());
        System.out.println(cb1.equals(cb2));
        System.out.println(cb1.hashCode());
        System.out.println(cb2.hashCode());

    }
}
