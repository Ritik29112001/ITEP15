
import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int last = n % 10;
        int first = n;
        while (first >= 10) {
            first = first / 10;
        }
        int sum = first + last;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
