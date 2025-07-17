// 24. Count number of notes (100, 50, 10)

import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        int n100 = amount / 100;
        amount = amount % 100;

        int n50 = amount / 50;
        amount = amount % 50;

        int n10 = amount / 10;
        amount = amount % 10;

        System.out.println("100 Rs notes = " + n100);
        System.out.println("50 Rs notes = " + n50);
        System.out.println("10 Rs notes = " + n10);
        System.out.println("Remaining amount = " + amount);
    }
}
