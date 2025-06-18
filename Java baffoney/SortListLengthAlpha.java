import java.util.Scanner;

public class SortListLengthAlpha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user for the number of words, between the range of 1 to 100
        System.out.println("Input an integer between 1 and 100:");
        int x = input.nextInt();

        // Ensure the user inputs a valid number between 1 and 100
        while (x < 1 || x > 100) {
            System.out.println("Input an integer between 1 and 100:"); // Prompt again if out of range of 1-100
            x = input.nextInt();
        }

        // Array to store the words input by the user -> Scanner input
        String[] words = new String[x];

        // Get words from the user
        System.out.println("Input " + x + " words:");
        input.nextLine(); // Brings next input input to a below line
        for (int i = 0; i < x; i++) {
            words[i] = input.nextLine(); // Reads each word and store it in the array i
        }

        // Sorts the words based on their lengths and alphabetically
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                // Compares lengths of adjacent words, and sort alphabetically if lengths are
                // equal
                if (words[j].length() > words[j + 1].length() ||
                        (words[j].length() == words[j + 1].length() && words[j].compareTo(words[j + 1]) > 0)) {

                    // Swap the words if they are in the wrong order
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Output the sorted words
        System.out.println("\nSorted words:");
        for (String word : words) {
            System.out.print(word.length() + " letters in: ");
            System.out.print(word + "  " + "\n"); // Prints each sorted word
        }

        input.close();
    }
}
