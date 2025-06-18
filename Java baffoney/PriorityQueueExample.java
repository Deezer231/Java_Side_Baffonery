import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Queue Size: ");
        int count = 1;
        int Scizor = Sc.nextInt();
        // Create a priority queue with initial capacity determined by user
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // ***CONSTRUCTOR */
        System.out.println("PriorityQueue created with an initial capacity of " + Scizor);

        while (true) {
            System.out.println("Enter your " + count + "th direction");
            int instructionBYuser = Sc.nextInt();

            if (instructionBYuser == -1) {
                System.out.println("Exiting...");
                break;
            }
            if (pq.size() >= Scizor) {
                System.out.println("The PriorityQueue is full. Cannot add more elements.");
                break;
            } else {
                pq.add(instructionBYuser);
                System.out.println("Added " + instructionBYuser + " to the PriorityQueue");
            }
            // Print the queue
            System.out.println("Priority queue: " + pq);

            // Get the size of the queue
            System.out.println("Size of queue: " + pq.size()); // ***SIZE */

            // Peek at the top element of the queue
            System.out.println("Peek: " + pq.peek()); // ***PEEK */

            // Remove elements from the queue
            pq.remove(1); // ***REMOVE */

            // Print the queue again
            System.out.println("Priority queue: " + pq);

            // Check if the queue is empty
            System.out.println("Is the queue empty? " + pq.isEmpty()); // ***isEMPTY */

            // Check if the queue is FULL
            System.out.println("Is the queue full? " + (pq.size() >= Scizor)); // ***isfULL */

            count++;
            // Check if the queue contains a specific element
            // System.out.println("Does the queue contain 3? " + pq.contains(3));
        }
    }
}

// https://www.programiz.com/java-programming/priorityqueue
// https://www.geeksforgeeks.org/priority-queue-class-in-java/
// COMPARITOR METHOD
// https://www.geeksforgeeks.org/priorityqueue-comparator-method-in-java/