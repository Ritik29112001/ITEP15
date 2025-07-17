import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of brick (cm): ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of brick (cm): ");
        int b = sc.nextInt();

        int area = 100 * l * b;

        System.out.println("Total path area = " + area + " cm²");
    }
}
