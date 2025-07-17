import java.util.Scanner;

 class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter term number (n): ");
        int n = sc.nextInt();

        int term = a + (n - 1) * d;

        System.out.println("Term number " + n + " = " + term);
    }
}
