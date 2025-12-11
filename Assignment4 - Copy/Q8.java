import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, i = 1;
        System.out.println("Fibonacci Series:");
        while (i <= n) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}
