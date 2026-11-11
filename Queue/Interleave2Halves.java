package Queue;

import java.util.*;

public class Interleave2Halves {

    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        // Step 1: Move the first half of elements to firstHalf queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Step 2: Interleave elements from firstHalf and q
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // Add element from first half
            q.add(q.remove());         // Move front element of second half to the back
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        
        // Print Queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}