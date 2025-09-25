
import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int a = sc.nextInt();
        System.out.print("Enter end number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int n = i, rev = 0;
            int temp = n;
            while (n > 0) {
                rev = rev * 10 + (n % 10);
                n = n / 10;
            }
            if (rev == temp) {
                System.out.println(temp + " is a Palindrome");
            }
        }
    }
}
