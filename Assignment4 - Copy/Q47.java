
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        while (start <= end) {
            System.out.println("Table of " + start + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(start + " x " + i + " = " + (start * i));
            }
            start++;
            System.out.println();
        }
    }
}
