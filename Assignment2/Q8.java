import java.util.Scanner;

 class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter altitude (in cm): ");
        int h = sc.nextInt();

        float area = 0.8f * 10000;  // convert to cm²
        float b = (2 * area) / h;

        System.out.println("Base = " + b + " cm");
    }
}
