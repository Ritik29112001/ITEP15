import java.util.Scanner;

  class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter area: ");
        int area = sc.nextInt();

        int height = (2 * area) / base;

        System.out.println("Height = " + height + " cm");
    }
}
