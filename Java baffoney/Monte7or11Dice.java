import java.util.Random;

public class Monte7or11Dice {
  public static void main(String[] args) {
    int success = 0;
    Random random = new Random();

    int num;

    for (int x = 0; x < 1000; x++) {
      int dice1 = random.nextInt(6) + 1;
      int dice2 = random.nextInt(6) + 1;
      int sum = dice1 + dice2;
      if (sum == 7 || sum == 11) {
        success++;
      }
      // System.out.println(success);
    }
    double monteprob = ((double) success / 1000) * 100;

    System.out.println(monteprob);
  }

}
