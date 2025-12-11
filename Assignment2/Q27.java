import java.util.Scanner;

 class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room length (m): ");
        int l = sc.nextInt();

        System.out.print("Enter room breadth (m): ");
        int b = sc.nextInt();

        System.out.print("Enter rate per square meter: ");
        int rate = sc.nextInt();

        int area = l * b;
        int cost = area * rate;

        System.out.println("Total cost = ₹" + cost);
    }
}
