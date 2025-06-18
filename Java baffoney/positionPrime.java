import java.util.Scanner;

public class positionPrime {

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to find the xth prime number
    private static int findXthPrime(int x) {
        int count = 0;
        int number = 1;

        while (count < x) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        if (x <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = findXthPrime(x);
            System.out.println("The " + x + "th prime number is: " + result);
        }

        scanner.close();
    }
}
