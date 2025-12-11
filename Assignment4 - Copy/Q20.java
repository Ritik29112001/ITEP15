import java.util.Scanner;

class Series20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print((7 * i) + " ");
            i++;
        }
    }
}
