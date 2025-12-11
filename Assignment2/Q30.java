import java.util.Scanner;

 class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floorLength = 200;
        int floorBreadth = 400;

        System.out.print("Enter tile length (cm): ");
        int tl = sc.nextInt();

        System.out.print("Enter tile breadth (cm): ");
        int tb = sc.nextInt();

        int tileArea = tl * tb;
        int floorArea = floorLength * floorBreadth;

        int tiles = floorArea / tileArea;

        System.out.println("Tiles needed = " + tiles);
    }
}
