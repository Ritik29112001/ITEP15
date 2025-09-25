
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int a = sc.nextInt();
        System.out.print("Enter end year: ");
        int b = sc.nextInt();

        System.out.println("Leap years between " + a + " and " + b + ":");
        for (int i = a; i <= b; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i);
            }
        }
    }
}
