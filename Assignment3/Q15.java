// 15. Write a java program to accept the cost price of a bike
// and display the road tax to be paid according to the following criteria:
// Cost Price > 100000       → 15% tax
// >50000 and <=100000       → 10% tax
// <=50000                   → 5% tax

import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price of the bike: ");
        int cost = sc.nextInt();

        float tax;

        if (cost > 100000) {
            tax = cost * 15 / 100f;
        } else if (cost > 50000 && cost <= 100000) {
            tax = cost * 10 / 100f;
        } else {
            tax = cost * 5 / 100f;
        }

        System.out.println("Road tax to be paid = ₹" + tax);
    }
}
