import java.util.Scanner;

 class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Shelly's garden: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of Shelly's garden: ");
        int b = sc.nextInt();

        System.out.print("Enter side of Rachel's square garden: ");
        int s = sc.nextInt();

        int shelly = l * b;
        int rachel = s * s;

        int diff = shelly - rachel;

        System.out.println("Shelly's Area = " + shelly + " m²");
        System.out.println("Rachel's Area = " + rachel + " m²");
        System.out.println("Difference = " + diff + " m²");
    }
}
