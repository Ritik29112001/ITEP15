import java.util.Scanner;

 class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tile length: ");
        int tl = sc.nextInt();

        System.out.print("Enter tile breadth: ");
        int tb = sc.nextInt();

        int floor = 520 * 140;
        int tile = tl * tb;
        int tiles = floor / tile;

        System.out.println("Tiles needed = " + tiles);
    }
}
