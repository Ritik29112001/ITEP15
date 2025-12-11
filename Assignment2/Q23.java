import java.util.Scanner;

 class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = 3;
        int boxVol = side * side * side;

        System.out.print("Enter carton length: ");
        int l = sc.nextInt();

        System.out.print("Enter carton breadth: ");
        int b = sc.nextInt();

        System.out.print("Enter carton height: ");
        int h = sc.nextInt();

        int cartonVol = l * b * h;

        int count = cartonVol / boxVol;

        System.out.println("Boxes that fit = " + count);
    }
}
