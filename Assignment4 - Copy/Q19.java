import java.util.Scanner;

class Series19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 1;
        double sum = 0;
        while (i <= n) {
            sum = sum + (1.0 / i);
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
