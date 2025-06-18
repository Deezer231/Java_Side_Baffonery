import java.util.Scanner;

public class SwitchSample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 3; // 3 then it prints "Solutiongigs"
        System.out.println("Enter a message");
        String Message = sc.nextLine();

        // switch statement to check Message
        switch (number) {

            case 1:
                Message = "Hello";
                break;

            case 2:
                Message = "Welcome to";
                break;

            case 3:
                Message = "Solutiongigs";
                break;

            default:
                Message = "Sorry please try another Number";
                break;

        }
        System.out.println("Message: " + Message);
    }
}