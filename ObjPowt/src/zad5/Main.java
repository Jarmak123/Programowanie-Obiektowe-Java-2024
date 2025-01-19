package zad5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericQueue<Integer> l1 = new GenericQueue<>();
        l1.enqueue(1);
        l1.enqueue(2);
        l1.enqueue(3);

        System.out.println(l1.dequeue());
        System.out.println(l1.dequeue());
        System.out.println(l1.dequeue());
        System.out.println(l1.dequeue());
    }
}
