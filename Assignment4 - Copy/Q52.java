
import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i;
            int temp = n, sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum = sum + (r * r * r); // only for 3-digit
                n = n / 10;
            }
            if (sum == temp) {
                System.out.println(temp + " is an Armstrong Number");
            }
        }
    }
}
