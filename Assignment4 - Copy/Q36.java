
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
