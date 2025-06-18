import java.util.*;

public class AdjacentPrimes {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
   
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
          public static boolean IsPrime(int inputNum)
          {
            for (int i = lowest; i < highest; i++;){
            if (inputNum % i == 0) return false;
          }
          return true;
        }
         
    }
}