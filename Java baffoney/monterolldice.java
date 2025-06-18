import java.util.Random;
//import java.util.Math;

public class monterolldice {
    public static void main(String[] args) {
        int trails = 1000;
        Random ran = new Random();
        int success = 0;

        for (int i = 0; i < trails; i++) {
            int roll1 = ran.nextInt(6) + 1;
            int roll2 = ran.nextInt(6) + 1;
            int sum = roll1 + roll2;

            if (sum == 7 || sum == 11) {
                success++;
            }
        }
        double montecarloprob = ((double) success / trails) * 100;
        int prob = ((int) Math.round(montecarloprob));
        System.out.println(prob);

    }
}