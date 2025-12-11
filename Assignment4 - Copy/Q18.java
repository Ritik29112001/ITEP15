import java.util.Scanner;

class Series18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 1;
        int term = 1;
        while (i <= n) {
            System.out.print(term + " ");
            term = term * i;
            i++;
        }
    }
}
