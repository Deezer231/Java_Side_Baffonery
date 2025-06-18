import java.util.Random;
import java.util.Scanner;

public class sameroll {
    public static void main(String[] args) {
        Random ran = new Random();
        int success = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter how many times you want the operation to run: ");
        int input = sc.nextInt();
        System.out.println("the operation will run " + input + " times");

        for (int x = 0; x < input; x++) {
            int dice1 = ran.nextInt(6) + 1;
            int dice2 = ran.nextInt(6) + 1;

            if (dice1 == dice2) {
                success++;
            }
        }
        double monteprob = ((double) success / 1000) * 100;
        System.out.println("The probability of you getting the same number on 2 dice rolls is: " + monteprob);
        sc.close();
    }
}
