
import java.util.Scanner;

public class String265Processing {
    public static void main(String[] args) {
        char[] a = new char[20];
        int x, i;
        String c, response;
        boolean found;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer between 1 and 20");
        x = sc.nextInt();
        while ((x < 1) || (x > 20)) {
            System.out.println("Input an integer between 1 and 20");
            x = sc.nextInt();
        }
        System.out.println("Input " + x + " characters");
        Scanner scChar = new Scanner(System.in);
        for (i = 0; i < x; i++) {
            a[i] = scChar.nextLine().charAt(0);
        }
        do {
            System.out.println("Input character to be searched for:");
            c = sc.next();
            found = false;
            i = 0;
            while ((!found) && (i < x)) {
                if (a[i] == c.charAt(0))
                    found = true;
                else
                    i = i + 1;
            }
            if (found)
                System.out.println("Character " + c + " appears at position " + i);
            else
                System.out.println("Character " + c + " does not occur in the string");

            System.out.println("Search for another character? [y/n]");
            response = sc.next();
        } while (!((response.charAt(0) == 'N') || (response.charAt(0) == 'Y')));
    }
}