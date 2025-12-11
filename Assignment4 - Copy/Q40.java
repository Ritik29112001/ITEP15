
import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int even = 0, odd = 0;
        while (n > 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n = n / 10;
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
