// 13. Program to perform arithmetic operation using switch case

import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: +, -, *, /,%");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;
            case '-':
                System.out.println("Difference = " + (a - b));
                break;
            case '*':
                System.out.println("Product = " + (a * b));
                break;
            case '/':
                System.out.println("Quotient = " + (a / b));
                break;
            case '%':
                System.out.println("Mode = " + (a % b));
            default:
                System.out.println("Invalid operator");
        }
    }
}
