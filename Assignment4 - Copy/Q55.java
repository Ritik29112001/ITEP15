
import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int a = sc.nextInt();
        System.out.print("Enter end number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is Odd");
            }
        }
    }
}
