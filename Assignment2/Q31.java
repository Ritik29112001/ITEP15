import java.util.Scanner;

 class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of the square (m): ");
        int p = sc.nextInt();

        int side = p / 4;
        int area = side * side;

        System.out.println("Side = " + side + " m");
        System.out.println("Area = " + area + " m²");
    }
}
