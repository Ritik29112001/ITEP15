// 13. Write a program that takes a number from user and prints day name (1 to 7).
// Input: 3 → Output: Wednesday

import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 7): ");
        int n = sc.nextInt();

        /*if (n == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else if (n == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input");
        }*/
       switch (n) {
       case 1: System.out.println("Monday"); break;
       case 2:System.out.println("Tuesday");break;
       case 3:System.out.println("Wednsday"); break;
       case 4:System.out.println("Thuesday");break;
       case 5:System.out.println("Friday");break;
       case 6:System.out.println("Saturday");break;
       case 7:System.out.println("Sunday");break;
       default : System.out.println("Invalid");break;
       
       }
    }
}
