// 14. Write a program to accept percentage and display grade:
// >90 - A, >80 to 90 - B, >=60 to 80 - C, below 60 - D

import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("Grade = A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade = B");
        } else if (marks >= 60 && marks <= 80) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = D");
        }
    }
}
