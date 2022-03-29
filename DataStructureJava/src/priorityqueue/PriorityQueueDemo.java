package priorityqueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

class PriorityQueueDemo {

    PriorityQueue<Integer> pQueue;

    public PriorityQueueDemo() {
        pQueue = new PriorityQueue<Integer>();
    }

    // Enqueue operation on the Priority Queue
    public void enqueue(int element) {
        pQueue.add(element);
    }

    // Dequeue(Highest Priority) operation on the Priority Queue
    public void dequeue() {
        pQueue.remove(peek());
    }

    // Peek(Highest Priority) operation on the Priority Queue
    public int peek() {

        Iterator<Integer> iterator = pQueue.iterator();     //Using Iterator to iterate the Priority Queue
        int highestPriorityElement = 0;

        while (iterator.hasNext()) {
            highestPriorityElement = iterator.next();
        }
        return highestPriorityElement;
    }

    // Contains operation on the Priority Queue
    public boolean contains(int element) {
        return pQueue.contains(element);
    }

    // Size operation on the Priority Queue
    public int size() {
        return pQueue.size();
    }

    // Finding Center elements of the Priority Queue
    public ArrayList<Integer> center() {

        ArrayList<Integer> centerElement = new ArrayList<>();
        int counter = 0;
        Iterator<Integer> iterator = pQueue.iterator();

        if (pQueue.size() % 2 == 0) {
            while (counter < (pQueue.size() / 2) - 1) {
                iterator.next();
                counter++;
            }
            centerElement.add(iterator.next());     //Adding two centre elements in the array when the size is odd.
            centerElement.add(iterator.next());
        } else {
            if (pQueue.size() > 1) {
                while (counter < (pQueue.size() / 2) - 1) {
                    iterator.next();
                    counter++;
                }
                centerElement.add(iterator.next());     //Adding single centre element in the array when the size is even.
            } else {
                centerElement.add(pQueue.peek());
            }
        }
        return centerElement;
    }

    // Traversing and Printing the complete Priority Queue
    public void print() {
        Iterator iterator = pQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

}