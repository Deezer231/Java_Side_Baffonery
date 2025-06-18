import java.util.*;

public class coinflipUI {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int tails = 0;
        int N = sc.nextInt();
        int T = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            int coin = ran.nextInt(2) + 1;

            if (coin == 2 && tails <= T) // tails = 2
            {
                tails++;
            }
        }

        double montecarloprob = ((double) tails / N) * 100;
        System.out.println(montecarloprob);
    }
}
