import java.util.Scanner;

 class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the brick: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of the brick: ");
        int b = sc.nextInt();

        System.out.print("Enter height of the brick: ");
        int h = sc.nextInt();

        int v = l * b * h;

        System.out.println("Volume = " + v + " cm³");
    }
}
