import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1, fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial = " + fact);
    }
}
