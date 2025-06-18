import java.util.Scanner;

public class CovertingVariables {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose A Number");
        int i = scan.nextInt();
        System.out.println("Choose A Double");
        double d = scan.nextDouble();
        System.out.println("Choose A word");
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("Your String Is : " + s);
        System.out.println("Your Double Is : " + d);
        System.out.println("Your Int Is : " + i);
    }
}