import java.util.Scanner;

 class Q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter surface area (cm²): ");
        int sa = sc.nextInt();

        System.out.print("Enter height (cm): ");
        int h = sc.nextInt();

        System.out.print("Enter radius you want to try (cm): ");
        int r = sc.nextInt();

        float pi = 3.14f;
        float area = 2 * pi * r * (h + r);
        int d = 2 * r;

        System.out.println("Calculated surface area = " + area + " cm²");
        System.out.println("Diameter = " + d + " cm");
    }
}
