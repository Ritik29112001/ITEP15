import java.util.Scanner;

 class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floorLength = 800;
        int floorBreadth = 900;

        System.out.print("Enter side of tile (cm): ");
        int side = sc.nextInt();

        int floorArea = floorLength * floorBreadth;
        int tileArea = side * side;

        int totalTiles = floorArea / tileArea;

        System.out.println("Tiles needed = " + totalTiles);
    }
}
