
import java.util.Scanner;

class Q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int a = sc.nextInt();
        System.out.print("Enter end number: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + " is Prime");
            }
        }
    }
}
