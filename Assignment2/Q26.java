import java.util.Scanner;

 class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path length in meters: ");
        float pathLength = sc.nextFloat();

        System.out.print("Enter path breadth in meters: ");
        float pathBreadth = sc.nextFloat();

        int brickLength = 24;
        int brickBreadth = 15;

        float pathArea = pathLength * pathBreadth * 10000; // m² to cm²
        int brickArea = brickLength * brickBreadth;

        int totalBricks = (int)(pathArea / brickArea);

        System.out.println("Total bricks needed = " + totalBricks);
    }
}
