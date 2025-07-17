import java.util.Scanner;

 class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter carpet length (m): ");
        int l = sc.nextInt();

        System.out.print("Enter carpet breadth (m): ");
        int b = sc.nextInt();

        System.out.print("Enter rate per square meter: ");
        int rate = sc.nextInt();

        int area = l * b;
        int price = area * rate;

        System.out.println("Total price = ₹" + price);
    }
}
