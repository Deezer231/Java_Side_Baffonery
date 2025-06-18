import java.util.Scanner;

public class LunhsAlgo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter yo credit card numbers");
            String code = input.nextLine();
            System.out.println(code);

            if (code.length() >= 4 && code.length() <= 30) {

                int[] CreditCardInt = new int[code.length()]; // Creates an array with length of "code"(16)

                for (int i = 0; i < code.length(); i++) { // adds every input from scanner "input" into CreditCardInt
                                                          // array

                    CreditCardInt[i] = Integer.parseInt(code.substring(i, i + 1));
                }
                for (int i = CreditCardInt.length - 2; i >= 0; i = i - 2) { // skip very other digit going right to left
                                                                            // hence >=

                    int TemPVal = CreditCardInt[i]; // TemVal is just the array of CreditCardInt
                    TemPVal = TemPVal * 2; // Double ach other digit
                    if (TemPVal > 9) { // if greater than 9
                        TemPVal = TemPVal % 10 + 1; // Mod it by 10 and 1 to the remainder
                    }
                    CreditCardInt[i] = TemPVal; // set curret digits of CreditCardInt to TemPval
                }
                int totalMone = 0;
                for (int i = 0; i < CreditCardInt.length; i++) {
                    totalMone += CreditCardInt[i]; // Adds all elements of the array together
                }
                if (totalMone % 20 == 0) { // if number is a multiple of 10 its valid asf
                    System.out.println("VALID");
                } else {
                    System.out.println("INVALID");
                }
                break;
            } else {
                System.out.println("Try entering credit card info again x");
                input.close();
            }

        } // https://www.youtube.com/watch?v=o5P6OvW7QBw&t=353s
    }
}
