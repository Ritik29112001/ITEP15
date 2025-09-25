import java.util.Scanner;

class EvenSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int i = 0;
        int count = 0;
        while (count < n) {
            System.out.print((i * i) + " ");
            i += 2; // next even number
            count++;
        }
    }
}
