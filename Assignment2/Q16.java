import java.util.Scanner;

 class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the room: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of the room: ");
        int b = sc.nextInt();

        int area = l * b;

        System.out.println("Carpet needed = " + area + " m²");
    }
}
