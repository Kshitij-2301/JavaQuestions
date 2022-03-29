package priorityqueue;

import java.util.EmptyStackException;

public class Main {

    // Main Method
    public static void main(String args[]) {

        PriorityQueueDemo pQueue = new PriorityQueueDemo();

        // Adding items to the pQueue using add()
        pQueue.enqueue(100);
        pQueue.enqueue(220);
        pQueue.enqueue(157);
        pQueue.enqueue(51);

        if (pQueue.size() > 0) {

            // Traversing and Printing the complete Priority Queue
            pQueue.print();

            // Implementing Dequeue operation for the highest priority object from the Priority Queue
            pQueue.dequeue();
            System.out.println("Dequeue executed");

            // Implementing Peek operation for the highest priority object from the Priority Queue
            System.out.println(pQueue.peek());

            // Implementing Contains operation for the Priority Queue
            if (Boolean.TRUE.equals(pQueue.contains(5))) {
                System.out.println("The Priority Queue contains the element");
            } else {
                System.out.println("The Priority Queue doesn't contain the element");
            }

            // Implementing Size operation for the Priority Queue
            System.out.println("Size of the Priority Queue is: " + pQueue.size());

            // Determining the center of the Priority Queue
            System.out.println(pQueue.center());

        } else {
            throw new EmptyStackException();     //Exceptional Handling
        }
    }
}
