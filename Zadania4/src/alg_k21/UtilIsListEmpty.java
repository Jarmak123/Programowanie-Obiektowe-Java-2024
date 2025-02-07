package alg_k21;

import java.util.LinkedList;

public class UtilIsListEmpty {
    public static <E> boolean isListEmpty(LinkedList<E> list){
        return (list.isEmpty());
    }

    public static void main(String[] args) {
        LinkedList<Person> prs = new LinkedList<>();
        prs.add(new Person("JACEK",20));

        LinkedList<Person> prs1 = new LinkedList<>();

        System.out.println(isListEmpty(prs));
        System.out.println(isListEmpty(prs1));

    }
}
