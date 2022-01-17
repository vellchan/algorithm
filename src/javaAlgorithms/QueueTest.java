package javaAlgorithms;

import java.util.ArrayList;

public class QueueTest<T> {
    private ArrayList<T> queue = new ArrayList<>();
    public static void main(String[] args) {
        QueueTest<Integer> queueTest = new QueueTest<Integer>();
        queueTest.enqueue(1);
        queueTest.enqueue(2);
        System.out.println(queueTest.dequeue());
        System.out.println(queueTest.dequeue());

    }

    private T dequeue() {
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0);
    }

    private void enqueue(T i) {
        queue.add(i);
    }
}
