import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Nterm;

        // Outer loop to ensure valid input until a valid Nth term is provided
        while (true) {
            System.out.println("Enter your Nth Term (between 1 and 1000):");
            Nterm = input.nextInt();
            int num = 1;
            int count = 0;
            int i = 0;
            // int counter = 0;

            // Continue calculating prime numbers until the Nth is found
            while (count < Nterm) { // Loop until number of found primes is less than desired Nth term

                num = num + 1; // Increment num to check the next number if its a prime

                // Check if num is prime
                for (i = 2; i <= num; i++) { // Loop from 2 to num to check for factors
                    if (num % i == 0) { // Checks if num is divisable by i
                        break; // NotPrimeNum Exit loop

                    }
                }

                if (i == num) { // If num == i (shizs prime)
                    count = count + 1; // plus one to prime count
                    System.out.println("The prime numbers before the " + Nterm + "th prime number is " + num);

                }

                // Check if num is within the valid range [1, 1000)
                if (num >= 1000 && num <= 1) {
                    System.out.println("INVALID INPUT - Enter a valid number");
                    break; // Exit the inner loop to re-prompt for Nterm
                }

            }

            // If the Nth prime is found and within the valid range, print it out
            if (count == Nterm && num < 1000) {
                System.out.println("The " + Nterm + "th prime number is: " + num);
                System.out.println("The number of steps before " + num + "th prime number is: " + Nterm);
                break; // Exit the outer loop
            }

        }
        input.close();
    }
}
