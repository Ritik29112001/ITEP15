import java.util.Scanner;

  class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of pond: ");
        int l = sc.nextInt();

        System.out.print("Enter width of pond: ");
        int w = sc.nextInt();

        System.out.print("Enter depth of pond: ");
        int d = sc.nextInt();

        int volume = l * w * d;

        System.out.println("Pond capacity = " + volume + " m³");
    }
}
