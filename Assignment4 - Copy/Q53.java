
import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i, sum = 0;
            while (n > 0) {
                int r = n % 10;
                int fact = 1;
                int j = 1;
                while (j <= r) {
                    fact = fact * j;
                    j++;
                }
                sum = sum + fact;
                n = n / 10;
            }
            if (sum == i) {
                System.out.println(i + " is a Strong Number");
            }
        }
    }
}
