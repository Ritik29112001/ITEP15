// 17. Check sign of given number

import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Positive");
        } 
          else (n < 0) {
            System.out.println("Negative");
        } 
            
        
    }
}
