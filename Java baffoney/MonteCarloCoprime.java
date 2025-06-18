import java.util.Random;

public class MonteCarloCoprime {

    // Function to calculate the Greatest Common Divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        // Apply Euclidean algorithm to find the GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int trials = 1000000; // Number of Monte Carlo trials
        int coprimeCount = 0; // Count of pairs that are coprime

        Random random = new Random(); // Random number generator

        // Run the Monte Carlo simulation
        for (int i = 0; i < trials; i++) {
            // Generate two random integers between 1 and 1000
            int num1 = random.nextInt(1000) + 1; // Random number between 1 and 1000
            int num2 = random.nextInt(1000) + 1; // Random number between 1 and 1000

            // Check if the two numbers are coprime (GCD should be 1)
            if (gcd(num1, num2) == 1) {
                coprimeCount++; // Increment the count if they are coprime
            }
        }

        // Calculate the probability that two randomly selected numbers are coprime
        double probability = (double) coprimeCount / trials;
        // Print the result
        System.out.println("Estimated probability that two randomly selected numbers are coprime: " + probability);
    }
}
