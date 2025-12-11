import java.util.Scanner;

 class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int brickL = 25;
        int brickB = 10;
        int brickH = 8; // approx 7.5 rounded to 8

        int brickVol = brickL * brickB * brickH;

        System.out.print("Enter wall length (m): ");
        float wl = sc.nextFloat();

        System.out.print("Enter wall height (m): ");
        float wh = sc.nextFloat();

        System.out.print("Enter wall thickness (m): ");
        float wt = sc.nextFloat();

        float wallVol = wl * wh * wt * 1000000; // convert to cm³

        int bricks = (int)(wallVol / brickVol);

        float cost = (bricks / 1000.0f) * 900;

        System.out.println("Bricks needed = " + bricks);
        System.out.println("Total cost = ₹" + cost);
    }
}
