import java.util.Scanner;

class Node {
    String name;
    int age;
    String degree;
    int yearOfStudy;
    Node next; // Link to the next node

    public Node(String name, int age, String degree, int yearOfStudy) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.yearOfStudy = yearOfStudy;
        this.next = null; // Initially, the next node is null
    }

    // Represent the node as a string
    public String toString() {
        return name + ", " + age + ", " + degree + ", " + yearOfStudy;
    }
}

class LinkedList {
    private Node head; // First node in the linked list

    // Add a new person to the list
    public void add(String name, int age, String degree, int yearOfStudy) {
        Node newNode = new Node(name, age, degree, yearOfStudy);

        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Move to the end of the list
            }
            current.next = newNode; // Add the new node at the end
        }
    }

    // Print all nodes in the list
    public void printList() {
        Node current = head;

        if (current == null) {
            System.out.println("The list is empty.");
        }

        while (current != null) {
            System.out.println(current.toString());
            current = current.next; // Move to the next node
        }
    }

    // Find a person by an attribute and perform an action (print or remove)
    public void findAndAct(String attribute, Object value, String action) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            boolean match = false;

            // Check if the current node matches the given attribute and value
            if (attribute.equalsIgnoreCase("name") && current.name.equals(value)) {
                match = true;
            } else if (attribute.equalsIgnoreCase("age") && current.age == (int) value) {
                match = true;
            } else if (attribute.equalsIgnoreCase("degree") && current.degree.equals(value)) {
                match = true;
            } else if (attribute.equalsIgnoreCase("yearOfStudy") && current.yearOfStudy == (int) value) {
                match = true;
            }

            // Perform the action on the matched node
            if (match) {
                if (action.equalsIgnoreCase("print")) {
                    System.out.println(current.toString());
                } else if (action.equalsIgnoreCase("remove")) {
                    if (previous == null) {
                        head = current.next; // Remove the head node
                    } else {
                        previous.next = current.next; // Remove the current node
                    }
                }
                return; // Exit after the action is performed
            }

            previous = current; // Move previous to the current node
            current = current.next; // Move to the next node
        }

        // If no match is found
        System.out.println("No matching record found.");
    }
}

public class linkedlist_linkclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a name");
        String input = sc.nextLine();
        System.out.println("input an age");
        int age = sc.nextInt();
        System.out.println("input an degree");
        // String degree = sc.nextLine();
        String degreee = sc.nextLine();
        System.out.println("input an yos");
        int yos = sc.nextInt();
        LinkedList list = new LinkedList();

        // Add some people to the list
        list.add("Bunny", 26, "CSSE", 2);
        list.add(input, age, degreee, yos);
        list.add("Steve", 32, "ComputationalThinking", 4);
        list.add("Steve", 32, "ComputationalThinking", 4);

        // Print the entire list
        System.out.println("Print List:");
        list.printList();

        // Find and print a person by name
        System.out.println("\nFind and Print (Name: Bunny):");
        list.findAndAct("name", "Bunny", "print");

        // Find and remove a person by age
        System.out.println("\nRemove (Age: 32):");
        list.findAndAct("age", 32, "remove");

        // Print the list after removal
        System.out.println("\nPrint List After Removal:");
        list.printList();
    }
}
