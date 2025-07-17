import java.util.Scanner;
 class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the board: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of the board: ");
        int b = sc.nextInt();

        int ribbon = 2 * (l + b);

        System.out.println("Ribbon length = " + ribbon + " m");
    }
}
