
import java.util.Scanner;

class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int sq = i * i;
            int cube = i * i * i;
            int j = 1;
            int sqrt = 0;
            while (j * j <= i) {
                sqrt = j;
                j++;
            }
            System.out.println(i + " Square=" + sq + " Cube=" + cube + " Sqrt=" + sqrt);
            i++;
        }
    }
}
