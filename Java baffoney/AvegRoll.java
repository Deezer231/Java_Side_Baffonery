import java.util.Random;

public class AvegRoll {
    public static void main(String[] args) {
        Random ran = new Random();
        int success = 0;
        int trails = 1000;

        for (int x = 0; x < trails; x++) {
            int roll1 = ran.nextInt(6) + 1;
            int roll2 = ran.nextInt(6) + 1;
            int roll3 = ran.nextInt(6) + 1;
            int roll4 = ran.nextInt(6) + 1;
            int roll5 = ran.nextInt(6) + 1;
            int roll6 = ran.nextInt(6) + 1;

            if (roll1 == 1 && roll2 == 2 && roll3 == 3 && roll4 == 4 && roll5 == 5 && roll6 == 6) {
                success++;
            }
            double monteprob = ((double) success / 1000) * 100.0;
            System.out.println(monteprob);
        }
    }
}