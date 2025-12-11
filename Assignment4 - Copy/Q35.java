
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println("Total digits: " + count);
    }
}
