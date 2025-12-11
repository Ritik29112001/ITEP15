import java.util.Scanner;

  class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diagonal: ");
        int d = sc.nextInt();

        System.out.print("Enter height1: ");
        int h1 = sc.nextInt();

        System.out.print("Enter height2: ");
        int h2 = sc.nextInt();

        int area = (d * (h1 + h2)) / 2;

        System.out.println("Area = " + area + " m²");
    }
}
