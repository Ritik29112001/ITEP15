import java.util.Scanner;

 class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of base (cm): ");
        int r = sc.nextInt();

        System.out.print("Enter polishing rate per cm²: ");
        int rate = sc.nextInt();

        float pi = 3.14f;
        int r2 = r * r;
        float area = pi * r2;
        float cost = area * rate;

        System.out.println("Base area = " + area + " cm²");
        System.out.println("Total polishing cost = ₹" + cost);
    }
}
