import java.util.Scanner;

 class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base1 (m): ");
        int base1 = sc.nextInt();

        System.out.print("Enter base2 (m): ");
        int base2 = sc.nextInt();

        System.out.print("Enter height (m): ");
        int h = sc.nextInt();

        System.out.print("Enter walkway width (m): ");
        int w = sc.nextInt();

        int trapezoidArea = (base1 + base2) * h / 2;
        int walkwayArea = w * h;
        int totalArea = trapezoidArea + walkwayArea;

        System.out.println("Total area after walkway = " + totalArea + " m²");
    }
}
