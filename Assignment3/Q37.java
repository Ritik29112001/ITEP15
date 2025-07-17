// 26. Input marks of 5 subjects and calculate grade

import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int phy = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chem = sc.nextInt();

        System.out.print("Enter marks in Biology: ");
        int bio = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int comp = sc.nextInt();

        int total = phy + chem + bio + math + comp;
        float percent = total / 5f;

        System.out.println("Percentage = " + percent + "%");

        if (percent >= 90) {
            System.out.println("Grade = A");
        } else if (percent >= 80) {
            System.out.println("Grade = B");
        } else if (percent >= 70) {
            System.out.println("Grade = C");
        } else if (percent >= 60) {
            System.out.println("Grade = D");
        } else if (percent >= 40) {
            System.out.println("Grade = E");
        } else {
            System.out.println("Grade = F");
        }
    }
}
