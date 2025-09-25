import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        int i = 1, count = 0;
        while (count < n) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
