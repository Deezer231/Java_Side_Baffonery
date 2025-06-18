import java.util.Random;

public class q2monte {
    public static void main(String[] args) {
        int success = 0;
        Random ran = new Random();
        int trails = 1000;
        for (int x = 0; x < trails; x++) {
            int dice1 = ran.nextInt(6) + 1;
            int dice2 = ran.nextInt(6) + 1;
            int sum = dice1 + dice2;
            if (sum == 7 || sum == 11) {
                success++;
            }
        }
        double monteprob = ((double) success / trails) * 100.0;
        int monteprob1 = ((int) (Math.round(monteprob)));
        System.out.println(monteprob1);
    }
}