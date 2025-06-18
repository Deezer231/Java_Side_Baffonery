import java.util.Scanner;

public class PriorityQueueExamplef5rFINAL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the queue size:");
        int maxSize = sc.nextInt();
        int count = 1;

        PriorityQueueCustom pq = new PriorityQueueCustom(maxSize); // Create a custom priority queue determined by user
                                                                   // input (maxsize)
        System.out.println("PriorityQueue created with a size of " + maxSize);

        while (true) {
            System.out.println("Enter your " + count + "th input (or -1 to exit):");
            int input = sc.nextInt();

            if (input == -1) {
                System.out.println("Exiting...");
                break;
            }

            if (pq.isFull()) {
                System.out.println("The Priority Queue is full. Cannot add more elements.");
                break;
            } else {
                pq.insert(input);
                System.out.println("Added " + input + " to the PriorityQueue.");
            }

            // Print the queue
            pq.printQueue();

            // Peek at the top element
            System.out.println("Peek: " + pq.peek());

            // Check if queue is empty or full
            System.out.println("Is the queue empty? " + pq.isEmpty());
            System.out.println("Is the queue full? " + pq.isFull());

            count++;
        }

        sc.close();
    }
}

class PriorityQueueCustom {
    int[] queue;
    int maxSize;
    int currentSize;

    // My Constructor method
    public PriorityQueueCustom(int size) {
        maxSize = size;
        queue = new int[maxSize];
        currentSize = 0;
    }

    // My Insert method method
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full asf. Cannot insert " + value);
            return;
        }
        queue[currentSize++] = value;
        sortQueue(); // Sort the queue after insertion
    }

    // My Peek method method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No elements to peek.");
            return -1;
        }
        return queue[0];
    }

    // isEmpty method
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // isFull method
    public boolean isFull() {
        return currentSize >= maxSize;
    }

    // My Print queue method
    public void printQueue() {
        System.out.print("Priority Queue: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queue[i] + (i < currentSize - 1 ? ", " : ""));
        }
        System.out.println();
    }

    // Manually sorts da the queue in ascending order
    private void sortQueue() {
        for (int i = 0; i < currentSize - 1; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if (queue[i] > queue[j]) {
                    int temp = queue[i];
                    queue[i] = queue[j];
                    queue[j] = temp;
                }
            }
        }
    }
}
