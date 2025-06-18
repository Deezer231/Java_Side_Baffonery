import java.util.Scanner;

public class Q2SGprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int higher = sc.nextInt();
        int sum = 0;

        for (int i = lower; i <= higher; i++) {
            if (issophieprime(i))
                sum = sum + i;

        }
        System.out.println(sum);

    }

    public static boolean IsPrime(int inputnum) {
        for (int i = 2; i < inputnum; i++) {
            if (inputnum % i == 0)
                return false;
        }

        return true;
    }

    public static boolean issophieprime(int inputnum) {
        if (!IsPrime(inputnum))
            return false;
        int sophienum = inputnum * 2 + 1;
        return IsPrime(sophienum);
    }
}