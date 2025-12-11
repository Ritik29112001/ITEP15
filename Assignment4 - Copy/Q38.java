
import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + (r * r * r);  
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
