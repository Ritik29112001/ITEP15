import java.util.Scanner;

class Series16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 1;
        int term = -6;
        while (i <= n) {
            System.out.print(term + " ");
            term = term + 3;
            i++;
        }
    }
}
