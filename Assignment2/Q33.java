import java.util.Scanner;

  class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter garden length (m): ");
        int l = sc.nextInt();

        System.out.print("Enter garden breadth (m): ");
        int b = sc.nextInt();

        System.out.print("Enter width of path1 (m): ");
        int w1 = sc.nextInt();

        System.out.print("Enter width of path2 (m): ");
        int w2 = sc.nextInt();

        int totalArea = l * b;
        int pathArea = (l * w1) + (b * w2) - (w1 * w2);
        int usableArea = totalArea - pathArea;

        System.out.println("Total area = " + totalArea + " m²");
        System.out.println("Usable area = " + usableArea + " m²");
    }
}
