package zad5;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GenericQueue <T>{
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T element){
        queue.add(element);
    }

    public T dequeue(){
        if(queue.isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }
}
