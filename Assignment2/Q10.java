import java.util.Scanner;

  class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter equal side: ");
        int a = sc.nextInt();

        int area = (a * a) / 2;

        System.out.println("Area = " + area + " cm²");
    }
}
