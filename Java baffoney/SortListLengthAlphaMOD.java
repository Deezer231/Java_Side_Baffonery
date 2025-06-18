
import java.util.Scanner;

public class SortListLengthAlphaMOD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of words, between the range of 1 to 100
        System.out.println("Input an integer between 1 and 100");
        int x = scanner.nextInt();

        // Ensures the user inputs a valid number between 1 and 100
        while (x < 1 || x > 100) {
            System.out.println("Input an integer between 1 and 100:");
            x = scanner.nextInt(); // Read the new input
        }

        // Make Array to store the words input by the user
        String[] words = new String[x];

        // Get words from the user
        System.out.println("Input " + x + " words:");
        scanner.nextLine(); // /n the new input from Scannner
        for (int i = 0; i < x; i++) {
            words[i] = scanner.nextLine(); // Read each word and store it in the array
        }

        // Call the sorting method
        stringSorter(x, words);

        // Output the sorted words
        System.out.println("\nSorted words:");
        for (String word : words) {
            System.out.println(word); // Print each sorted word
        }

        scanner.close();
    }

    // Method to sort the array of strings created by user input -> INPUT
    public static void stringSorter(int n, String[] arrayOfStrings) { // MOD
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Sort by length from longest to shortest THEN If lengths are equal(e.g one,
                // two)-> sort alphabetically
                if (arrayOfStrings[j].length() < arrayOfStrings[j + 1].length() ||
                        (arrayOfStrings[j].length() == arrayOfStrings[j + 1].length() &&
                                arrayOfStrings[j].compareTo(arrayOfStrings[j + 1]) > 0)) {

                    // Swap the strings if they are in the wrong order
                    String temp = arrayOfStrings[j];
                    arrayOfStrings[j] = arrayOfStrings[j + 1];
                    arrayOfStrings[j + 1] = temp;
                }
            }
        }
    }
}
