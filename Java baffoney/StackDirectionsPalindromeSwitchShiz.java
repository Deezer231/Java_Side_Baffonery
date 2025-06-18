import java.util.Scanner;
import java.util.Stack;

public class StackDirectionsPalindromeSwitchShiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>(); // Stack to store directions
        Stack<String> reversedStack = new Stack<>(); // Stack to check palindrome
        int count = 1;

        System.out.println("Enter directions one by one. Type 'done' when you are finished.");

        while (true) { // Input loop
            // Prompt the user for input
            System.out.println("Enter your " + count + getSuffix(count) + " direction:");
            String input = scanner.nextLine();

            // Break condition to stop taking directions if "done"
            if (input.equalsIgnoreCase("done")) {

                break;
            }

            stack.push(input);
            reversedStack.push(input);
            count++;
        }

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

    // Helper method to determine the suffix for the count
    private static String getSuffix(int count) {
        if (count % 100 >= 11 && count % 100 <= 13) {
            return "th";
        }
        switch (count % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
