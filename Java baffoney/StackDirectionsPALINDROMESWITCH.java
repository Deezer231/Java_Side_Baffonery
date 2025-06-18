import java.util.Scanner;
import java.util.Stack;

public class StackDirectionsPALINDROMESWITCH {

    public static void main(String[] args) {
        // OPEN scanner to read user input
        Scanner scanner = new Scanner(System.in);
        String rev = "";
        int count = 1;

        // Create a stack to keep track of directions
        Stack<String> stack = new Stack<>();

        // Continuously read user input
        while (true) {
            System.out.println("Enter your " + count + "th direction");
            String instructionBYuser = scanner.nextLine();
            int length = instructionBYuser.length();
            count++;
            for (int i = length - 1; i >= 0; i--)
                rev = rev + instructionBYuser.charAt(i);
            if (instructionBYuser.equals(rev))
                System.out.println(instructionBYuser + " is a palindrome");
            else
                System.out.println(instructionBYuser + " is not a palindrome");
            // If input is "Arrived", exit the loop
            if (instructionBYuser.equals("Arrived")) {
                break;
            } else if (instructionBYuser.equals("Go Back")) {
                // If input is "Go Back" and stack is not empty, remove the last direction
                if (!stack.isEmpty()) {
                    stack.pop(); // Undo the last instructionBYuser
                }
            } else {
                // Push any other instructionBYuser (direction) onto the stack
                stack.push(instructionBYuser);
            }
        }
        System.out.println("\n" + "Your Directions to get home are: ");
        // Reverse and print directions to backtrack the path
        while (!stack.isEmpty()) {
            String direction = stack.pop();

            System.out.println(reverseDirection(direction));

        }

        // Close the scanner to satisfy goddawm vscode
        scanner.close();
    }

    // Method to reverse the direction
    private static String reverseDirection(String direction) {
        // Use switch expression to provide opposite direction based on input
        return switch (direction) {
            case "Go North" -> "Go South";
            case "Go South" -> "Go North";
            case "Go East" -> "Go West";
            case "Go West" -> "Go East";
            default -> ""; // Return empty string if direction is unrecognized
        };
    }
}
// PUSH = put item on top of stack
// POP = take item from top of stack out