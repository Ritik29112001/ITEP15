import java.util.Scanner;

 class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius (cm): ");
        float r = sc.nextFloat();

        System.out.print("Enter height (cm): ");
        float h = sc.nextFloat();

        float pi = 3.14f;
        float area = 2 * pi * r * (h + r);

        System.out.println("Surface area = " + area + " cm²");
    }
}
