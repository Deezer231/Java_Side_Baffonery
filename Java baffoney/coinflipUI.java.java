import java.util.*;

public class MoviePicker {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int heads = 0;
        int trails = sc.nextInt();

        for (int x = 0; x < trails; x++) {
            int coin = ran.nextInt(2) + 1;
            if (coin == 1) {
                heads++;
            }
        }
        double montecarloprob = ((double) heads / trails) * 100;
        System.out.println(montecarloprob);
    }

}