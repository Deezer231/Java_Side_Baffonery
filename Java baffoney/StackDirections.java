import java.util.Scanner;
import java.util.Stack;

public class StackDirections {
    public static void main(String[] args) {
        // Create a new stack
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st direction: ");
        String w = sc.nextLine();
        System.out.println("Enter your 2nd direction: ");
        String x = sc.nextLine();
        System.out.println("Enter your 3rd direction: ");
        String y = sc.nextLine();
        System.out.println("Enter your 4th direction: ");
        String z = sc.nextLine();

        // Push elements onto the stack
        // System.out.println("Enter your 1st direction: ");
        stack.push(w);
        // System.out.println("Enter your 2nd direction: ");
        stack.push(x);
        // System.out.println("Enter your 3rd direction: ");
        stack.push(y);
        // System.out.println("Enter your 4th direction: ");
        stack.push(z);

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Your directions are" + "\n" + stack.pop());
        }
    }
}
