import java.util.Scanner;

  class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter one leg: ");
        int a = sc.nextInt();

        System.out.print("Enter area: ");
        int area = sc.nextInt();

        int b = (2 * area) / a;

        System.out.println("Other leg = " + b + " cm");
    }
}
