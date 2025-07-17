// 8. Modify above question to allow student to sit if medical cause is true.
// Ask for classes held, attended, and medical cause ('Y' or 'N')

import java.util.Scanner;

class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes Miss: ");
        int miss = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attended = sc.nextInt();

        System.out.print("Do you have medical cause? (Y/N): ");
        char medical = sc.next().charAt(0);

        float percent = (attended * 100f) / miss;

        System.out.println("Attendance percentage = " + percent + "%");

        if (percent >= 75 || medical == 'Y' ) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }
    }
}
