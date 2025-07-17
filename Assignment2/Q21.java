import java.util.Scanner;

 class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wall length (m): ");
        int wl = sc.nextInt();

        System.out.print("Enter wall breadth (m): ");
        int wb = sc.nextInt();

        System.out.print("Enter wall height (m): ");
        int wh = sc.nextInt();

        int wallVolume = wl * wb * wh * 1000000; // in cm³

        int brickVolume = 15 * 8 * 5; // in cm³

        int totalBricks = wallVolume / brickVolume;

        System.out.println("Bricks needed = " + totalBricks);
    }
}
