import java.util.Scanner;

 class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume (cm³): ");
        int v = sc.nextInt();

        System.out.print("Enter radius (cm): ");
        int r = sc.nextInt();

        float pi = 3.14f;

        int r2 = r * r;
        int h = v / (int)(pi * r2);
        float area = 2 * pi * r * (h + r);

        System.out.println("Height = " + h + " cm");
        System.out.println("Surface area = " + area + " cm²");
    }
}
