import java.util.Scanner;

  class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area: ");
        int area = sc.nextInt();

        int x2 = (area * 2) / (8 * 5);
        int base = 8 * x2;
        int height = 5 * x2;

        System.out.println("Base = " + base + " m");
        System.out.println("Height = " + height + " m");
    }
}
