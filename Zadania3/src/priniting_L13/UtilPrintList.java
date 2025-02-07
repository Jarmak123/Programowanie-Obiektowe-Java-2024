package priniting_L13;

import java.util.LinkedList;

public class UtilPrintList {
    public static <T> void printList(LinkedList<T> list){
        for(T i: list)
        {
            System.out.println(i);
        }
    }
}
