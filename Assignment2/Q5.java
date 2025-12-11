import java.util.Scanner;

 class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total fencing cost: ");
        int cost = sc.nextInt();

        System.out.print("Enter rate per meter: ");
        int rate = sc.nextInt();

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        int area = cost / rate;
        int b = area / l;
        int p = 2 * (l + b);

        System.out.println("Breadth = " + b + " m");
        System.out.println("Perimeter = " + p + " m");
        System.out.println("Area = " + area + " m²");
    }
}
