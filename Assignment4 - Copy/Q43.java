
import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int bin = sc.nextInt();
        int dec = 0, base = 1, rem;
        while (bin > 0) {
            rem = bin % 10;
            dec = dec + rem * base;
            base = base * 2;
            bin = bin / 10;
        }
        System.out.println("Decimal number: " + dec);
    }
}
