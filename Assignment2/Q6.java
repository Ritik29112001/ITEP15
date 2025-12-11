import java.util.Scanner;

  class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter perimeter: ");
        int p = sc.nextInt();

        int c = p - a - b;
        int s = p / 2;

        int area2 = s * (s - a) * (s - b) * (s - c);

        System.out.println("Third side = " + c + " cm");
        System.out.println("Area² (before sqrt) = " + area2 + " cm⁴");
    }
}
