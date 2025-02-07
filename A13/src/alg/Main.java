package alg;

import java.util.TreeSet;

public class Main {
    public static <E> boolean isUnique(TreeSet<E> elements){
        if(elements == null)
        {
            throw new IllegalArgumentException("Argument nie może być nullem");
        }

        for(E e1: elements)
        {
            for(E e2: elements)
            {
                if(e1!=e2 && e1.equals(e2))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(3);

        try{
            System.out.println(isUnique(null));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(set1);
        System.out.println(isUnique(set1));

    }


}
