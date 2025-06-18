import java.util.Scanner;
import java.util.Stack;

public class StackDirectionsPALINDROMEZESWITCH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;

        Stack<Character> stack = new Stack<>();

        while (true) {
            System.out.println("Enter your " + count + "th direction");
            String instructionBYuser = scanner.nextLine();
            boolean isPalindrome = true;

            // Push all characters onto the stack
            for (char c : instructionBYuser.toCharArray()) {
                stack.push(c);
            }

            for (char c : instructionBYuser.toCharArray()) {
                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(instructionBYuser + " is a palindrome");
            } else {
                System.out.println(instructionBYuser + " is not a palindrome");
            }

            count++;
        }
    }
}
