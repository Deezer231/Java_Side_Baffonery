import java.util.HashMap;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListWithLoop {
    Node head;

    // Method to detect the loop and return the data of the node causing the loop
    public String detectLoop() {
        HashMap<Node, Boolean> visitedNodes = new HashMap<>();
        Node current = head;

        while (current != null) {
            // If the node is already in the map, we've found the loop
            if (visitedNodes.containsKey(current)) {
                return current.data; // Node causing the loop
            }
            // Mark the node as visited
            visitedNodes.put(current, true);
            current = current.next;
        }

        return "No Loop Detected";
    }

    public static void main(String[] args) {
        LinkedListWithLoop list = new LinkedListWithLoop();

        // Create a linked list with a loop
        list.head = new Node("Link 1");
        Node second = new Node("Link 2");
        Node third = new Node("Link 3");
        Node fourth = new Node("Link 4");
        Node fifth = new Node("Link 5");
        Node sixth = new Node("Link 6");

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third; // Creates a loop pointing back to "Link 3"

        // Detect and print the node causing the loop
        System.out.println("The link causing the loop is: " + list.detectLoop());
    }
}
