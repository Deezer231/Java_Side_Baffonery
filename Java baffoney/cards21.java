import java.util.Random;

public class cards21 {
    public static void main(String[] args) {
        Random ran = new Random();
        int success = 0;

        for (int x = 0; x < 1000; x++) {
            int roll1 = ran.nextInt(6) + 1;
            int roll2 = ran.nextInt(6) + 1;
            int roll3 = ran.nextInt(6) + 1;

            if (roll1 == 1 && roll2 == 3 && roll3 == 5) {
                success++;
            }
        }
        double monteprob = ((double) success / 1000) * 100;
        System.out.println(monteprob);
    }
}