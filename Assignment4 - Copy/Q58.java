
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        int bin = 0, place = 1;

        while (n > 0) {
            int r = n % 2;
            bin = bin + (r * place);
            place = place * 10;
            n = n / 2;
        }
        System.out.println("Binary: " + bin);
    }
}
