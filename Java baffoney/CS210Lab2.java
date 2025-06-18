import java.util.Scanner;

//The Collatz Sequence
public class CS210Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Positive Number");
        int input = sc.nextInt();
        int counter = Regression(input);
        System.out.println("Steps taken to get to 1 was " + counter);
    }

    public static int Regression(int number) {
        int counter = 0;

        while (number > 1) {
            if (number % 2 == 0) {
                // System.out.println("The numbers before was " + number);
                number = number / 2;
                System.out.println("The numbers before was " + number);

            } else {
                number = (number * 3) + 1;
                System.out.println(number);
            }
            counter++;
        }
        return counter + 1;
    }
}
