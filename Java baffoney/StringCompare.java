import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the strings using compareTo
        int result = str1.compareTo(str2);

        // Determine their alphabetical order
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in the alphabet.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in the alphabet.");
        } else {
            System.out.println("\"" + str1 + "\" is the same as \"" + str2 + "\" in the alphabet.");
        }

        scanner.close();
    }
}
