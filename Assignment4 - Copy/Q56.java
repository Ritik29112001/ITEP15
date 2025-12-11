
import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int a = sc.nextInt();
        System.out.print("Enter end number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int fact = 1;
            int j = 1;
            while (j <= i) {
                fact = fact * j;
                j++;
            }
            System.out.println("Factorial of " + i + " is " + fact);
        }
    }
}
