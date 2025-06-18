import java.util.Scanner;

public class AdjacentPrimes21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three integer inputs from the user
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        // Find the highest value
        int highest = input1; // Assume input1 is the highest initially
        if (input2 > highest) {
            highest = input2;
        }
        if (input3 > highest) {
            highest = input3;
        }

        // Find the lowest value
        int lowest = input1; // Assume input1 is the lowest initially
        if (input2 < lowest) {
            lowest = input2;
        }
        if (input3 < lowest) {
            lowest = input3;
        }

        // Display the highest and lowest numbers
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        // Check and print the primes in the range from lowest to highest
        boolean foundprime = false;
        for (int i = lowest; i <= highest; i++) {
            if (IsPrime(i)) {
                foundprime = true;
                break;
            }
        }
        if (foundprime) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }

    // Method to check if a number is prime
    public static boolean IsPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Loop till the square root of the number
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // It's prime if no divisor is found
    }
}
