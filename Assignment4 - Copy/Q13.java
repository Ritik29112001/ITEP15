import java.util.Scanner;

class ReverseNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
