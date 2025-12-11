// 5. Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age  first person: ");
        int a1 = sc.nextInt();

        System.out.print("Enter age  second person: ");
        int a2 = sc.nextInt();

        System.out.print("Enter age  third person: ");
        int a3 = sc.nextInt();

        int oldest = a1;
        if (a2 > oldest) {
            oldest = a2;
        }
        if (a3 > oldest) {
            oldest = a3;
        }

        int youngest = a1;
        if (a2 < youngest) {
            youngest = a2;
        }
        if (a3 < youngest) {
            youngest = a3;
        }

        System.out.println("Oldest age = " + oldest);
        System.out.println("Youngest age = " + youngest);
    }
}
