
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0, rem, temp;
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
