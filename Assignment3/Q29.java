// 18. Check even or odd without using %

import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if ((n & 1) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
