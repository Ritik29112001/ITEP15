import java.util.Scanner;

class Squares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print((i * i) + " ");
            i++;
        }
    }
}
