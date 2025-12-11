// 7. A student will not be allowed to sit in exam if attendance is less than 75%.
// Take input: classes held and attended. Print percentage and eligibility.

import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes Miss: ");
        int Miss = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attended = sc.nextInt();

        float percent = (attended * 100f) / Miss;

        System.out.println("Attendance percentage = " + percent + "%");

        if (percent >= 75) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }
    }
}
