package priniting_L13;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkl = new LinkedList<>();
        linkl.add(1);
        linkl.add(2);
        linkl.add(3);
        linkl.add(4);

        UtilPrintList.printList(linkl);
    }
}
