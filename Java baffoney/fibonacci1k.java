
public class fibonacci1k {
    public static void main(String[] args) {
        int term = 1000;
        long a = 1;
        long b = 2;
        long c = 0;

        for (int i = 3; i <= term; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The 1000th term is: " + c);
    }
}