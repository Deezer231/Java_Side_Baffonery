// Java program for making loop at k-th index 
// of given linked list 
class loopatkthposition {

    // Link list node /
    static class Node {
        int data;
        Node next;
    }

    // Function to make loop at k-th elements of
    // linked list /
    static Node makeloop(Node head_ref, int k) {
        // traverse the linked list until loop
        // point not found
        Node temp = head_ref;
        int count = 1;
        while (count < k) {
            temp = temp.next;
            count++;
        }

        // backup the joint point
        Node joint_point = temp;

        // traverse remaining nodes
        while (temp.next != null)
            temp = temp.next;

        // joint the last node to k-th element
        temp.next = joint_point;
        return head_ref;
    }

    // Function to push a node /
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    // Function to print linked list /
    static void printList(Node head, int total_nodes) {
        Node curr = head;
        int count = 0;
        while (count < total_nodes) {
            count++;
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static int countNodes(Node ptr) {
        int count = 0;
        while (ptr != null) {
            ptr = ptr.next;
            count++;
        }
        return count;
    }

    // Driver code
    public static void main(String args[]) {
        // Create a linked list 1.2.3.4.5.6.7
        Node head = null;
        head = push(head, 7);
        head = push(head, 6);
        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);

        // k should be less than the
        // numbers of nodes
        int k = 4;
        int total_nodes = countNodes(head);

        System.out.print("\nGiven list\n");
        printList(head, total_nodes);

        head = makeloop(head, k);

        System.out.print("\nModified list\n");
        printList(head, total_nodes);
    }
}
