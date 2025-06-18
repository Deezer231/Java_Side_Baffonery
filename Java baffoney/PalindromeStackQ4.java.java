import java.util.Scanner;
import java.util.Stack;

public class PalindromeStackQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>(); // Stack to store directions
        Stack<String> reversedStack = new Stack<>(); // Stack to check palindrome

        // Check if shiuz is palindrome
        boolean isPalindrome = true;
        for (String direction : stack) {
            String reversedDirection = reversedStack.pop();
            if (!direction.equalsIgnoreCase(reversedDirection)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The sequence of directions forms a palindrome.");
        } else {
            System.out.println("The sequence of directions does not form a palindrome.");
        }

        scanner.close();
    }

}
