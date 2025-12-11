
import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i, rev = 0;
            while (n > 0) {
                rev = rev * 10 + (n % 10);
                n = n / 10;
            }
            System.out.println("Reverse of " + i + " is " + rev);
        }
    }
}
