import java.util.Scanner;

public class ISPRIMENUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");
        int inputNum = scanner.nextInt();

        // Check if the number is prime and print the result
        if (isPrime(inputNum)) {
            System.out.println(inputNum + " is a prime number.");
        } else {
            System.out.println(inputNum + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int inputNum) {
        for (int i = 2; i < inputNum; i++) {
            if (inputNum % i == 0)
                return false;
        }
        return inputNum > 1;
    }
}
