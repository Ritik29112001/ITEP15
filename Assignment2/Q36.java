import java.util.Scanner;

class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter (m): ");
        float d = sc.nextFloat();

        System.out.print("Enter height (m): ");
        float h = sc.nextFloat();

        float r = d / 2;
        float pi = 3.14f;
        float area = 2 * pi * r * (h + r);

        System.out.println("Surface area = " + area + " m²");
    }
}
