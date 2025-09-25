import java.util.Scanner;

class Series17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 1, term = 1, diff = 1;
        while (i <= n) {
            System.out.print(term + " ");
            diff = diff + 1;
            term = term + diff;
            i++;
        }
    }
}
